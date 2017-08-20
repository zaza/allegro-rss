package com.github.zaza.allegro;

import static com.google.common.base.Preconditions.checkState;

import java.rmi.RemoteException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.xml.rpc.ServiceException;

import org.apache.axis.encoding.Base64;
import org.apache.commons.codec.digest.DigestUtils;

import com.allegro.webapi.ArrayOfFilteroptionstype;
import com.allegro.webapi.ArrayOfLong;
import com.allegro.webapi.DoGetItemsInfoRequest;
import com.allegro.webapi.DoGetItemsInfoResponse;
import com.allegro.webapi.DoGetItemsListRequest;
import com.allegro.webapi.DoGetItemsListResponse;
import com.allegro.webapi.DoLoginEncRequest;
import com.allegro.webapi.DoQuerySysStatusRequest;
import com.allegro.webapi.ItemInfoStruct;
import com.allegro.webapi.ItemsListType;
import com.allegro.webapi.ServicePort_PortType;
import com.allegro.webapi.ServiceServiceLocator;
import com.github.zaza.Env;
import com.google.common.base.Charsets;
import com.google.common.collect.Range;

import spark.Request;

public class AllegroClient {

	protected static final int POLAND = 1;

	static final int WEBAPI_VERSION_KEY = 1490695471;

	private static final int ITEMS_LIST_MAX_RESULT_SIZE = 1000;

	/*
	 * http://allegro.pl/webapi/documentation.php/show/id,52#method-input
	 */
	private static final int ITEMS_INFO_MAX_RESULT_SIZE = 25;

	private String login;
	private String password;
	protected String webApiKey;
	protected ServicePort_PortType allegro;

	private String sessionHandle;

	public AllegroClient(String webApiKey) throws ServiceException, RemoteException {
		this.login = System.getenv().get(Env.ALLEGRO_LOGIN);
		this.password = System.getenv().get(Env.ALLEGRO_PASSWORD);
		this.webApiKey = webApiKey;

		ServiceServiceLocator service = new ServiceServiceLocator();
		allegro = service.getservicePort();
		login();
	}

	protected long getVersionKey() throws RemoteException {
		long latestVersionKey = getLatestVersionKey();
		if (WEBAPI_VERSION_KEY != latestVersionKey) {
			System.out.println("The webapi version key is out-dated! Continuing with the latest version.");
			return latestVersionKey;
		}
		return WEBAPI_VERSION_KEY;
	}

	protected long getLatestVersionKey() throws RemoteException {
		System.out.print("Receving key version... ");
		long verKey = allegro.doQuerySysStatus(new DoQuerySysStatusRequest(1, POLAND, webApiKey)).getVerKey();
		System.out.println("done. Latest version key=" + verKey);
		return verKey;
	}

	private void login() throws RemoteException {
		sessionHandle = allegro
				.doLoginEnc(
						new DoLoginEncRequest(login, encryptAndEncodePassword(), POLAND, webApiKey, getVersionKey()))
				.getSessionHandlePart();
	}

	public SearchResult search(Request req) throws RemoteException {
		FilterBuilder builder = FilterBuilder.search(req.queryParams("string"));
		String priceFrom = req.queryParams("price_from");
		String priceTo = req.queryParams("price_to");
		if (priceFrom == null && priceTo != null)
			builder.price(Range.atMost(Integer.valueOf(priceTo)));
		if (priceFrom != null && priceTo == null)
			builder.price(Range.atLeast(Integer.valueOf(priceTo)));
		if (priceFrom != null && priceTo != null)
			builder.price(Range.closed(Integer.valueOf(priceFrom), Integer.valueOf(priceTo)));
		if (req.queryParams("buyUsed") != null)
			builder.condition(false);
		if (req.queryParams("buyNew") != null)
			builder.condition(true);
		if (req.queryParams("category") != null)
			builder.category(Integer.parseInt(req.queryParams("category")));
		ArrayOfFilteroptionstype filter = builder.build();
		List<Item> items = search(filter);
		return new SearchResult(req, builder.getDescription(), items);
	}

