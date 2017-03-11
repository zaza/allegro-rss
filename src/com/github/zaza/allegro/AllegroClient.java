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
import com.allegro.webapi.ArrayOfString;
import com.allegro.webapi.DoGetItemsListRequest;
import com.allegro.webapi.DoGetItemsListResponse;
import com.allegro.webapi.DoLoginEncRequest;
import com.allegro.webapi.DoQuerySysStatusRequest;
import com.allegro.webapi.DoQuerySysStatusResponse;
import com.allegro.webapi.FilterOptionsType;
import com.allegro.webapi.ItemsListType;
import com.allegro.webapi.RangeValueType;
import com.allegro.webapi.ServicePort_PortType;
import com.allegro.webapi.ServiceServiceLocator;
import com.google.common.base.Charsets;
import com.google.common.collect.Range;

public class AllegroClient {
	// TODO: remove when done smoke-testing
	public static void main(String[] args) throws Exception {
		AllegroClient client = new AllegroClient();
		client.checkVersionKey();
		client.login();
		assert client.sessionHandle != null;
		client.search("mata 4cm", Range.lessThan(100));
	}
	private static final int POLAND = 1; // TODO: doGetCountries

	private static final int WEBAPI_VERSION_KEY = 1488971865;

	private static final int RESULT_SIZE = 1000; // maximum allowed

	private String login;
	private String password;
	private String webApiKey;
	private ServicePort_PortType allegro;

	private String sessionHandle;

	public AllegroClient() throws ServiceException {
		login = System.getenv().get("ALLEGRO_LOGIN");
		password = System.getenv().get("ALLEGRO_PASSWORD");
		webApiKey = System.getenv().get("ALLEGRO_WEBAPI_KEY");

		ServiceServiceLocator service = new ServiceServiceLocator();
		allegro = service.getservicePort();
	}

	private void checkVersionKey() throws RemoteException, ServiceException {
		// TODO: logging
		System.out.println("Receving key version... ");
		long verKey = allegro.doQuerySysStatus(new DoQuerySysStatusRequest(1, POLAND, webApiKey)).getVerKey();
		System.out.println("done. Current version key=" + verKey);
		assert verKey == WEBAPI_VERSION_KEY;
	}

	private void login() throws ServiceException, RemoteException {
		sessionHandle = allegro.doLoginEnc(new DoLoginEncRequest(login, encryptAndEncodePassword(), POLAND,
				webApiKey, WEBAPI_VERSION_KEY)).getSessionHandlePart();
	}

	private void search(String query, Range<Integer> price) throws RemoteException {
		checkState(sessionHandle != null);
		int offset = 0;
		List<ItemsListType> result = new ArrayList<>();
		while (search(newFilter(query, price), result, offset, RESULT_SIZE)) {
			offset += RESULT_SIZE;
		}
		for (ItemsListType item : result) {
			System.out.println(item.getItemTitle() + " :: " + item.getPriceInfo().getItem(0).getPriceValue());
		}
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

	private ArrayOfFilteroptionstype newFilter(String query, Range<Integer> price) {
		ArrayOfFilteroptionstype filter = new ArrayOfFilteroptionstype();
		List<FilterOptionsType> subFilters = new ArrayList<>();
		subFilters.add(newSubFilter(FilterId.Szukaj_w_tytule, query));
		subFilters.add(newSubFilter(FilterId.Stan, "used"));
		subFilters.add(newSubFilter(FilterId.Cena, price));
		filter.setItem(subFilters.toArray(new FilterOptionsType[subFilters.size()]));
		return filter;
	}

	private FilterOptionsType newSubFilter(String filterId, String... values) {
		FilterOptionsType subFilter = new FilterOptionsType();
		subFilter.setFilterId(filterId);
		ArrayOfString subFilterValues = new ArrayOfString();
		subFilterValues.setItem(values);
		subFilter.setFilterValueId(subFilterValues);
		return subFilter;
	}

	private FilterOptionsType newSubFilter(String filterId, Range<Integer> range) {
		FilterOptionsType subFilter = new FilterOptionsType();
		subFilter.setFilterId(filterId);
		RangeValueType valueRange = new RangeValueType();
		if (range.hasLowerBound())
			valueRange.setRangeValueMin(range.lowerEndpoint().toString());
		if (range.hasUpperBound())
			valueRange.setRangeValueMax(range.upperEndpoint().toString());
		subFilter.setFilterValueRange(valueRange);
		return subFilter;
	}

	private String encryptAndEncodePassword() {
		MessageDigest md = DigestUtils.getSha256Digest();
		md.update(password.getBytes(Charsets.UTF_8));
		return Base64.encode(md.digest());
	}
}
