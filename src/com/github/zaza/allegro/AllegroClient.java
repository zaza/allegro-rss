package com.github.zaza.allegro;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkState;

import java.rmi.RemoteException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.apache.axis.encoding.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.allegro.webapi.ArrayOfFilteroptionstype;
import com.allegro.webapi.DoGetItemsListRequest;
import com.allegro.webapi.DoGetItemsListResponse;
import com.allegro.webapi.DoLoginEncRequest;
import com.allegro.webapi.DoQuerySysStatusRequest;
import com.allegro.webapi.ItemsListType;
import com.allegro.webapi.ServicePort_PortType;
import com.allegro.webapi.ServiceServiceLocator;
import com.google.common.base.Charsets;
import com.google.common.collect.Range;

import spark.Request;

public class AllegroClient {

	private static final Logger LOG = LoggerFactory.getLogger(AllegroClient.class);

	// TODO: remove when done smoke-testing
	public static void main(String[] args) throws Exception {
		AllegroClient client = new AllegroClient(args[0]);
		client.checkVersionKey();
		client.login();
		//client.search(FilterBuilder.search("mata 4cm").price(Range.lessThan(100)).condition(Condition.NEW).build());
		client.search(FilterBuilder.search("nilfisk king").condition(Condition.USED).build());
	}
	
	private static final int POLAND = 1; // TODO: doGetCountries

	private static final int WEBAPI_VERSION_KEY = 1488971865;

	private static final int RESULT_SIZE = 1000; // maximum allowed

	private String login;
	private String password;
	private String webApiKey;
	private ServicePort_PortType allegro;

	private String sessionHandle;

	public AllegroClient(Request req) throws ServiceException, RemoteException {
		this(req.queryParams("wak"));
		login();
	}
	
	private AllegroClient(String webApiKey) throws ServiceException {
		this.login = System.getenv().get("ALLEGRO_LOGIN");
		this.password = System.getenv().get("ALLEGRO_PASSWORD");
		this.webApiKey = webApiKey;

		ServiceServiceLocator service = new ServiceServiceLocator();
		allegro = service.getservicePort();
	}

	public long getVersionKey() throws RemoteException, ServiceException {
		LOG.trace("Receving key version... ");
		long verKey = allegro.doQuerySysStatus(new DoQuerySysStatusRequest(1, POLAND, webApiKey)).getVerKey();
		LOG.trace("done. Current version key={}", verKey);
		return verKey;
	}

	private void checkVersionKey() throws RemoteException, ServiceException {
		long verKey = getVersionKey();
		if (verKey != WEBAPI_VERSION_KEY) {
			LOG.warn("Version key received from Allegro doesn't match the key in the app: {} vs {}", verKey,
					WEBAPI_VERSION_KEY);
		}
	}

	private void login() throws ServiceException, RemoteException {
		sessionHandle = allegro
				.doLoginEnc(
						new DoLoginEncRequest(login, encryptAndEncodePassword(), POLAND, webApiKey, WEBAPI_VERSION_KEY))
				.getSessionHandlePart();
	}
	
	public List<ItemsListType> search(Request req) throws RemoteException {
		String query = req.queryParams("q");
		checkArgument(query !=  null);
		FilterBuilder builder = FilterBuilder.search(query);
		String price = req.queryParams("p");
		if (price != null)
			builder.price(Range.atMost(Integer.valueOf(price)));
		String condition = req.queryParams("c");
		if (condition != null)
			builder.condition(Condition.valueOf(condition.toUpperCase()));
		return search(builder.build());
	} 

	private List<ItemsListType> search(ArrayOfFilteroptionstype filter) throws RemoteException {
		checkState(sessionHandle != null);
		int offset = 0;
		List<ItemsListType> result = new ArrayList<>();
		while (search(filter, result, offset, RESULT_SIZE)) {
			offset += RESULT_SIZE;
		}
		for (ItemsListType item : result) {
			LOG.debug("{}, {} :: {}", item.getItemId(), item.getItemTitle(), item.getPriceInfo().getItem(0).getPriceValue());
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
