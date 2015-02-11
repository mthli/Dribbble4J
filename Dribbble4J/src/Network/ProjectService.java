package Network;

import Dribbble.Project;
import Dribbble.Shot;

import java.util.List;

/**
 * Actions of projects.
 *
 * @see <a href="http://help.dribbble.com/customer/portal/articles/1039423-what-is-a-project-">Dribbble Help #what is a project?</a>
 * @see <a href="http://developer.dribbble.com/v1/projects/">Dribbble API #projects</a>
 */
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
        return getProjectShots(id, Parameter.DEFAULT_PAGE, Parameter.DEFAULT_PER_PAGE);
    }

    public List<Shot> getProjectShots(int id, int page, int perPage) throws ResponseException {
        String url = PROJECT_SHOTS.replace(Parameter.ID, String.valueOf(id))
                + "?"
                + Parameter.PAGE + page
                + "&"
                + Parameter.PER_PAGE + perPage;
        return unit.getShots(url, TAG);
    }
}
