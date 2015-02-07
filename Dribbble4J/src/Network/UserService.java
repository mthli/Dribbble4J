package Network;

import Dribbble.Bucket;
import Dribbble.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.List;

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

    // TODO: more

    private Http http;

    private Gson gson;

    public UserService(Http http) {
        this.http = http;
        this.gson = new Gson();
    }

    public void cancel() {
        http.cancel(Parameter.TAG_USER_SERVICE);
    }

    public User getUser(int id) throws ResponseException {
        Response response;

        User user;

        try {
            response = http.get(USER.replace(Parameter.USER, String.valueOf(id)), Parameter.TAG_USER_SERVICE);
            if (response.code() != Parameter.STATUS_200) {
                throw new ResponseException(response.toString());
            }

            user = gson.fromJson(response.body().string(), User.class);
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }

        return user;
    }

    public User getUser(String username) throws ResponseException {
        Response response;

        User user;

        try {
            response = http.get(USER.replace(Parameter.USER, username), Parameter.TAG_USER_SERVICE);
            if (response.code() != Parameter.STATUS_200) {
                throw new ResponseException(response.toString());
            }

            user = gson.fromJson(response.body().string(), User.class);
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }

        return user;
    }

    public User getAuthenticatedUser() throws ResponseException {
        Response response;

        User user;

        try {
            response = http.get(AUTHENTICATED_USER, Parameter.TAG_USER_SERVICE);
            if (response.code() != Parameter.STATUS_200) {
                throw new ResponseException(response.toString());
            }

            user = gson.fromJson(response.body().string(), User.class);
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }

        return user;
    }

    public List<Bucket> getUserBuckets(int id) throws ResponseException {
        return getUserBuckets(id, Parameter.DEFAULT_PAGE, Parameter.DEFAULT_PER_PAGE);
    }

    public List<Bucket> getUserBuckets(int id, int page, int per_page) throws ResponseException {
        Response response;

        List<Bucket> buckets;

        String url = USER_BUCKETS.replace(Parameter.USER, String.valueOf(id))
                + "?"
                + Parameter.PAGE + page
                + "&"
                + Parameter.PER_PAGE + per_page;

        try {
            response = http.get(url, Parameter.TAG_USER_SERVICE);
            if (response.code() != Parameter.STATUS_200) {
                throw new ResponseException(response.toString());
            }

            buckets = gson.fromJson(response.body().string(), new TypeToken<List<Bucket>>(){}.getType());
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }

        return buckets;
    }

    public List<Bucket> getUserBuckets(String username) throws ResponseException {
        return getUserBuckets(username, Parameter.DEFAULT_PAGE, Parameter.DEFAULT_PER_PAGE);
    }

    public List<Bucket> getUserBuckets(String username, int page, int perPage) throws ResponseException {
        Response response;

        List<Bucket> buckets;

        String url = USER_BUCKETS.replace(Parameter.USER, username)
                + "?"
                + Parameter.PAGE + page
                + "&"
                + Parameter.PER_PAGE + perPage;

        try {
            response = http.get(url, Parameter.TAG_USER_SERVICE);
            if (response.code() != Parameter.STATUS_200) {
                throw new ResponseException(response.toString());
            }

            buckets = gson.fromJson(response.body().string(), new TypeToken<List<Bucket>>(){}.getType());
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }

        return buckets;
    }

    // TODO: more
}
