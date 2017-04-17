package com.github.zaza.allegro;
import java.rmi.RemoteException;
import java.util.concurrent.ExecutionException;

import javax.xml.rpc.ServiceException;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class AllegroClientProvider {

	private static final AllegroClientProvider instance = new AllegroClientProvider();

	private LoadingCache<String, AllegroClient> cache = CacheBuilder.newBuilder()
			.build(new CacheLoader<String, AllegroClient>() {
				public AllegroClient load(String webApiKey) throws RemoteException, ServiceException {
					AllegroClient client = new AllegroClient(webApiKey);
					client.login();
					return client;
				}
			});

	private AllegroClientProvider() {
	}

	public static AllegroClientProvider getInstance() {
		return instance;
	}

	public AllegroClient getClient(String webApiKey) {
		try {
			return cache.get(webApiKey);
		} catch (ExecutionException e) {
			throw new RuntimeException(e);
		}
	}

}
