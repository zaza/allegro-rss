package com.github.zaza.allegro;

import java.util.List;

import com.allegro.webapi.ItemsListType;

import spark.Request;

public class SearchResult {

	private Request request;
	private String filterDescription;
	private List<ItemsListType> items;

	SearchResult(Request request, String description, List<ItemsListType> items) {
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

	public List<ItemsListType> getItems() {
		return items;
	}

}
