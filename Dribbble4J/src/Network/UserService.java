package Network;

import Dribbble.User;
import com.google.gson.Gson;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class UserService {
    private static final String USER = Parameter.SCHEMA + "/users/" + Parameter.USER;

    private static final String USER_BUCKETS = Parameter.SCHEMA + "/users/" + Parameter.USER + "/buckets";

    private static final String USER_FOLLOWERS = Parameter.SCHEMA + "/users/" + Parameter.USER + "/followers";

    private static final String USER_FOLLOWING = Parameter.SCHEMA + "/users/" + Parameter.USER + "/following";

    private static final String RELATIONSHIP = Parameter.SCHEMA + "/users/" + Parameter.USER +"/following/" + Parameter.TARGET_USER;

    private static final String AUTHENTICATED_USER = Parameter.SCHEMA + "/user";

    private static final String AUTHENTICATED_USER_BUCKETS = Parameter.SCHEMA + "/user/buckets";

    private static final String AUTHENTICATED_USER_FOLLOWERS = Parameter.SCHEMA + "/user/followers";

    private static final String AUTHENTICATED_USER_FOLLOWING = Parameter.SCHEMA + "/user/following";

    private static final String AUTHENTICATED_USER_FOLLOWING_SHOTS = Parameter.SCHEMA + "/user/following/shots";

    private static final String IS_FOLLOWING = Parameter.SCHEMA + "/user/following/" + Parameter.USER;

    private static final String FOLLOW = Parameter.SCHEMA + "/users/" + Parameter.USER + "/follow";

    private static final String UNFOLLOW = Parameter.SCHEMA + "/users/" + Parameter.USER + "/follow";

    private Http http;

    private Gson gson;

    public UserService(Http http) {
        this.http = http;
        this.gson = new Gson();
    }

    public void cancel() {
        http.cancel(Parameter.TAG_USER_SERVICE);
    }

    public User getUser(String username) throws IOException {
        Response response = http.get(
                USER.replace(Parameter.USER, username),
                Parameter.TAG_USER_SERVICE
        );

        if (response.code() != Parameter.STATUS_200) {
            // TODO
        }

        return gson.fromJson(response.body().string(), User.class);
    }
}
