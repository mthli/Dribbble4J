package Network;

import Dribbble.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.List;

/**
 * The unit for GET actions.
 */
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

    public Bucket getBucket(Response response) throws ResponseException {
        try {
            return gson.fromJson(response.body().string(), Bucket.class);
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public Project getProject(String url, Object tag) throws ResponseException {
        return gson.fromJson(getJson(url, tag), Project.class);
    }

    public Project getProject(Response response) throws ResponseException {
        try {
            return gson.fromJson(response.body().string(), Project.class);
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public Shot getShot(String url, Object tag) throws ResponseException {
        return gson.fromJson(getJson(url, tag), Shot.class);
    }

    public Shot getShot(Response response) throws ResponseException {
        try {
            return gson.fromJson(response.body().string(), Shot.class);
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public Attachment getAttachment(String url, Object tag) throws ResponseException {
        return gson.fromJson(getJson(url, tag), Attachment.class);
    }

    public Attachment getAttachment(Response response) throws ResponseException {
        try {
            return gson.fromJson(response.body().string(), Attachment.class);
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public Comment getComment(String url, Object tag) throws ResponseException {
        return gson.fromJson(getJson(url, tag), Comment.class);
    }

    public Comment getComment(Response response) throws ResponseException {
        try {
            return gson.fromJson(response.body().string(), Comment.class);
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public Like getLike(String url, Object tag) throws ResponseException {
        return gson.fromJson(getJson(url, tag), Like.class);
    }

    public Like getLike(Response response) throws ResponseException {
        try {
            return gson.fromJson(response.body().string(), Like.class);
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public Rebound getRebound(String url, Object tag) throws ResponseException {
        return gson.fromJson(getJson(url, tag), Rebound.class);
    }

    public Rebound getRebound(Response response) throws ResponseException {
        try {
            return gson.fromJson(response.body().string(), Rebound.class);
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public Team getTeam(String url, Object tag) throws ResponseException {
        return gson.fromJson(getJson(url, tag), Team.class);
    }

    public Team getTeam(Response response) throws ResponseException {
        try {
            return gson.fromJson(response.body().string(), Team.class);
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public User getUser(String url, Object tag) throws ResponseException {
        return gson.fromJson(getJson(url, tag), User.class);
    }

    public User getUser(Response response) throws ResponseException {
        try {
            return gson.fromJson(response.body().string(), User.class);
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public List<Bucket> getBuckets(String url, Object tag) throws ResponseException {
        return gson.fromJson(getJson(url, tag), new TypeToken<List<Bucket>>() {
        }.getType());
    }

    public List<Bucket> getBuckets(Response response) throws ResponseException {
        try {
            return gson.fromJson(response.body().string(), new TypeToken<List<Bucket>>() {
            }.getType());
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public List<Project> getProjects(String url, Object tag) throws ResponseException {
        return gson.fromJson(getJson(url, tag), new TypeToken<List<Project>>() {
        }.getType());
    }

    public List<Project> getProjects(Response response) throws ResponseException {
        try {
            return gson.fromJson(response.body().string(), new TypeToken<List<Project>>() {
            }.getType());
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public List<Shot> getShots(String url, Object tag) throws ResponseException {
        return gson.fromJson(getJson(url, tag), new TypeToken<List<Shot>>() {
        }.getType());
    }

    public List<Shot> getShots(Response response) throws ResponseException {
        try {
            return gson.fromJson(response.body().string(), new TypeToken<List<Shot>>() {
            }.getType());
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public List<Attachment> getAttachments(String url, Object tag) throws ResponseException {
        return gson.fromJson(getJson(url, tag), new TypeToken<List<Attachment>>() {
        }.getType());
    }

    public List<Attachment> getAttachments(Response response) throws ResponseException {
        try {
            return gson.fromJson(response.body().string(), new TypeToken<List<Attachment>>() {
            }.getType());
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public List<Comment> getComments(String url, Object tag) throws ResponseException {
        return gson.fromJson(getJson(url, tag), new TypeToken<List<Comment>>(){}.getType());
    }

    public List<Comment> getComments(Response response) throws ResponseException {
        try {
            return gson.fromJson(response.body().string(), new TypeToken<List<Comment>>(){}.getType());
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public List<Like> getLikes(String url, Object tag) throws ResponseException {
        return gson.fromJson(getJson(url, tag), new TypeToken<List<Like>>(){}.getType());
    }

    public List<Like> getLikes(Response response) throws ResponseException {
        try {
            return gson.fromJson(response.body().string(), new TypeToken<List<Like>>(){}.getType());
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public List<Rebound> getRebounds(String url, Object tag) throws ResponseException {
        return gson.fromJson(getJson(url, tag), new TypeToken<List<Rebound>>(){}.getType());
    }

    public List<Rebound> getRebounds(Response response) throws ResponseException {
        try {
            return gson.fromJson(response.body().string(), new TypeToken<List<Rebound>>(){}.getType());
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public List<Team> getTeams(String url, Object tag) throws ResponseException {
        return gson.fromJson(getJson(url, tag), new TypeToken<List<Team>>() {
        }.getType());
    }

    public List<Team> getTeams(Response response) throws ResponseException {
        try {
            return gson.fromJson(response.body().string(), new TypeToken<List<Team>>() {
            }.getType());
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public List<User> getUsers(String url, Object tag) throws ResponseException {
        return gson.fromJson(getJson(url, tag), new TypeToken<List<User>>() {
        }.getType());
    }

    public List<User> getUsers(Response response) throws ResponseException {
        try {
            return gson.fromJson(response.body().string(), new TypeToken<List<User>>() {
            }.getType());
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
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