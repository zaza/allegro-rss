package com.github.zaza;

import static spark.Spark.get;
import static spark.SparkBase.port;

import java.io.IOException;
import java.util.List;

import javax.xml.rpc.ServiceException;

import com.github.zaza.allegro.AllegroClient;
import com.github.zaza.allegro.Condition;
import com.github.zaza.allegro.Item;
import com.github.zaza.allegro.SearchByStringBuilder;
import com.rometools.rome.io.FeedException;

import spark.Request;

public class AllegroRss {

	public static void main(String[] args) throws ServiceException {
		port(Integer.valueOf(System.getenv(Env.PORT)));
		get("/rss", (req, res) -> writeFeed(searchItems(req)));
	}

	private static SearchResult searchItems(Request request) throws IOException, FeedException, ServiceException {
		String webApiKey = request.queryParams("wak");
		AllegroClient client = new AllegroClient(webApiKey);
		String string = request.queryParams("string");
		SearchByStringBuilder searchBuilder = client.searchByString(string);
		String priceFrom = request.queryParams("price_from");
		if (priceFrom != null)
			searchBuilder.priceFrom(Integer.valueOf(priceFrom));
		String priceTo = request.queryParams("price_to");
		if (priceTo != null)
			searchBuilder.priceTo(Integer.valueOf(priceTo));
		if (request.queryParams("buyUsed") != null)
			searchBuilder.condition(Condition.USED);
		if (request.queryParams("buyNew") != null)
			searchBuilder.condition(Condition.NEW);
		if (request.queryParams("category") != null)
			searchBuilder.categoryId(Integer.parseInt(request.queryParams("category")));
		List<Item> items = searchBuilder.search();
		return new SearchResult(request, string, items);
	}

	private static String writeFeed(SearchResult result) throws IOException, FeedException {
		return new FeedWriter().write(result);
	}

}
