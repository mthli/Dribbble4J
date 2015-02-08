package Network;

import Dribbble.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.List;

public class Unit {
    private Http http;

    private Gson gson;

    public Unit(Http http) {
        this.http = http;
        this.gson = new Gson();
    }

    public Bucket getBucket(String url, Object tag) throws ResponseException {
        return gson.fromJson(getJson(url, tag), Bucket.class);
    }

    public Project getProject(String url, Object tag) throws ResponseException {
        return gson.fromJson(getJson(url, tag), Project.class);
    }

    public Shot getShot(String url, Object tag) throws ResponseException {
        return gson.fromJson(getJson(url, tag), Shot.class);
    }

    public Team getTeam(String url, Object tag) throws ResponseException {
        return gson.fromJson(getJson(url, tag), Team.class);
    }

    public User getUser(String url, Object tag) throws ResponseException {
        return gson.fromJson(getJson(url, tag), User.class);
    }

    public List<Bucket> getBuckets(String url, Object tag) throws ResponseException {
        return gson.fromJson(getJson(url, tag), new TypeToken<List<Bucket>>(){}.getType());
    }

    public List<Project> getProjects(String url, Object tag) throws ResponseException {
        return gson.fromJson(getJson(url, tag), new TypeToken<List<Project>>(){}.getType());
    }

    public List<Shot> getShots(String url, Object tag) throws ResponseException {
        return gson.fromJson(getJson(url, tag), new TypeToken<List<Shot>>(){}.getType());
    }

    public List<Team> getTeams(String url, Object tag) throws ResponseException {
        return gson.fromJson(getJson(url, tag), new TypeToken<List<Team>>(){}.getType());
    }

    public List<User> getUsers(String url, Object tag) throws ResponseException {
        return gson.fromJson(getJson(url, tag), new TypeToken<List<User>>(){}.getType());
    }

    private String getJson(String url, Object tag) throws ResponseException {
        try {
            Response response = http.get(url, tag);
            if (response.code() != Parameter.STATUS_200) {
                throw new ResponseException(response.toString());
            }

            return response.body().string();
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }
}
