package Network;

import Dribbble.*;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.List;

/**
 * Actions of users.
 *
 * @see <a href="http://developer.dribbble.com/v1/users/">Dribbble API #users</a>
 */
public class UserService {
    private static final String TAG = "USER_SERVICE";
    
    private static final String USER = Parameter.SCHEMA + "/users/" + Parameter.HOLDER_USER;

    private static final String USER_BUCKETS = Parameter.SCHEMA + "/users/" + Parameter.HOLDER_USER + "/buckets";

    private static final String USER_FOLLOWERS = Parameter.SCHEMA + "/users/" + Parameter.HOLDER_USER + "/followers";

    private static final String USER_FOLLOWING = Parameter.SCHEMA + "/users/" + Parameter.HOLDER_USER + "/following";

    private static final String RELATIONSHIP = Parameter.SCHEMA + "/users/" + Parameter.HOLDER_USER + "/following/" + Parameter.HOLDER_TARGET_USER;

    private static final String USER_LIKES = Parameter.SCHEMA + "/users/" + Parameter.HOLDER_USER + "/likes";

    private static final String USER_PROJECTS = Parameter.SCHEMA + "/users/" + Parameter.HOLDER_USER + "/projects";

    private static final String USER_SHOTS = Parameter.SCHEMA + "/users/" + Parameter.HOLDER_USER + "/shots";

    private static final String USER_TEAMS = Parameter.SCHEMA + "/users/" + Parameter.HOLDER_USER + "/teams";

    private static final String AUTHENTICATED_USER = Parameter.SCHEMA + "/user";

    private static final String AUTHENTICATED_USER_BUCKETS = Parameter.SCHEMA + "/user/buckets";

    private static final String AUTHENTICATED_USER_FOLLOWERS = Parameter.SCHEMA + "/user/followers";

    private static final String AUTHENTICATED_USER_FOLLOWING = Parameter.SCHEMA + "/user/following";

    private static final String AUTHENTICATED_USER_FOLLOWING_SHOTS = Parameter.SCHEMA + "/user/following/shots";

    private static final String IS_FOLLOWING = Parameter.SCHEMA + "/user/following/" + Parameter.HOLDER_USER;

    private static final String FOLLOW = Parameter.SCHEMA + "/users/" + Parameter.HOLDER_USER + "/follow";

    private static final String UNFOLLOW = Parameter.SCHEMA + "/users/" + Parameter.HOLDER_USER + "/follow";

    private static final String AUTHENTICATED_USER_LIKES = Parameter.SCHEMA + "/user/likes";

    private static final String AUTHENTICATED_USER_PROJECTS = Parameter.SCHEMA + "/user/projects";

    private static final String AUTHENTICATED_USER_SHOTS = Parameter.SCHEMA + "/user/shots";

    private static final String AUTHENTICATED_USER_TEAMS = Parameter.SCHEMA + "/user/teams";

    private Http http;

    private Unit unit;

    public UserService(Http http) {
        this.http = http;
        this.unit = new Unit(http);
    }

    public void cancel() {
        http.cancel(TAG);
    }

    public User getUser(int id) throws ResponseException {
        return getUser(String.valueOf(id));
    }

    public User getUser(String username) throws ResponseException {
        String url = USER.replace(Parameter.HOLDER_USER, username);
        return unit.getUser(url, TAG);
    }

    public List<Bucket> getUserBuckets(int id) throws ResponseException {
        return getUserBuckets(id, Parameter.PAGE_DEFAULT, Parameter.PER_PAGE_DEFAULT);
    }

    public List<Bucket> getUserBuckets(int id, int page, int perPage) throws ResponseException {
        return getUserBuckets(String.valueOf(id), page, perPage);
    }

    public List<Bucket> getUserBuckets(String username) throws ResponseException {
        return getUserBuckets(username, Parameter.PAGE_DEFAULT, Parameter.PER_PAGE_DEFAULT);
    }

