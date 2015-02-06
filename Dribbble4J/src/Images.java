public class Images {
    public static final String HIDPI = "hidpi";

    public static final String NORMAL = "normal";

    public static final String TEASER = "teaser";

    private String hidpi;
    public String getHidpi() {
        return hidpi;
    }
    public void setHidpi(String hidpi) {
        this.hidpi = hidpi;
    }

    private String normal;
    public String getNormal() {
        return normal;
    }
    public void setNormal(String normal) {
        this.normal = normal;
    }

    private String teaser;
    public String getTeaser() {
        return teaser;
    }
    public void setTeaser(String teaser) {
        this.teaser = teaser;
    }

    // TODO
    public Images() {}
}
