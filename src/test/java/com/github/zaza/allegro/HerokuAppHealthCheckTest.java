package com.github.zaza.allegro;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import static java.lang.String.format;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Test;

import com.github.zaza.Env;
import com.google.common.base.Charsets;

public class HerokuAppHealthCheckTest {

	@Test
	public void check() throws Exception {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpGet = newRssGetForString("xbox one x");
		try (CloseableHttpResponse response = httpclient.execute(httpGet)) {
			assertEquals(200, response.getStatusLine().getStatusCode());
		}
	}

	private HttpGet newRssGetForString(String string) throws UnsupportedEncodingException {
		return new HttpGet(format("http://allegro-rss.herokuapp.com/rss?wak=%s&string=%s",
				System.getenv().get(Env.ALLEGRO_WEBAPI_KEY), URLEncoder.encode("xbox one x", Charsets.UTF_8.name())));
	}
}
