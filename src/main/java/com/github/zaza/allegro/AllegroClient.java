package com.github.zaza.allegro;

import static com.google.common.base.Preconditions.checkState;

import java.rmi.RemoteException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
import com.allegro.webapi.ItemInfo;
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

	/*
	 * TODO maximum allowed results for doGetItemsList is 1000 but to simplify
	 * the search align it with maximum id array size for doGetItemsInfo, which
	 * is 25.
	 * 
	 * http://allegro.pl/webapi/documentation.php/show/id,52#method-input
	 */
	private static final int RESULT_SIZE = 25;

	private String login;
	private String password;
	protected String webApiKey;
	protected ServicePort_PortType allegro;

	private String sessionHandle;

	public AllegroClient(Request req) throws ServiceException, RemoteException {
		this(req.queryParams("wak"));
		login();
	}

	AllegroClient(String webApiKey) throws ServiceException {
		this.login = System.getenv().get(Env.ALLEGRO_LOGIN);
		this.password = System.getenv().get(Env.ALLEGRO_PASSWORD);
		this.webApiKey = webApiKey;

		ServiceServiceLocator service = new ServiceServiceLocator();
		allegro = service.getservicePort();
	}

	protected long getVersionKey() throws RemoteException, ServiceException {
		long latestVersionKey = getLatestVersionKey();
		if (WEBAPI_VERSION_KEY != latestVersionKey) {
			System.out.println("The webapi version key is out-dated! Continuing with the latest version.");
			return latestVersionKey;
		}
		return WEBAPI_VERSION_KEY;
	}

	protected long getLatestVersionKey() throws RemoteException, ServiceException {
		System.out.print("Receving key version... ");
		long verKey = allegro.doQuerySysStatus(new DoQuerySysStatusRequest(1, POLAND, webApiKey)).getVerKey();
		System.out.println("done. Latest version key=" + verKey);
		return verKey;
	}

	void login() throws ServiceException, RemoteException {
		sessionHandle = allegro
				.doLoginEnc(
						new DoLoginEncRequest(login, encryptAndEncodePassword(), POLAND, webApiKey, getVersionKey()))
				.getSessionHandlePart();
	}

	public SearchResult search(Request req) throws RemoteException {
		FilterBuilder builder = FilterBuilder.search(req.queryParams("string"));
		String price = req.queryParams("price_to");
		if (price != null)
			builder.price(Range.atMost(Integer.valueOf(price)));
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
		while (search(filter, result, offset, RESULT_SIZE)) {
			offset += RESULT_SIZE;
		}
		return result;
	}

	private boolean search(ArrayOfFilteroptionstype filter, List<Item> result, int offset, int size)
			throws RemoteException {
		DoGetItemsListResponse itemsListResponse = allegro.doGetItemsList(newItemListRequest(filter, offset, size));
		if (itemsListResponse.getItemsList() != null) {
			List<ItemsListType> itemsList = Arrays.asList(itemsListResponse.getItemsList().getItem());
			long[] ids = itemsList.stream().mapToLong(i -> i.getItemId()).toArray();
			DoGetItemsInfoResponse itemsInfoResponse = allegro.doGetItemsInfo(newItemInfoRequest(ids));
			List<ItemInfoStruct> itemInfos = Arrays.asList(itemsInfoResponse.getArrayItemListInfo().getItem());
			checkState(itemsList.size() == itemInfos.size());
			for (int i = 0; i < itemsList.size(); i++) {
				ItemsListType itemsListType = itemsList.get(i);
				ItemInfo itemInfo = itemInfos.get(i).getItemInfo();
				checkState(itemsListType.getItemId() == itemInfo.getItId());
				result.add(new Item(itemsListType, itemInfo));
			}
		}
		return itemsListResponse.getItemsCount() > offset + size;
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

	private DoGetItemsInfoRequest newItemInfoRequest(long[] ids) {
		DoGetItemsInfoRequest request = new DoGetItemsInfoRequest();
		request.setSessionHandle(sessionHandle);
		request.setItemsIdArray(new ArrayOfLong(ids));
		return request;
	}

	private String encryptAndEncodePassword() {
		MessageDigest md = DigestUtils.getSha256Digest();
		md.update(password.getBytes(Charsets.UTF_8));
		return Base64.encode(md.digest());
	}
}
