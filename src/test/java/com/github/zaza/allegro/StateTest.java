package com.github.zaza.allegro;

import static org.junit.Assert.assertEquals;

import javax.xml.rpc.ServiceException;

import org.junit.Test;

import com.github.zaza.Env;

public class StateTest {

	@Test
	public void checkIfIdMatchesName() throws Exception {
		for (State state : State.values()) {
			assertEquals(state.name().replace('_', '-'), client().getState(state.getId()));
		}
	}

	private TestableAllegroClient client() throws ServiceException {
		return new TestableAllegroClient(System.getenv().get(Env.ALLEGRO_WEBAPI_KEY));
	}
}
