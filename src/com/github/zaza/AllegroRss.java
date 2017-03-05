package com.github.zaza;

import static spark.Spark.get;
import static spark.SparkBase.port;

public class AllegroRss {

  public static void main(String[] args) {

    port(Integer.valueOf(System.getenv("PORT")));

    get("/hello", (req, res) -> "Hello World");
    
    get("/rome", (req, res) -> new FeedWriter().write());

  }

}
