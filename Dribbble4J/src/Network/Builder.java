package Network;

public class Builder {
    public static String getSingleUserURL(String accessToken, int id) {
        return URLs.SINGLE_USER_URL
                + id
                + "?"
                + Parameters.ACCESS_TOKEN
                + "="
                + accessToken;
    }

    public static String getSingleUserURL(String accessToken, String username) {
        return URLs.SINGLE_USER_URL
                + username
                + "?"
                + Parameters.ACCESS_TOKEN
                + "="
                + accessToken;
    }

    public static String getAuthenticatedUserURL(String accessToken) {
        return URLs.AUTHENTICATED_USER_URL
                + "?"
                + Parameters.ACCESS_TOKEN
                + "="
                + accessToken;
    }
}
