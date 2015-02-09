package Network;

import Dribbble.Attachment;
import Dribbble.Bucket;
import Dribbble.Shot;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ShotService {
    private static final String TAG = "SHOT_SERVICE";

    private static final String SHOT = Parameter.SCHEMA + "/shots/" + Parameter.ID;

    private static final String SHOTS = Parameter.SCHEMA + "/shots";

    private static final String SHOT_ATTACHMENT = Parameter.SCHEMA + "/shots/" + Parameter.SHOT + "/attachments/" + Parameter.ID;

    private static final String SHOT_ATTACHMENTS = Parameter.SCHEMA + "/shots/" + Parameter.ID + "/attachments";

    private static final String SHOT_BUCKETS = Parameter.SCHEMA + "/shots/" + Parameter.ID + "/buckets";

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
