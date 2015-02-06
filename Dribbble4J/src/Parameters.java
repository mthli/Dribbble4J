public class Parameters {
    /**
     * All API access is over HTTPS, and accessed from the api.dribbble.com/v1/ endpoint.
     *
     * @see <a href="http://developer.dribbble.com/v1/#schema">Dribbble API Overview #Scheme</a>
     */
    public static final String SCHEMA = "https://api.dribbble.com/v1/";

    /**
     * The application access token you got from Dribbble Applications.
     *
     * @see <a href="https://dribbble.com/account/applications/new">Dribbble Applications</a>
     */
    public static final String ACCESS_TOKEN = "access_token";

    /**
     * All timestamps are returned in ISO 8601 format YYYY-MM-DDTHH:MM:SSZ.
     *
     * @see <a href="http://developer.dribbble.com/v1/#schema">Dribbble API Overview #Scheme</a>
     */
    public static final String TIMESTAMP = "YYYY-MM-DDTHH:MM:SSZ";

    /**
     * Limit the results to a specific type with the following possible values:
     * - animated
     * - attachments
     * - debuts
     * - playoffs
     * - rebounds
     * - teams
     *
     * Default: Results of any type.
     */
    public static final String LIST = "list";

    /**
     * A period of time to limit the results to with the following possible values:
     * - week
     * - month
     * - year
     * - ever
     * Note that the value is ignored when sorting with recent.
     *
     * Default: Results from now.
     */
    public static final String TIMEFRAME = "timeframe";

    /**
     * Limit the timeframe to a specific date, week, month, or year.
     * Must be in the format of YYYY-MM-DD.
     */
    public static final String DATE = "date";

    /**
     * The sort field with the following possible values:
     * - comments
     * - recent
     * - views
     *
     * Default: Results are sorted by popularity.
     */
    public static final String SORT = "sort";
}
