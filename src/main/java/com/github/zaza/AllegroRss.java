package com.github.zaza;

import static spark.Spark.get;
import static spark.SparkBase.port;

import java.io.IOException;

import javax.xml.rpc.ServiceException;

import com.github.zaza.allegro.AllegroClientProvider;
import com.github.zaza.allegro.SearchResult;
import com.rometools.rome.io.FeedException;

import spark.Request;

public class AllegroRss {

	public static void main(String[] args) throws ServiceException {
		port(Integer.valueOf(System.getenv(Env.PORT)));
		get("/rss", (req, res) -> writeFeed(searchItems(req)));
	}

	private static SearchResult searchItems(Request request) throws IOException, FeedException {
		String webApiKey = request.queryParams("wak");
		return AllegroClientProvider.getInstance().getClient(webApiKey).search(request);
	}

	private static String writeFeed(SearchResult result) throws IOException, FeedException {
		return new FeedWriter().write(result);
	}

}
