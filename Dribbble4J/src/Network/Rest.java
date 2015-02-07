package Network;

public class Rest {
    public static final String SCHEMA = "https://api.dribbble.com/v1";

    public static final String USER = "/users/{" + Parameters.USER + "}";

    public static final String USER_BUCKETS = "/users/{" + Parameters.USER + "}/buckets";

    public static final String USER_FOLLOWERS = "/users/{" + Parameters.USER + "}/followers";

    public static final String USER_FOLLOWING = "/users/{" + Parameters.USER + "}/following";

    public static final String RELATIONSHIP = "/users/{" + Parameters.USER +"}/following/{" + Parameters.TARGET_USER + "}";

    public static final String AUTHENTICATED_USER = "/user";

    public static final String AUTHENTICATED_USER_BUCKETS = "/user/buckets";

    public static final String AUTHENTICATED_USER_FOLLOWERS = "/user/followers";

    public static final String AUTHENTICATED_USER_FOLLOWING = "/user/following";

    public static final String AUTHENTICATED_USER_FOLLOWING_SHOTS = "/user/following/shots";

    public static final String IS_FOLLOWING = "/user/following/{" + Parameters.USER + "}";

    public static final String FOLLOW = "/users/{" + Parameters.USER + "}/follow";

    public static final String UNFOLLOW = "/users/{" + Parameters.USER + "}/follow";
}
