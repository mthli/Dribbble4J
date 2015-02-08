package Network;

import Dribbble.Project;
import Dribbble.Shot;

import java.util.List;

public class ProjectService {
    private static final String TAG = "PROJECT_SERVICE";

    private static final String PROJECT = Parameter.SCHEMA + "/projects/" + Parameter.ID;

    private static final String PROJECT_SHOTS = Parameter.SCHEMA + "/projects/" + Parameter.ID + "/shots";

    private Http http;

    private Unit unit;

    public ProjectService(Http http) {
        this.http = http;
        this.unit = new Unit(http);
    }

    public void cancel() {
        http.cancel(TAG);
    }

    public Project getProject(int id) throws ResponseException {
        String url = PROJECT.replace(Parameter.ID, String.valueOf(id));
        return unit.getProject(url, TAG);
    }

    public List<Shot> getProjectShots(int id) throws ResponseException {
        String url = PROJECT_SHOTS.replace(Parameter.ID, String.valueOf(id));
        return unit.getShots(url, TAG);
    }
}
