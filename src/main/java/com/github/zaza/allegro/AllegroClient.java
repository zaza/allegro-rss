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
import com.allegro.webapi.DoGetItemsListRequest;
import com.allegro.webapi.DoGetItemsListResponse;
import com.allegro.webapi.DoLoginEncRequest;
import com.allegro.webapi.DoQuerySysStatusRequest;
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

	private static final int RESULT_SIZE = 1000; // maximum allowed

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
		List<ItemsListType> items = search(filter);
		return new SearchResult(req, builder.getDescription(), items);
	}

	List<ItemsListType> search(ArrayOfFilteroptionstype filter) throws RemoteException {
		checkState(sessionHandle != null);
		int offset = 0;
		List<ItemsListType> result = new ArrayList<>();
		while (search(filter, result, offset, RESULT_SIZE)) {
			offset += RESULT_SIZE;
		}
		return result;
	}

	private boolean search(ArrayOfFilteroptionstype filter, List<ItemsListType> result, int offset, int size)
			throws RemoteException {
		DoGetItemsListResponse itemsList = allegro.doGetItemsList(newRequest(filter, offset, size));
		if (itemsList.getItemsList() != null)
			result.addAll(Arrays.asList(itemsList.getItemsList().getItem()));
		return itemsList.getItemsCount() > offset + size;
	}

	private DoGetItemsListRequest newRequest(ArrayOfFilteroptionstype filter, int offset, int size) {
		DoGetItemsListRequest request = new DoGetItemsListRequest();
		request.setCountryId(POLAND);
		request.setWebapiKey(webApiKey);
		request.setResultOffset(offset);
		request.setResultSize(size);
		request.setResultScope(ResultScope.zwracaj_wszystkie_dane);
		request.setFilterOptions(filter);
		return request;
	}

	private String encryptAndEncodePassword() {
		MessageDigest md = DigestUtils.getSha256Digest();
		md.update(password.getBytes(Charsets.UTF_8));
		return Base64.encode(md.digest());
	}
}
