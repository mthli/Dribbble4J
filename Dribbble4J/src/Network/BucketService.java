package Network;

import Dribbble.Bucket;
import Dribbble.Shot;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.List;

public class BucketService {
    private static final String TAG = "BUCKET_SERVICE";

    private static final String BUCKET = Parameter.SCHEMA + "/buckets/" + Parameter.ID;

    private static final String CREATE = Parameter.SCHEMA + "/buckets";

    private static final String BUCKET_SHOTS = Parameter.SCHEMA + "/buckets/" + Parameter.ID + "/shots";

    private Http http;

    private Unit unit;

    public BucketService(Http http) {
        this.http = http;
        this.unit = new Unit(http);
    }

    public void cancel() {
        http.cancel(TAG);
    }

    public Bucket getBucket(int id) throws ResponseException {
        String url = BUCKET.replace(Parameter.ID, String.valueOf(id));
        return unit.getBucket(url, TAG);
    }

    public void createBucket(String name) throws ResponseException {
        String url = CREATE + "?" + Parameter.NAME + name;

        try {
            Response response = http.post(null, url, TAG);
            if (response.code() != Parameter.STATUS_201) {
                throw new ResponseException(response.toString());
            }
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public void createBucket(String name, String description) throws ResponseException {
        String url = CREATE + "?" + Parameter.NAME + name + "&" + Parameter.DESCRIPTION + description;

        try {
            Response response = http.post(null, url, TAG);
            if (response.code() != Parameter.STATUS_201) {
                throw new ResponseException(response.toString());
            }
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public void updateBucket(int id, String name) throws ResponseException {
        String url = BUCKET.replace(Parameter.ID, String.valueOf(id)) + "?" + Parameter.NAME + name;

        try {
            Response response = http.put(null, url, TAG);
            if (response.code() != Parameter.STATUS_200) {
                throw new ResponseException(response.toString());
            }
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public void updateBucket(int id, String name, String description) throws ResponseException {
        String url = BUCKET.replace(Parameter.ID, String.valueOf(id))
                + "?"
                + Parameter.NAME + name
                + "&"
                + Parameter.DESCRIPTION + description;

        try {
            Response response = http.put(null, url, TAG);
            if (response.code() != Parameter.STATUS_200) {
                throw new ResponseException(response.toString());
            }
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public void deleteBucket(int id) throws ResponseException {
        String url = BUCKET.replace(Parameter.ID, String.valueOf(id));

        try {
            Response response = http.delete(url, TAG);
            if (response.code() != Parameter.STATUS_204) {
                throw new ResponseException(response.toString());
            }
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public List<Shot> getBucketShots(int id) throws ResponseException {
        return getBucketShots(id, Parameter.DEFAULT_PAGE, Parameter.DEFAULT_PER_PAGE);
    }

    public List<Shot> getBucketShots(int id, int page, int perPage) throws ResponseException {
        String url = BUCKET_SHOTS.replace(Parameter.ID, String.valueOf(id))
                + "?"
                + Parameter.PAGE + page
                + "&"
                + Parameter.PER_PAGE + perPage;
        return unit.getShots(url, TAG);
    }

    public void addBucketShot(int id, int shotId) throws ResponseException {
        String url = BUCKET_SHOTS.replace(Parameter.ID, String.valueOf(id))
                + "?"
                + Parameter.SHOT_ID + shotId;

        try {
            Response response = http.put(null, url, TAG);
            if (response.code() != Parameter.STATUS_204) {
                throw new ResponseException(response.toString());
            }
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }

    public void removeBucketShot(int id, int shotId) throws ResponseException {
        String url = BUCKET_SHOTS.replace(Parameter.ID, String.valueOf(id))
                + "?"
                + Parameter.SHOT_ID + shotId;

        try {
            Response response = http.delete(url, TAG);
            if (response.code() != Parameter.STATUS_204) {
                throw new ResponseException(response.toString());
            }
        } catch (IOException i) {
            throw new ResponseException(i.getMessage(), i);
        }
    }
}
