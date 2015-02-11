package Network;

import Dribbble.*;
import com.squareup.okhttp.Response;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShotService {
    private static final String TAG = "SHOT_SERVICE";

    private static final String SHOT = Parameter.SCHEMA + "/shots/" + Parameter.ID;

    private static final String SHOTS = Parameter.SCHEMA + "/shots";

    private static final String SHOT_ATTACHMENT = Parameter.SCHEMA + "/shots/" + Parameter.SHOT + "/attachments/" + Parameter.ID;

    private static final String SHOT_ATTACHMENTS = Parameter.SCHEMA + "/shots/" + Parameter.ID + "/attachments";

    private static final String SHOT_BUCKETS = Parameter.SCHEMA + "/shots/" + Parameter.ID + "/buckets";

    private static final String SHOT_COMMENT = Parameter.SCHEMA + "/shots/" + Parameter.SHOT + "/comments/" + Parameter.ID;

    private static final String SHOT_COMMENT_LIKE = Parameter.SCHEMA + "/shots/" + Parameter.SHOT + "/comments/" + Parameter.ID + "/like";

    private static final String SHOT_COMMENTS = Parameter.SCHEMA + "/shots/" + Parameter.SHOT + "/comments";

    private static final String SHOT_COMMENT_LIKES = Parameter.SCHEMA + "/shots/" + Parameter.SHOT + "/comments/" + Parameter.ID + "/likes";

    private static final String SHOT_LIKE = Parameter.SCHEMA + "/shots/" + Parameter.ID + "/like";

    private static final String SHOT_LIKES = Parameter.SCHEMA + "/shots/" + Parameter.ID + "/likes";

    private static final String SHOT_PROJECTS = Parameter.SCHEMA + "/shots/" + Parameter.ID + "/projects";

    private static final String SHOT_REBOUNDS = Parameter.SCHEMA + "/shots/" + Parameter.ID + "/rebounds";

    private Http http;

    private Unit unit;

    public ShotService(Http http) {
        this.http = http;
        this.unit = new Unit(http);
    }

    public void cancel() {
        http.cancel(TAG);
    }

    public Shot getShot(int id) throws ResponseException {
        String url = SHOT.replace(Parameter.ID, String.valueOf(id));
        return unit.getShot(url, TAG);
    }

    public List<Shot> getShots() throws ResponseException {
        return getShots(Parameter.DEFAULT_PAGE, Parameter.DEFAULT_PER_PAGE);
    }

    public List<Shot> getShots(int page, int perPage) throws ResponseException {
        String url = SHOTS + "?" + Parameter.PAGE + page + "&" + Parameter.PER_PAGE + perPage;
        return unit.getShots(url, TAG);
    }

    public List<Shot> getShots(String list, String timeFrame, String date, String sort) throws ResponseException {
        return getShots(list, timeFrame, date, sort, Parameter.DEFAULT_PAGE, Parameter.DEFAULT_PER_PAGE);
    }

    public List<Shot> getShots(String list, String timeFrame, String date, String sort, int page, int perPage) throws ResponseException {
        List<String> strings = new ArrayList<String>();
        if (list != null && list.length() > 0) {
            strings.add(Parameter.LIST + list);
        }
        if (timeFrame != null && timeFrame.length() > 0) {
            strings.add(Parameter.TIMEFRAME + timeFrame);
        }
        if (date != null && date.length() > 0) {
            strings.add(Parameter.DATE + date);
        }
        if (sort != null && sort.length() > 0) {
            strings.add(Parameter.SORT + sort);
        }

        String url = SHOTS;
        if (strings.size() > 0) {
            url = url + "?";
            for (String string : strings) {
                url = url + string + "&";
            }
        }
        url = url + Parameter.PAGE + page + "&" + Parameter.PER_PAGE + perPage;

        return unit.getShots(url, TAG);
    }

    public Attachment getShotAttachment(int shot, int id) throws ResponseException {
        String url = SHOT_ATTACHMENT.replace(Parameter.SHOT, String.valueOf(shot))
                .replace(Parameter.ID, String.valueOf(id));
        return unit.getAttachment(url, TAG);
    }

    public List<Attachment> getShotAttachments(int id) throws ResponseException {
        return getShotAttachments(id, Parameter.DEFAULT_PAGE, Parameter.DEFAULT_PER_PAGE);
    }

    public List<Attachment> getShotAttachments(int id, int page, int perPage) throws ResponseException {
        String url = SHOT_ATTACHMENTS.replace(Parameter.ID, String.valueOf(id))
                + "?"
                + Parameter.PAGE + page
                + "&"
                + Parameter.PER_PAGE + perPage;
        return unit.getAttachments(url, TAG);
    }

    public List<Bucket> getShotBuckets(int id) throws ResponseException {
        return getShotBuckets(id, Parameter.DEFAULT_PAGE, Parameter.DEFAULT_PER_PAGE);
    }

    public List<Bucket> getShotBuckets(int id, int page, int perPage) throws ResponseException {
        String url = SHOT_BUCKETS.replace(Parameter.ID, String.valueOf(id))
                + "?"
                + Parameter.PAGE + page
                + "&"
                + Parameter.PER_PAGE + perPage;
        return unit.getBuckets(url, TAG);
    }

    public Comment getComment(int shot, int id) throws ResponseException {
        String url = SHOT_COMMENT.replace(Parameter.SHOT, String.valueOf(shot)).replace(Parameter.ID, String.valueOf(id));
        return unit.getComment(url, TAG);
    }

    public Comment createComment(int shot, String body) throws ResponseException {
        String url = SHOT_COMMENTS.replace(Parameter.SHOT, String.valueOf(shot))
                + "?"
                + Parameter.BODY + body;
        url = url.replaceAll(" +", Parameter.SPACE);

        try {
            Response response = http.post(null, url, TAG);
            if (response.code() != Parameter.STATUS_201) {
                throw new ResponseException(response.toString());
            }

            return unit.getComment(response);
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public Comment updateComment(int shot, int id) throws ResponseException {
        String url = SHOT_COMMENT.replace(Parameter.SHOT, String.valueOf(shot)).replace(Parameter.ID, String.valueOf(id));

        try {
            Response response = http.put(null, url, TAG);
            if (response.code() != Parameter.STATUS_200) {
                throw new ResponseException(response.toString());
            }

            return unit.getComment(response);
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public void deleteComment(int shot, int id) throws ResponseException {
        String url = SHOT_COMMENT.replace(Parameter.SHOT, String.valueOf(shot)).replace(Parameter.ID, String.valueOf(id));

        try {
            Response response = http.delete(url, TAG);
            if (response.code() != Parameter.STATUS_204) {
                throw new ResponseException(response.toString());
            }
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public boolean isCommentLike(int shot, int id) throws ResponseException {
        String url = SHOT_COMMENT_LIKE.replace(Parameter.SHOT, String.valueOf(shot)).replace(Parameter.ID, String.valueOf(id));

        try {
            Response response = http.get(url, TAG);
            if (response.code() == Parameter.STATUS_200) {
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

    public Comment likeComment(int shot, int id) throws ResponseException {
        String url = SHOT_COMMENT_LIKE.replace(Parameter.SHOT, String.valueOf(shot)).replace(Parameter.ID, String.valueOf(id));

        try {
            Response response = http.post(null, url, TAG);
            if (response.code() != Parameter.STATUS_201) {
                throw new ResponseException(response.toString());
            }

            return unit.getComment(response);
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public void unlikeComment(int shot, int id) throws ResponseException {
        String url = SHOT_COMMENT_LIKE.replace(Parameter.SHOT, String.valueOf(shot)).replace(Parameter.ID, String.valueOf(id));

        try {
            Response response = http.delete(url, TAG);
            if (response.code() != Parameter.STATUS_204) {
                throw new ResponseException(response.toString());
            }
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public List<Comment> getShotComments(int shot) throws ResponseException {
        return getShotComments(shot, Parameter.DEFAULT_PAGE, Parameter.DEFAULT_PER_PAGE);
    }

    public List<Comment> getShotComments(int shot, int page, int perPage) throws ResponseException {
        String url = SHOT_COMMENTS.replace(Parameter.SHOT, String.valueOf(shot))
                + "?"
                + Parameter.PAGE + page
                + "&"
                + Parameter.PER_PAGE + perPage;
        return unit.getComments(url, TAG);
    }

    public List<Like> getShotCommentLikes(int shot, int id) throws ResponseException {
        return getShotCommentLikes(shot, id, Parameter.DEFAULT_PAGE, Parameter.DEFAULT_PER_PAGE);
    }

    public List<Like> getShotCommentLikes(int shot, int id, int page, int perPage) throws ResponseException {
        String url = SHOT_COMMENT_LIKES.replace(Parameter.SHOT, String.valueOf(shot))
                .replace(Parameter.ID, String.valueOf(id))
                + "?"
                + Parameter.PAGE + page
                + "&"
                + Parameter.PER_PAGE + perPage;
        return unit.getLikes(url, TAG);
    }

    public boolean isShotLike(int id) throws ResponseException {
        String url = SHOT_LIKE.replace(Parameter.ID, String.valueOf(id));

        try {
            Response response = http.get(url, TAG);
            if (response.code() == Parameter.STATUS_200) {
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

    public Like likeShot(int id) throws ResponseException {
        String url = SHOT_LIKE.replace(Parameter.ID, String.valueOf(id));

        try {
            Response response = http.post(null, url, TAG);
            if (response.code() != Parameter.STATUS_201) {
                throw new ResponseException(response.toString());
            }

            return unit.getLike(response);
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public void unlikeShot(int id) throws ResponseException {
        String url = SHOT_LIKE.replace(Parameter.ID, String.valueOf(id));

        try {
            Response response = http.delete(url, TAG);
            if (response.code() != Parameter.STATUS_204) {
                throw new ResponseException(response.toString());
            }
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public List<Like> getShotLikes(int id) throws ResponseException {
        return getShotLikes(id, Parameter.DEFAULT_PAGE, Parameter.DEFAULT_PER_PAGE);
    }

    public List<Like> getShotLikes(int id, int page, int perPage) throws ResponseException {
        String url = SHOT_LIKES.replace(Parameter.ID, String.valueOf(id))
                + "?"
                + Parameter.PAGE + page
                + "&"
                + Parameter.PER_PAGE + perPage;
        return unit.getLikes(url, TAG);
    }

    public List<Project> getShotProjects(int id) throws ResponseException {
        return getShotProjects(id, Parameter.DEFAULT_PAGE, Parameter.DEFAULT_PER_PAGE);
    }

    public List<Project> getShotProjects(int id, int page, int perPage) throws ResponseException {
        String url = SHOT_PROJECTS.replace(Parameter.ID, String.valueOf(id))
                + "?"
                + Parameter.PAGE + page
                + "&"
                + Parameter.PER_PAGE + perPage;
        return unit.getProjects(url, TAG);
    }

    public List<Rebound> getShotRebounds(int id) throws ResponseException {
        return getShotRebounds(id, Parameter.DEFAULT_PAGE, Parameter.DEFAULT_PER_PAGE);
    }

    public List<Rebound> getShotRebounds(int id, int page, int perPage) throws ResponseException {
        String url = SHOT_REBOUNDS.replace(Parameter.ID, String.valueOf(id))
                + "?"
                + Parameter.PAGE + page
                + "&"
                + Parameter.PER_PAGE + perPage;
        return unit.getRebounds(url, TAG);
    }

    public interface Player {
        public void createShot(String title, File image) throws ResponseException;

        public void createShot(String title, File image, String description, String[] tags, int teamId, int reboundSourceId) throws ResponseException;

        public void updateShot(int id) throws ResponseException;

        public void updateShot(int id, String title, String description, int teamId, String[] tags) throws ResponseException;

        public void deleteShot(int id) throws ResponseException;

        public void createShotAttachment(int shot, File file) throws ResponseException;

        public void deleteShotAttachment(int shot, int id) throws ResponseException;
    }
}