	List<Item> search(ArrayOfFilteroptionstype filter) throws RemoteException {
		checkState(sessionHandle != null);
		int offset = 0;
		List<Item> result = new ArrayList<>();
		while (search(filter, result, offset, ITEMS_LIST_MAX_RESULT_SIZE)) {
			offset += ITEMS_LIST_MAX_RESULT_SIZE;
		}
		return result;
	}

	private boolean search(ArrayOfFilteroptionstype filter, List<Item> result, int offset, int size)
			throws RemoteException {
		DoGetItemsListResponse itemsListResponse = allegro.doGetItemsList(newItemListRequest(filter, offset, size));
		if (itemsListResponse.getItemsList() != null) {
			List<ItemsListType> itemsList = Arrays.asList(itemsListResponse.getItemsList().getItem());
			collectItemInfos(result, itemsList);
		}
		return itemsListResponse.getItemsCount() > offset + size;
	}

	private void collectItemInfos(List<Item> result, List<ItemsListType> itemsList) throws RemoteException {
		long[] ids = itemsList.stream().mapToLong(i -> i.getItemId()).toArray();
		int offset = 0;
		List<DoGetItemsInfoRequest> requests = new ArrayList<>();
		while (offset < ids.length) {
			requests.add(newItemInfoRequest(ids, offset, ITEMS_INFO_MAX_RESULT_SIZE));
			offset += ITEMS_INFO_MAX_RESULT_SIZE;
		}
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		Collection<Callable<List<ItemInfoStruct>>> tasks = new ArrayList<>();
		for (DoGetItemsInfoRequest r : requests) {
			Callable<List<ItemInfoStruct>> task = () -> {
				// can fail with NPE
				// https://travis-ci.org/zaza/allegro-rss/builds/259161485
				// ignore the ItemsInfo ...
		    	DoGetItemsInfoResponse itemsInfoResponse = allegro.doGetItemsInfo(r);
				return Arrays.asList(itemsInfoResponse.getArrayItemListInfo().getItem());
			};
			tasks.add(task);
		}
		
		List<ItemInfoStruct> itemInfos = new ArrayList<>();
		try {
			executorService.invokeAll(tasks).stream()
				    .map(f -> {
				        try {
				            return f.get();
				        }
				        catch (Exception e) {
				            throw new IllegalStateException(e);
				        }
				    })
				    .forEach(items -> itemInfos.addAll(items));
		} catch (InterruptedException e) {
			throw new IllegalStateException("Collection item infos has been interrupted!", e);
		}
		
		for (ItemsListType itemsListType : itemsList) {
			// ... and skip it here
			ItemInfoStruct itemInfo = itemInfos.stream().filter(info -> info.getItemInfo().getItId() == itemsListType.getItemId()).findFirst().get();
			result.add(new Item(itemsListType, itemInfo.getItemInfo()));
		}
		executorService.shutdown();
	}

	private DoGetItemsListRequest newItemListRequest(ArrayOfFilteroptionstype filter, int offset, int size) {
		DoGetItemsListRequest request = new DoGetItemsListRequest();
		request.setCountryId(POLAND);
		request.setWebapiKey(webApiKey);
		request.setResultOffset(offset);
		request.setResultSize(size);
		request.setResultScope(
				ResultScope.nie_zwracaj_struktury_z_filtrami | ResultScope.nie_zwracaj_struktury_z_kategoriami);
		request.setFilterOptions(filter);
		return request;
	}

	private DoGetItemsInfoRequest newItemInfoRequest(long[] ids, int offset, int size) {
		long[] idsRange = Arrays.copyOfRange(ids, offset, Math.min(offset + size, ids.length));
		DoGetItemsInfoRequest request = new DoGetItemsInfoRequest();
		request.setSessionHandle(sessionHandle);
		request.setItemsIdArray(new ArrayOfLong(idsRange));
		return request;
	}

	private String encryptAndEncodePassword() {
		MessageDigest md = DigestUtils.getSha256Digest();
		md.update(password.getBytes(Charsets.UTF_8));
		return Base64.encode(md.digest());
	}
}
