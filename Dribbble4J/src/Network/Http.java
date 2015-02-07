package Network;

import com.squareup.okhttp.*;

import java.io.File;
import java.io.IOException;

public class Http {
    private String accessToken;

    private OkHttpClient client;
    public OkHttpClient getClient() {
        return client;
    }

    public Http(String accessToken) {
        this.accessToken = accessToken;
        this.client = new OkHttpClient();
    }

    public Response get(String url, Object tag) throws IOException {
        Request request;

        if (tag != null) {
            request = new Request.Builder()
                    .addHeader(Parameter.AUTHORIZATION, Parameter.BEARER + accessToken)
                    .get()
                    .url(url)
                    .tag(tag)
                    .build();
        } else {
            request = new Request.Builder()
                    .addHeader(Parameter.AUTHORIZATION, Parameter.BEARER + accessToken)
                    .get()
                    .url(url)
                    .build();
        }

        return client.newCall(request).execute();
    }

    public Response post(String type, String content, String url, Object tag) throws IOException {
        Request request;

        if (tag != null) {
            request = new Request.Builder()
                    .addHeader(Parameter.AUTHORIZATION, Parameter.BEARER + accessToken)
                    .post(RequestBody.create(MediaType.parse(type), content))
                    .url(url)
                    .tag(tag)
                    .build();
        } else {
            request = new Request.Builder()
                    .addHeader(Parameter.AUTHORIZATION, Parameter.BEARER + accessToken)
                    .post(RequestBody.create(MediaType.parse(type), content))
                    .url(url)
                    .build();
        }

        return client.newCall(request).execute();
    }

    public Response post(String type, byte[] bytes, String url, Object tag) throws IOException {
        Request request;

        if (tag != null) {
            request = new Request.Builder()
                    .addHeader(Parameter.AUTHORIZATION, Parameter.BEARER + accessToken)
                    .post(RequestBody.create(MediaType.parse(type), bytes))
                    .url(url)
                    .tag(tag)
                    .build();
        } else {
            request = new Request.Builder()
                    .addHeader(Parameter.AUTHORIZATION, Parameter.BEARER + accessToken)
                    .post(RequestBody.create(MediaType.parse(type), bytes))
                    .url(url)
                    .build();
        }

        return client.newCall(request).execute();
    }

    public Response post(String type, File file, String url, Object tag) throws IOException {
        Request request;

        if (tag != null) {
            request = new Request.Builder()
                    .addHeader(Parameter.AUTHORIZATION, Parameter.BEARER + accessToken)
                    .post(RequestBody.create(MediaType.parse(type), file))
                    .url(url)
                    .tag(tag)
                    .build();
        } else {
            request = new Request.Builder()
                    .addHeader(Parameter.AUTHORIZATION, Parameter.BEARER + accessToken)
                    .post(RequestBody.create(MediaType.parse(type), file))
                    .url(url)
                    .build();
        }

        return client.newCall(request).execute();
    }

    public Response put(String type, String content, String url, Object tag) throws IOException {
        Request request;

        if (tag != null) {
            request = new Request.Builder()
                    .addHeader(Parameter.AUTHORIZATION, Parameter.BEARER + accessToken)
                    .put(RequestBody.create(MediaType.parse(type), content))
                    .url(url)
                    .tag(tag)
                    .build();
        } else {
            request = new Request.Builder()
                    .addHeader(Parameter.AUTHORIZATION, Parameter.BEARER + accessToken)
                    .put(RequestBody.create(MediaType.parse(type), content))
                    .url(url)
                    .build();
        }

        return client.newCall(request).execute();
    }

    public Response put(String type, byte[] bytes, String url, Object tag) throws IOException {
        Request request;

        if (tag != null) {
            request = new Request.Builder()
                    .addHeader(Parameter.AUTHORIZATION, Parameter.BEARER + accessToken)
                    .put(RequestBody.create(MediaType.parse(type), bytes))
                    .url(url)
                    .tag(tag)
                    .build();
        } else {
            request = new Request.Builder()
                    .addHeader(Parameter.AUTHORIZATION, Parameter.BEARER + accessToken)
                    .put(RequestBody.create(MediaType.parse(type), bytes))
                    .url(url)
                    .build();
        }

        return client.newCall(request).execute();
    }

    public Response put(String type, File file, String url, Object tag) throws IOException {
        Request request;

        if (tag != null) {
            request = new Request.Builder()
                    .addHeader(Parameter.AUTHORIZATION, Parameter.BEARER + accessToken)
                    .put(RequestBody.create(MediaType.parse(type), file))
                    .url(url)
                    .tag(tag)
                    .build();
        } else {
            request = new Request.Builder()
                    .addHeader(Parameter.AUTHORIZATION, Parameter.BEARER + accessToken)
                    .put(RequestBody.create(MediaType.parse(type), file))
                    .url(url)
                    .build();
        }

        return client.newCall(request).execute();
    }

    public Response delete(String url, Object tag) throws IOException {
        Request request;

        if (tag != null) {
            request = new Request.Builder()
                    .addHeader(Parameter.AUTHORIZATION, Parameter.BEARER + accessToken)
                    .delete()
                    .url(url)
                    .tag(tag)
                    .build();
        } else {
            request = new Request.Builder()
                    .addHeader(Parameter.AUTHORIZATION, Parameter.BEARER + accessToken)
                    .delete()
                    .url(url)
                    .build();
        }

        return client.newCall(request).execute();
    }

    public void cancel(Object tag) {
        client.cancel(tag);
    }
}
