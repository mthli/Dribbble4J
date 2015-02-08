package Network;

import Dribbble.Shot;
import Dribbble.User;

import java.util.List;

public class TeamService {
    private static final String TAG = "TEAM_SERVICE";

    private static final String TEAM_MEMBERS = Parameter.SCHEMA + "/teams/" + Parameter.TEAM + "/members";

    private static final String TEAM_SHOTS = Parameter.SCHEMA + "/teams/" + Parameter.TEAM + "/shots";

    private Http http;

    private Unit unit;

    public TeamService(Http http) {
        this.http = http;
        this.unit = new Unit(http);
    }

    public void cancel() {
        http.cancel(TAG);
    }

    public List<User> getTeamMembers(int id) throws ResponseException {
        return getTeamMembers(id, Parameter.DEFAULT_PAGE, Parameter.DEFAULT_PER_PAGE);
    }

    public List<User> getTeamMembers(int id, int page, int perPage) throws ResponseException {
        return getTeamMembers(String.valueOf(id), page, perPage);
    }

    public List<User> getTeamMembers(String username) throws ResponseException {
        return getTeamMembers(username, Parameter.DEFAULT_PAGE, Parameter.DEFAULT_PER_PAGE);
    }

    public List<User> getTeamMembers(String username, int page, int perPage) throws ResponseException {
        String url = TEAM_MEMBERS.replace(Parameter.TEAM, username)
                + "?"
                + Parameter.PAGE + page
                + "&"
                + Parameter.PER_PAGE + perPage;
        return unit.getUsers(url, TAG);
    }

    public List<Shot> getTeamShots(int id) throws ResponseException {
        return getTeamShots(id, Parameter.DEFAULT_PAGE, Parameter.DEFAULT_PER_PAGE);
    }

    public List<Shot> getTeamShots(int id, int page, int perPage) throws ResponseException {
        return getTeamShots(String.valueOf(id), page, perPage);
    }

    public List<Shot> getTeamShots(String username) throws ResponseException {
        return getTeamShots(username, Parameter.DEFAULT_PAGE, Parameter.DEFAULT_PER_PAGE);
    }

    public List<Shot> getTeamShots(String username, int page, int perPage) throws ResponseException {
        String url = TEAM_SHOTS.replace(Parameter.TEAM, username)
                + "?"
                + Parameter.PAGE + page
                + "&"
                + Parameter.PER_PAGE + perPage;
        return unit.getShots(url, TAG);
    }
}
