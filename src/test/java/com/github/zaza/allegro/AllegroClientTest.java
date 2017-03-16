package com.github.zaza.allegro;

import static org.junit.Assert.assertEquals;

import javax.xml.rpc.ServiceException;

import org.junit.Test;

import com.github.zaza.Env;

public class AllegroClientTest {

	@Test
	public void versionKeyCheck() throws Exception {
		assertEquals(AllegroClient.WEBAPI_VERSION_KEY, client().getVersionKey());
	}

	@Test
	public void countryCodeCheck() throws Exception {
		assertEquals(AllegroClient.POLAND, client().getCountryCode("Polska"));
	}

	private TestableAllegroClient client() throws ServiceException {
		return new TestableAllegroClient(System.getenv().get(Env.ALLEGRO_WEBAPI_KEY));
	}

}
