package com.github.zaza.allegro;

import java.util.List;

import com.allegro.webapi.ItemsListType;

public class SearchResult {

	private String queryUrl;
	private String filterDescription;
	private List<ItemsListType> items;

	SearchResult(String url, String description, List<ItemsListType> items) {
		this.queryUrl = url;
		this.filterDescription = description;
		this.items = items;
	}

	public String getQueryUrl() {
		return queryUrl;
	}

	public String getFilterDescription() {
		return filterDescription;
	}

	public List<ItemsListType> getItems() {
		return items;
	}

}
