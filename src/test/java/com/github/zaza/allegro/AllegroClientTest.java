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

	// TODO: check country code, assert 1 = Polska

	private AllegroClient client() throws ServiceException {
		return new AllegroClient(System.getenv().get(Env.ALLEGRO_WEBAPI_KEY));
	}

}
