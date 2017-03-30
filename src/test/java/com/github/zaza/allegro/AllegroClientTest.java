package com.github.zaza.allegro;

import static org.junit.Assert.assertEquals;

import javax.xml.rpc.ServiceException;

import org.junit.Test;
import org.junit.Ignore;

import com.github.zaza.Env;

public class AllegroClientTest {

	@Test
	@Ignore
	public void latestVersionKeyCheck() throws Exception {
		// The key changes frequently, resulting in the test to fail, see:
		// http://allegro.pl/webapi/general.php#version_keys
		// http://allegro.pl/webapi/faq.php#faq_3
		assertEquals(AllegroClient.WEBAPI_VERSION_KEY, client().getLatestVersionKey());
	}

	@Test
	public void versionKeyCheck() throws Exception {
		assertEquals(client().getVersionKey(), client().getLatestVersionKey());
	}

	@Test
	public void countryCodeCheck() throws Exception {
		assertEquals(AllegroClient.POLAND, client().getCountryCode("Polska"));
	}

	private TestableAllegroClient client() throws ServiceException {
		return new TestableAllegroClient(System.getenv().get(Env.ALLEGRO_WEBAPI_KEY));
	}

}
