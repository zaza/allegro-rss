package com.github.zaza.allegro;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import javax.xml.rpc.ServiceException;

import com.allegro.webapi.CountryInfoType;
import com.allegro.webapi.DoGetCountriesRequest;
import com.allegro.webapi.DoQuerySysStatusRequest;

class TestableAllegroClient extends AllegroClient {

	TestableAllegroClient(String webApiKey) throws ServiceException {
		super(webApiKey);
	}

	long getVersionKey() throws RemoteException, ServiceException {
		System.out.print("Receving key version... ");
		long verKey = allegro.doQuerySysStatus(new DoQuerySysStatusRequest(1, POLAND, webApiKey)).getVerKey();
		System.out.println("done. Current version key=" + verKey);
		return verKey;
	}

	long getCountryCode(String countryName) throws RemoteException, ServiceException {
		List<CountryInfoType> countries = Arrays.asList(
				allegro.doGetCountries(new DoGetCountriesRequest(POLAND, webApiKey)).getCountryArray().getItem());
		return countries.stream().filter(c -> countryName.equalsIgnoreCase(c.getCountryName()))
				.mapToInt(c -> c.getCountryId()).findFirst().getAsInt();
	}

}
