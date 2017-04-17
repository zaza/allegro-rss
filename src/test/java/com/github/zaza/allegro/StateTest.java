package com.github.zaza.allegro;

import static org.junit.Assert.assertEquals;

import javax.xml.rpc.ServiceException;

import org.junit.Test;

public class StateTest {

	@Test
	public void checkIfIdMatchesName() throws Exception {
		for (State state : State.values()) {
			assertEquals(state.name().replace('_', '-'), client().getState(state.getId()));
		}
	}

	private TestableAllegroClient client() throws ServiceException {
		return TestableAllegroClient.get();
	}
}
