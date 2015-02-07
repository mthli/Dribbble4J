package Network;

import com.squareup.okhttp.*;

import java.io.File;
import java.io.IOException;

public class Http {
    private String accessToken;

    private OkHttpClient client;

    public Http(String accessToken) {
        this.accessToken = accessToken;
        this.client = new OkHttpClient();
    }

    public Response get(String url) throws IOException {
        Request request = new Request.Builder()
                .addHeader(Parameters.AUTHORIZATION, Parameters.BEARER + accessToken)
                .get()
                .url(url)
                .build();

        return client.newCall(request).execute();
    }

    public Response post(String type, String content, String url) throws IOException {
        Request request = new Request.Builder()
                .addHeader(Parameters.AUTHORIZATION, Parameters.BEARER + accessToken)
                .post(RequestBody.create(MediaType.parse(type), content))
                .url(url)
                .build();

        return client.newCall(request).execute();
    }

    public Response post(String type, byte[] bytes, String url) throws IOException {
        Request request = new Request.Builder()
                .addHeader(Parameters.AUTHORIZATION, Parameters.BEARER + accessToken)
                .post(RequestBody.create(MediaType.parse(type), bytes))
                .url(url)
                .build();

        return client.newCall(request).execute();
    }

    public Response post(String type, File file, String url) throws IOException {
        Request request = new Request.Builder()
                .addHeader(Parameters.AUTHORIZATION, Parameters.BEARER + accessToken)
                .post(RequestBody.create(MediaType.parse(type), file))
                .url(url)
                .build();

        return client.newCall(request).execute();
    }

    public Response put(String type, String content, String url) throws IOException {
        Request request = new Request.Builder()
                .addHeader(Parameters.AUTHORIZATION, Parameters.BEARER + accessToken)
                .put(RequestBody.create(MediaType.parse(type), content))
                .url(url)
                .build();

        return client.newCall(request).execute();
    }

    public Response put(String type, byte[] bytes, String url) throws IOException {
        Request request = new Request.Builder()
                .addHeader(Parameters.AUTHORIZATION, Parameters.BEARER + accessToken)
                .put(RequestBody.create(MediaType.parse(type), bytes))
                .url(url)
                .build();

        return client.newCall(request).execute();
    }

    public Response put(String type, File file, String url) throws IOException {
        Request request = new Request.Builder()
                .addHeader(Parameters.AUTHORIZATION, Parameters.BEARER + accessToken)
                .put(RequestBody.create(MediaType.parse(type), file))
                .url(url)
                .build();

        return client.newCall(request).execute();
    }

    public Response patch(String type, String content, String url) throws IOException {
        Request request = new Request.Builder()
                .addHeader(Parameters.AUTHORIZATION, Parameters.BEARER + accessToken)
                .patch(RequestBody.create(MediaType.parse(type), content))
                .url(url)
                .build();

        return client.newCall(request).execute();
    }

    public Response patch(String type, byte[] bytes, String url) throws IOException {
        Request request = new Request.Builder()
                .addHeader(Parameters.AUTHORIZATION, Parameters.BEARER + accessToken)
                .patch(RequestBody.create(MediaType.parse(type), bytes))
                .url(url)
                .build();

        return client.newCall(request).execute();
    }

    public Response patch(String type, File file, String url) throws IOException {
        Request request = new Request.Builder()
                .addHeader(Parameters.AUTHORIZATION, Parameters.BEARER + accessToken)
                .patch(RequestBody.create(MediaType.parse(type), file))
                .url(url)
                .build();

        return client.newCall(request).execute();
    }

    public Response delete(String url) throws IOException {
        Request request = new Request.Builder()
                .addHeader(Parameters.AUTHORIZATION, Parameters.BEARER + accessToken)
                .delete()
                .url(url)
                .build();

        return client.newCall(request).execute();
    }
}
