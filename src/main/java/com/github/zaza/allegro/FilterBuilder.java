package com.github.zaza.allegro;

import java.util.ArrayList;
import java.util.List;

import com.allegro.webapi.ArrayOfFilteroptionstype;
import com.allegro.webapi.ArrayOfString;
import com.allegro.webapi.FilterOptionsType;
import com.allegro.webapi.RangeValueType;
import com.google.common.collect.Range;

class FilterBuilder {

	private String query;
	private Range<Integer> price;
	private Boolean buyNew;
	private int category;

	private FilterBuilder(String query) {
		this.query = query;
	}

	static FilterBuilder search(String query) {
		return new FilterBuilder(query);
	}

	FilterBuilder price(Range<Integer> price) {
		this.price = price;
		return this;
	}

	FilterBuilder condition(boolean buyNew) {
		if (this.buyNew != null)
			// when trying to set both buyNew and buyNew, unset the filter
			this.buyNew = null;
		this.buyNew = buyNew;
		return this;
	}
	
	public FilterBuilder category(int category) {
		this.category = category;
		return this;
	}

	ArrayOfFilteroptionstype build() {
		ArrayOfFilteroptionstype filter = new ArrayOfFilteroptionstype();
		List<FilterOptionsType> subFilters = new ArrayList<>();
		if (query != null && !query.isEmpty())
		subFilters.add(newSubFilter(FilterId.Szukaj_w_tytule, query));
		if (buyNew != null)
			subFilters.add(newSubFilter(FilterId.Stan, getCondition().name().toLowerCase()));
		if (price != null)
			subFilters.add(newSubFilter(FilterId.Cena, price));
		if (category != 0)
			subFilters.add(newSubFilter(FilterId.Kategoria, Integer.toString(category)));
		filter.setItem(subFilters.toArray(new FilterOptionsType[subFilters.size()]));
		return filter;
	}

	private FilterOptionsType newSubFilter(String filterId, String... values) {
		FilterOptionsType subFilter = new FilterOptionsType();
		subFilter.setFilterId(filterId);
		ArrayOfString subFilterValues = new ArrayOfString();
		subFilterValues.setItem(values);
		subFilter.setFilterValueId(subFilterValues);
		return subFilter;
	}

	private FilterOptionsType newSubFilter(String filterId, Range<Integer> range) {
		FilterOptionsType subFilter = new FilterOptionsType();
		subFilter.setFilterId(filterId);
		RangeValueType valueRange = new RangeValueType();
		if (range.hasLowerBound())
			valueRange.setRangeValueMin(range.lowerEndpoint().toString());
		if (range.hasUpperBound())
			valueRange.setRangeValueMax(range.upperEndpoint().toString());
		subFilter.setFilterValueRange(valueRange);
		return subFilter;
	}

	private Condition getCondition() {
		return buyNew ? Condition.NEW : Condition.USED;
	}
	
	String getDescription() {
		// TODO: include more parameters in the description e.g. price
		// and keep in mind that 'query' can be null, e.g. when searching by category or user
		return query;
	}
}
