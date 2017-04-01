package com.github.zaza.allegro;

import java.util.List;

import spark.Request;

public class SearchResult {

	private Request request;
	private String filterDescription;
	private List<Item> items;

	SearchResult(Request request, String description, List<Item> items) {
		this.request = request;
		this.filterDescription = description;
		this.items = items;
	}

	public String getQueryUrl() {
		return request.url() + "?" + request.queryString();
	}

	public String getFilterDescription() {
		return filterDescription;
	}

	public List<Item> getItems() {
		return items;
	}

}
