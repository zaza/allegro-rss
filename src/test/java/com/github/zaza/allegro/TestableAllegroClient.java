package com.github.zaza.allegro;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import javax.xml.rpc.ServiceException;

import com.allegro.webapi.ArrayOfFilteroptionstype;
import com.allegro.webapi.CatInfoType;
import com.allegro.webapi.CountryInfoType;
import com.allegro.webapi.DoGetCatsDataRequest;
import com.allegro.webapi.DoGetCountriesRequest;
import com.allegro.webapi.DoGetStatesInfoRequest;
import com.allegro.webapi.ServicePort_PortType;
import com.allegro.webapi.StateInfoStruct;
import com.github.zaza.Env;

class TestableAllegroClient {

	private AllegroClient delegate;

	private TestableAllegroClient(AllegroClient client) {
		this.delegate = client;
	}

	static TestableAllegroClient get() {
		return new TestableAllegroClient(
				AllegroClientProvider.getInstance().getClient(System.getenv().get(Env.ALLEGRO_WEBAPI_KEY)));
	}

	long getCountryCode(String countryName) throws RemoteException, ServiceException {
		List<CountryInfoType> countries = Arrays.asList(
				allegro().doGetCountries(new DoGetCountriesRequest(AllegroClient.POLAND, webApiKey())).getCountryArray().getItem());
		return countries.stream().filter(c -> countryName.equalsIgnoreCase(c.getCountryName()))
				.mapToInt(c -> c.getCountryId()).findFirst().getAsInt();
	}
	
	long getCategoryId(String categoryName) throws RemoteException, ServiceException {
		List<CatInfoType> categories = Arrays.asList(
				allegro().doGetCatsData(new DoGetCatsDataRequest(AllegroClient.POLAND, 0L, webApiKey(), false)).getCatsList().getItem());
		return categories.stream().filter(c -> categoryName.equalsIgnoreCase(c.getCatName()))
				.mapToInt(c -> c.getCatId()).findFirst().getAsInt();
	}
	
	String getState(int stateId) throws RemoteException, ServiceException {
		List<StateInfoStruct> states = Arrays.asList(
				allegro().doGetStatesInfo(new DoGetStatesInfoRequest(AllegroClient.POLAND, webApiKey())).getStatesInfoArray().getItem());
		return states.stream().filter(s -> s.getStateId() == stateId).map(s -> s.getStateName())
				.findFirst().orElseThrow(IllegalArgumentException::new);
	}
	
	List<Item> search(ArrayOfFilteroptionstype filter) throws RemoteException {
		return delegate.search(filter);
	}

	long getLatestVersionKey() throws RemoteException {
		return delegate.getLatestVersionKey();
	}

	long getVersionKey() throws RemoteException {
		return delegate.getVersionKey();
	}

	private ServicePort_PortType allegro() {
		return delegate.allegro;
	}

	private String webApiKey() {
		return delegate.webApiKey;
	}

}
