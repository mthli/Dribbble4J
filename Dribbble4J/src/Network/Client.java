package Network;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class Client {
    private static OkHttpClient client = new OkHttpClient();
    public static OkHttpClient getClient() {
        return client;
    }

    public static String get(String url) throws IOException {
        Request request = new Request.Builder().url(url).build();

        Response response = client.newCall(request).execute();

        return response.body().string();
    }

    // TODO
    public static void post() {}
}
