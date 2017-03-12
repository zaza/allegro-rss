package com.github.zaza;

import static spark.Spark.get;
import static spark.SparkBase.port;

import javax.xml.rpc.ServiceException;

import com.github.zaza.allegro.AllegroClient;

public class AllegroRss {

	public static void main(String[] args) throws ServiceException {
		port(Integer.valueOf(System.getenv(Env.PORT)));
		get("/rss", (req, res) -> new FeedWriter().write(new AllegroClient(req).search(req)));
	}

}
