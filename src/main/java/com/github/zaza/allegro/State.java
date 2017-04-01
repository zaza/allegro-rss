package com.github.zaza.allegro;

import java.util.Arrays;

public enum State {
	dolnośląskie(1), //
	kujawsko_pomorskie(2), //
	lubelskie(3), //
	lubuskie(4), //
	łódzkie(5), //
	małopolskie(6), //
	mazowieckie(7), //
	opolskie(8), //
	podkarpackie(9), //
	podlaskie(10), //
	pomorskie(11), //
	śląskie(12), //
	świętokrzyskie(13), //
	warmińsko_mazurskie(14), //
	wielkopolskie(15), //
	zachodniopomorskie(16);

	private int id;

	private State(int id) {
		this.id = id;
	}

	static State valueOf(int id) {
		return Arrays.asList(State.values()).stream().filter(s -> s.getId() == id).findFirst()
				.orElseThrow(IllegalArgumentException::new);
	}

	int getId() {
		return id;
	}
}