    public List<Bucket> getUserBuckets(String username, int page, int perPage) throws ResponseException {
        String url = USER_BUCKETS.replace(Parameter.HOLDER_USER, username)
                + "?"
                + Parameter.PAGE + "=" + page
                + "&"
                + Parameter.PER_PAGE + "=" + perPage;
        return unit.getBuckets(url, TAG);
    }

    public List<User> getUserFollowers(int id) throws ResponseException {
        return getUserFollowers(id, Parameter.PAGE_DEFAULT, Parameter.PER_PAGE_DEFAULT);
    }

    public List<User> getUserFollowers(int id, int page, int perPage) throws ResponseException {
        return getUserFollowers(String.valueOf(id), page, perPage);
    }

    public List<User> getUserFollowers(String username) throws ResponseException {
        return getUserFollowers(username, Parameter.PAGE_DEFAULT, Parameter.PER_PAGE_DEFAULT);
    }

    public List<User> getUserFollowers(String username, int page, int perPage) throws ResponseException {
        String url = USER_FOLLOWERS.replace(Parameter.HOLDER_USER, username)
                + "?"
                + Parameter.PAGE + "=" + page
                + "&"
                + Parameter.PER_PAGE + "=" + perPage;
        return unit.getUsers(url, TAG);
    }

    public List<User> getUserFollowing(int id) throws ResponseException {
        return getUserFollowing(id, Parameter.PAGE_DEFAULT, Parameter.PER_PAGE_DEFAULT);
    }

    public List<User> getUserFollowing(int id, int page, int perPage) throws ResponseException {
        return getUserFollowing(String.valueOf(id), page, perPage);
    }

    public List<User> getUserFollowing(String username) throws ResponseException {
        return getUserFollowing(username, Parameter.PAGE_DEFAULT, Parameter.PER_PAGE_DEFAULT);
    }

    public List<User> getUserFollowing(String username, int page, int perPage) throws ResponseException {
        String url = USER_FOLLOWING.replace(Parameter.HOLDER_USER, username)
                + "?"
                + Parameter.PAGE + "=" + page
                + "&"
                + Parameter.PER_PAGE + "=" + perPage;
        return unit.getUsers(url, TAG);
    }

    public boolean getRelationShip(int id, int targetId) throws ResponseException {
        return getRelationShip(String.valueOf(id), String.valueOf(targetId));
    }

