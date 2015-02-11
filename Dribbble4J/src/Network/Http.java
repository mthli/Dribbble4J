package Network;

import com.squareup.okhttp.*;

import java.io.IOException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

/**
 * The unit of HTTP VERBS.
 */
public class Http {
    private String accessToken;

    private OkHttpClient client;

    public Http(String accessToken) {
        this.accessToken = accessToken;
        this.client = new OkHttpClient();
    }

    public Response get(String url, Object tag) throws IOException {
        Request request = new Request.Builder()
                .addHeader(Parameter.AUTHORIZATION, Parameter.BEARER + accessToken)
                .get()
                .url(url)
                .tag(tag)
                .build();

        return client.newCall(request).execute();
    }

    public Response post(RequestBody body, String url, Object tag) throws IOException {
        Request request = new Request.Builder()
                .addHeader(Parameter.AUTHORIZATION, Parameter.BEARER + accessToken)
                .post(body)
                .url(url)
                .tag(tag)
                .build();

        return client.newCall(request).execute();
    }

    public Response put(RequestBody body, String url, Object tag) throws IOException {
        Request request = new Request.Builder()
                .addHeader(Parameter.AUTHORIZATION, Parameter.BEARER + accessToken)
                .put(body)
                .url(url)
                .tag(tag)
                .build();

        return client.newCall(request).execute();
    }

    public Response patch(RequestBody body, String url, Object tag) throws IOException {
        Request request = new Request.Builder()
                .addHeader(Parameter.AUTHORIZATION, Parameter.BEARER + accessToken)
                .patch(body)
                .url(url)
                .tag(tag)
                .build();

        return client.newCall(request).execute();
    }

    public Response delete(String url, Object tag) throws IOException {
        Request request = new Request.Builder()
                .addHeader(Parameter.AUTHORIZATION, Parameter.BEARER + accessToken)
                .delete()
                .url(url)
                .tag(tag)
                .build();

        return client.newCall(request).execute();
    }

    public void cancel(Object tag) {
        client.cancel(tag);
    }

    public Cache getCache() {
        return client.getCache();
    }

    public void setCache(Cache cache) {
        client.setCache(cache);
    }

    public int getConnectTimeout() {
        return client.getConnectTimeout();
    }

    public void setConnectTimeout(long timeout, TimeUnit unit) {
        client.setConnectTimeout(timeout, unit);
    }

    public int getReadTimeout() {
        return client.getReadTimeout();
    }

    public void setReadTimeout(long timeout, TimeUnit unit) {
        client.setReadTimeout(timeout, unit);
    }

    public int getWriteTimeout() {
        return client.getReadTimeout();
    }

    public void setWriteTimeout(long timeout, TimeUnit unit) {
        client.setWriteTimeout(timeout, unit);
    }

    public Proxy getProxy() {
        return client.getProxy();
    }

    public void setProxy(Proxy proxy) {
        client.setProxy(proxy);
    }
}
