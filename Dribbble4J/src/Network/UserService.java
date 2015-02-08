package Network;

import Dribbble.Bucket;
import Dribbble.Shot;
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
        return getUser(String.valueOf(id));
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

    public List<Bucket> getUserBuckets(int id) throws ResponseException {
        return getUserBuckets(id, Parameter.DEFAULT_PAGE, Parameter.DEFAULT_PER_PAGE);
    }

    public List<Bucket> getUserBuckets(int id, int page, int perPage) throws ResponseException {
        return getUserBuckets(String.valueOf(id), page, perPage);
    }

    public List<Bucket> getUserBuckets(String username) throws ResponseException {
        return getUserBuckets(username, Parameter.DEFAULT_PAGE, Parameter.DEFAULT_PER_PAGE);
    }

    // TODO: test
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

    public List<User> getUserFollowers(int id) throws ResponseException {
        return getUserFollowers(id, Parameter.DEFAULT_PAGE, Parameter.DEFAULT_PER_PAGE);
    }

    public List<User> getUserFollowers(int id, int page, int perPage) throws ResponseException {
        return getUserFollowers(String.valueOf(id), page, perPage);
    }

    public List<User> getUserFollowers(String username) throws ResponseException {
        return getUserFollowers(username, Parameter.DEFAULT_PAGE, Parameter.DEFAULT_PER_PAGE);
    }

    // TODO; test
    public List<User> getUserFollowers(String username, int page, int perPage) throws ResponseException {
        Response response;

        List<User> users;

        String url = USER_FOLLOWERS.replace(Parameter.USER, username)
                + "?"
                + Parameter.PAGE + page
                + "&"
                + Parameter.PER_PAGE + perPage;

        try {
            response = http.get(url, Parameter.TAG_USER_SERVICE);
            if (response.code() != Parameter.STATUS_200) {
                throw new ResponseException(response.toString());
            }

            users = gson.fromJson(response.body().string(), new TypeToken<List<User>>(){}.getType());
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }

        return users;
    }

    public List<User> getUserFollowing(int id) throws ResponseException {
        return getUserFollowing(id, Parameter.DEFAULT_PAGE, Parameter.DEFAULT_PER_PAGE);
    }

    public List<User> getUserFollowing(int id, int page, int perPage) throws ResponseException {
        return getUserFollowing(String.valueOf(id), page, perPage);
    }

    public List<User> getUserFollowing(String username) throws ResponseException {
        return getUserFollowing(username, Parameter.DEFAULT_PAGE, Parameter.DEFAULT_PER_PAGE);
    }

    // TODO; test
    public List<User> getUserFollowing(String username, int page, int perPage) throws ResponseException {
        Response response;

        List<User> users;

        String url = USER_FOLLOWING.replace(Parameter.USER, username)
                + "?"
                + Parameter.PAGE + page
                + "&"
                + Parameter.PER_PAGE + perPage;

        try {
            response = http.get(url, Parameter.TAG_USER_SERVICE);
            if (response.code() != Parameter.STATUS_200) {
                throw new ResponseException(response.toString());
            }

            users = gson.fromJson(response.body().string(), new TypeToken<List<User>>(){}.getType());
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }

        return users;
    }

    public boolean getRelationShip(int id, int targetId) throws ResponseException {
        return getRelationShip(String.valueOf(id), String.valueOf(targetId));
    }

    // TODO: test
    public boolean getRelationShip(String username, String targetUsername) throws ResponseException {
        String url = RELATIONSHIP.replace(Parameter.USER, username).replace(Parameter.TARGET_USER, targetUsername);

        try {
            Response response = http.get(url, Parameter.TAG_USER_SERVICE);
            if (response.code() == Parameter.STATUS_204) {
                return true;
            } else if (response.code() == Parameter.STATUS_404) {
                return false;
            } else {
                throw new ResponseException(response.toString());
            }
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
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

    public List<Bucket> getAuthenticatedUserBuckets() throws ResponseException {
        return getAuthenticatedUserBuckets(Parameter.DEFAULT_PAGE, Parameter.DEFAULT_PER_PAGE);
    }

    // TODO: test
    public List<Bucket> getAuthenticatedUserBuckets(int page, int perPage) throws ResponseException {
        Response response;

        List<Bucket> buckets;

        String url = AUTHENTICATED_USER_BUCKETS
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

    public List<User> getAuthenticatedUserFollowers() throws ResponseException {
        return getAuthenticatedUserFollowers(Parameter.DEFAULT_PAGE, Parameter.DEFAULT_PER_PAGE);
    }

    // TODO; test
    public List<User> getAuthenticatedUserFollowers(int page, int perPage) throws ResponseException {
        Response response;

        List<User> users;

        String url = AUTHENTICATED_USER_FOLLOWERS
                + "?"
                + Parameter.PAGE + page
                + "&"
                + Parameter.PER_PAGE + perPage;

        try {
            response = http.get(url, Parameter.TAG_USER_SERVICE);
            if (response.code() != Parameter.STATUS_200) {
                throw new ResponseException(response.toString());
            }

            users = gson.fromJson(response.body().string(), new TypeToken<List<User>>(){}.getType());
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }

        return users;
    }

    public List<User> getAuthenticatedUserFollowing() throws ResponseException {
        return getAuthenticatedUserFollowing(Parameter.DEFAULT_PAGE, Parameter.DEFAULT_PER_PAGE);
    }

    // TODO; test
    public List<User> getAuthenticatedUserFollowing(int page, int perPage) throws ResponseException {
        Response response;

        List<User> users;

        String url = AUTHENTICATED_USER_FOLLOWING
                + "?"
                + Parameter.PAGE + page
                + "&"
                + Parameter.PER_PAGE + perPage;

        try {
            response = http.get(url, Parameter.TAG_USER_SERVICE);
            if (response.code() != Parameter.STATUS_200) {
                throw new ResponseException(response.toString());
            }

            users = gson.fromJson(response.body().string(), new TypeToken<List<User>>(){}.getType());
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }

        return users;
    }

    public List<Shot> getAuthenticatedUserFollowingShots() throws ResponseException {
        return getAuthenticatedUserFollowingShots(Parameter.DEFAULT_PAGE, Parameter.DEFAULT_PER_PAGE);
    }

    // TODO: test
    public List<Shot> getAuthenticatedUserFollowingShots(int page, int perPage) throws ResponseException {
        Response response;

        List<Shot> shots;

        String url = AUTHENTICATED_USER_FOLLOWING_SHOTS
                + "?"
                + Parameter.PAGE + page
                + "&"
                + Parameter.PER_PAGE + perPage;

        try {
            response = http.get(url, Parameter.TAG_USER_SERVICE);
            if (response.code() != Parameter.STATUS_200) {
                throw new ResponseException(response.toString());
            }

            shots = gson.fromJson(response.body().string(), new TypeToken<List<Shot>>(){}.getType());
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }

        return shots;
    }
}