    public boolean getRelationShip(String username, String targetUsername) throws ResponseException {
        String url = RELATIONSHIP.replace(Parameter.HOLDER_USER, username).replace(Parameter.HOLDER_TARGET_USER, targetUsername);

        try {
            Response response = http.get(url, TAG);
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

    public List<Shot> getUserLikes(int id) throws ResponseException {
        return getUserLikes(id, Parameter.PAGE_DEFAULT, Parameter.PER_PAGE_DEFAULT);
    }

    public List<Shot> getUserLikes(int id, int page, int perPage) throws ResponseException {
        return getUserLikes(String.valueOf(id), page, perPage);
    }

    public List<Shot> getUserLikes(String username) throws ResponseException {
        return getUserLikes(username, Parameter.PAGE_DEFAULT, Parameter.PER_PAGE_DEFAULT);
    }

    public List<Shot> getUserLikes(String username, int page, int perPage) throws ResponseException {
        String url = USER_LIKES.replace(Parameter.HOLDER_USER, username)
                + "?"
                + Parameter.PAGE + "=" + page
                + "&"
                + Parameter.PER_PAGE + "=" + perPage;
        return unit.getShots(url, TAG);
    }

    public List<Project> getUserProjects(int id) throws ResponseException {
        return getUserProjects(id, Parameter.PAGE_DEFAULT, Parameter.PER_PAGE_DEFAULT);
    }

    public List<Project> getUserProjects(int id, int page, int perPage) throws ResponseException {
        return getUserProjects(String.valueOf(id), page, perPage);
    }

    public List<Project> getUserProjects(String username) throws ResponseException {
        return getUserProjects(username, Parameter.PAGE_DEFAULT, Parameter.PER_PAGE_DEFAULT);
    }

    public List<Project> getUserProjects(String username, int page, int perPage) throws ResponseException {
        String url = USER_PROJECTS.replace(Parameter.HOLDER_USER, username)
                + "?"
                + Parameter.PAGE + "=" + page
                + "&"
                + Parameter.PER_PAGE + "=" + perPage;
        return unit.getProjects(url, TAG);
    }

    public List<Shot> getUserShots(int id) throws ResponseException {
        return getUserShots(id, Parameter.PAGE_DEFAULT, Parameter.PER_PAGE_DEFAULT);
    }

    public List<Shot> getUserShots(int id, int page, int perPage) throws ResponseException {
        return getUserShots(String.valueOf(id), page, perPage);
    }

    public List<Shot> getUserShots(String username) throws ResponseException {
        return getUserShots(username, Parameter.PAGE_DEFAULT, Parameter.PER_PAGE_DEFAULT);
    }

    public List<Shot> getUserShots(String username, int page, int perPage) throws ResponseException {
        String url = USER_SHOTS.replace(Parameter.HOLDER_USER, username)
                + "?"
                + Parameter.PAGE + "=" + page
                + "&"
                + Parameter.PER_PAGE + "=" + perPage;
        return unit.getShots(url, TAG);
    }

    public List<Team> getUserTeams(int id) throws ResponseException {
        return getUserTeams(id, Parameter.PAGE_DEFAULT, Parameter.PER_PAGE_DEFAULT);
    }

    public List<Team> getUserTeams(int id, int page, int perPage) throws ResponseException {
        return getUserTeams(String.valueOf(id), page, perPage);
    }

    public List<Team> getUserTeams(String username) throws ResponseException {
        return getUserTeams(username, Parameter.PAGE_DEFAULT, Parameter.PER_PAGE_DEFAULT);
    }

    public List<Team> getUserTeams(String username, int page, int perPage) throws ResponseException {
        String url = USER_TEAMS.replace(Parameter.HOLDER_USER, username)
                + "?"
                + Parameter.PAGE + "=" + page
                + "&"
                + Parameter.PER_PAGE + "=" + perPage;
        return unit.getTeams(url, TAG);
    }

    public User getAuthenticatedUser() throws ResponseException {
        return unit.getUser(AUTHENTICATED_USER, TAG);
    }

    public List<Bucket> getAuthenticatedUserBuckets() throws ResponseException {
        return getAuthenticatedUserBuckets(Parameter.PAGE_DEFAULT, Parameter.PER_PAGE_DEFAULT);
    }

    public List<Bucket> getAuthenticatedUserBuckets(int page, int perPage) throws ResponseException {
        String url = AUTHENTICATED_USER_BUCKETS
                + "?"
                + Parameter.PAGE + "=" + page
                + "&"
                + Parameter.PER_PAGE + "=" + perPage;
        return unit.getBuckets(url, TAG);
    }

    public List<User> getAuthenticatedUserFollowers() throws ResponseException {
        return getAuthenticatedUserFollowers(Parameter.PAGE_DEFAULT, Parameter.PER_PAGE_DEFAULT);
    }

    public List<User> getAuthenticatedUserFollowers(int page, int perPage) throws ResponseException {
        String url = AUTHENTICATED_USER_FOLLOWERS
                + "?"
                + Parameter.PAGE + "=" + page
                + "&"
                + Parameter.PER_PAGE + "=" + perPage;
        return unit.getUsers(url, TAG);
    }

    public List<User> getAuthenticatedUserFollowing() throws ResponseException {
        return getAuthenticatedUserFollowing(Parameter.PAGE_DEFAULT, Parameter.PER_PAGE_DEFAULT);
    }

    public List<User> getAuthenticatedUserFollowing(int page, int perPage) throws ResponseException {
        String url = AUTHENTICATED_USER_FOLLOWING
                + "?"
                + Parameter.PAGE + "=" + page
                + "&"
                + Parameter.PER_PAGE + "=" + perPage;
        return unit.getUsers(url, TAG);
    }

    public List<Shot> getAuthenticatedUserFollowingShots() throws ResponseException {
        return getAuthenticatedUserFollowingShots(Parameter.PAGE_DEFAULT, Parameter.PER_PAGE_DEFAULT);
    }

    public List<Shot> getAuthenticatedUserFollowingShots(int page, int perPage) throws ResponseException {
        String url = AUTHENTICATED_USER_FOLLOWING_SHOTS
                + "?"
                + Parameter.PAGE + "=" + page
                + "&"
                + Parameter.PER_PAGE + "=" + perPage;
        return unit.getShots(url, TAG);
    }

    public boolean isFollowing(int id) throws ResponseException {
        return isFollowing(String.valueOf(id));
    }

    public boolean isFollowing(String username) throws ResponseException {
        String url = IS_FOLLOWING.replace(Parameter.HOLDER_USER, username);

        try {
            Response response = http.get(url, TAG);
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

    public void follow(int id) throws ResponseException {
        follow(String.valueOf(id));
    }

    public void follow(String username) throws ResponseException {
        String url = FOLLOW.replace(Parameter.HOLDER_USER, username);

        try {
            Response response = http.put(null, url, TAG);
            if (response.code() != Parameter.STATUS_204) {
                throw new ResponseException(response.toString());
            }
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public void unfollow(int id) throws ResponseException {
        unfollow(String.valueOf(id));
    }

    public void unfollow(String username) throws ResponseException {
        String url = UNFOLLOW.replace(Parameter.HOLDER_USER, username);

        try {
            Response response = http.delete(url, TAG);
            if (response.code() != Parameter.STATUS_204) {
                throw new ResponseException(response.toString());
            }
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public List<Shot> getAuthenticatedUserLikes() throws ResponseException {
        return getAuthenticatedUserLikes(Parameter.PAGE_DEFAULT, Parameter.PER_PAGE_DEFAULT);
    }

    public List<Shot> getAuthenticatedUserLikes(int page, int perPage) throws ResponseException {
        String url = AUTHENTICATED_USER_LIKES
                + "?"
                + Parameter.PAGE + "=" + page
                + "&"
                + Parameter.PER_PAGE + "=" + perPage;
        return unit.getShots(url, TAG);
    }

    public List<Project> getAuthenticatedUserProjects() throws ResponseException {
        return getAuthenticatedUserProjects(Parameter.PAGE_DEFAULT, Parameter.PER_PAGE_DEFAULT);
    }

    public List<Project> getAuthenticatedUserProjects(int page, int perPage) throws ResponseException {
        String url = AUTHENTICATED_USER_PROJECTS
                + "?"
                + Parameter.PAGE + "=" + page
                + "&"
                + Parameter.PER_PAGE + "=" + perPage;
        return unit.getProjects(url, TAG);
    }

    public List<Shot> getAuthenticatedUserShots() throws ResponseException {
        return getAuthenticatedUserShots(Parameter.PAGE_DEFAULT, Parameter.PER_PAGE_DEFAULT);
    }

    public List<Shot> getAuthenticatedUserShots(int page, int perPage) throws ResponseException {
        String url = AUTHENTICATED_USER_SHOTS
                + "?"
                + Parameter.PAGE + "=" + page
                + "&"
                + Parameter.PER_PAGE + "=" + perPage;
        return unit.getShots(url, TAG);
    }

    public List<Team> getAuthenticatedUserTeams() throws ResponseException {
        return getAuthenticatedUserTeams(Parameter.PAGE_DEFAULT, Parameter.PER_PAGE_DEFAULT);
    }

    public List<Team> getAuthenticatedUserTeams(int page, int perPage) throws ResponseException {
        String url = AUTHENTICATED_USER_TEAMS
                + "?"
                + Parameter.PAGE + "=" + page
                + "&"
                + Parameter.PER_PAGE + "=" + perPage;
        return unit.getTeams(url, TAG);
    }
}
