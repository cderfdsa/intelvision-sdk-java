package com.zeno.intelvision.http;

import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

/**
 * @author lan
 * @since 2016-02-01
 */
public class HttpService {

    private final static CloseableHttpClient httpClient = createHttpClient();

    private HttpService() {
    }

    public static CloseableHttpClient createHttpClient() {
        Registry<ConnectionSocketFactory> r =
                RegistryBuilder.<ConnectionSocketFactory>create().register("https", SslUtils.getFactory()).build();
        PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager(r);
        cm.setMaxTotal(100);
        cm.setDefaultMaxPerRoute(100);
        return HttpClients.custom()
                .setConnectionManager(cm)
                .build();
    }

    public static CloseableHttpClient getHttpClient() {
        return httpClient;
    }
}
