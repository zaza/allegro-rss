package com.github.zaza.allegro;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import javax.xml.rpc.ServiceException;

import com.allegro.webapi.CatInfoType;
import com.allegro.webapi.CountryInfoType;
import com.allegro.webapi.DoGetCatsDataRequest;
import com.allegro.webapi.DoGetCountriesRequest;

class TestableAllegroClient extends AllegroClient {

	TestableAllegroClient(String webApiKey) throws ServiceException {
		super(webApiKey);
	}

	long getCountryCode(String countryName) throws RemoteException, ServiceException {
		List<CountryInfoType> countries = Arrays.asList(
				allegro.doGetCountries(new DoGetCountriesRequest(POLAND, webApiKey)).getCountryArray().getItem());
		return countries.stream().filter(c -> countryName.equalsIgnoreCase(c.getCountryName()))
				.mapToInt(c -> c.getCountryId()).findFirst().getAsInt();
	}
	
	long getCategories(String categoryName) throws RemoteException, ServiceException {
		List<CatInfoType> categories = Arrays.asList(
				allegro.doGetCatsData(new DoGetCatsDataRequest(POLAND, 0L, webApiKey)).getCatsList().getItem());
		return categories.stream().filter(c -> categoryName.equalsIgnoreCase(c.getCatName()))
				.mapToInt(c -> c.getCatId()).findFirst().getAsInt();
	}

}
