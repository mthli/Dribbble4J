package Network;

import Dribbble.Shot;

import java.util.ArrayList;
import java.util.List;

public class ShotService {
    private static final String TAG = "SHOT_SERVICE";

    private static final String SHOT = Parameter.SCHEMA + "/shots/" + Parameter.ID;

    private static final String SHOTS = Parameter.SCHEMA + "/shots";

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
        return unit.getShots(SHOTS, TAG);
    }

    public List<Shot> getShots(String list, String timeFrame, String date, String sort) throws ResponseException {
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
            url = url.substring(0, url.length() - 1);
        }

        return unit.getShots(url, TAG);
    }

    // TODO: more
}
