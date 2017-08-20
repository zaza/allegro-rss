package com.github.zaza.allegro;
import java.rmi.RemoteException;
import java.util.concurrent.ExecutionException;

import javax.xml.rpc.ServiceException;

import com.google.common.base.Preconditions;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

class AllegroClientProvider {

	private static final AllegroClientProvider instance = new AllegroClientProvider();

	private LoadingCache<String, AllegroClient> cache = CacheBuilder.newBuilder()
			.build(new CacheLoader<String, AllegroClient>() {
				public AllegroClient load(String webApiKey) throws RemoteException, ServiceException {
					return new AllegroClient(webApiKey);
				}
			});

	private AllegroClientProvider() {
	}

	static AllegroClientProvider getInstance() {
		return instance;
	}

	AllegroClient getClient(String webApiKey) {
		Preconditions.checkNotNull(webApiKey, "must provide webApiKey, check environment variables");
		try {
			return cache.get(webApiKey);
		} catch (ExecutionException e) {
			throw new RuntimeException(e);
		}
	}

}
