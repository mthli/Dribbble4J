package Dribbble;

public class Links {
    public static final String WEB = "web";

    public static final String TWITTER = "twitter";

    private String web;
    public String getWeb() {
        return web;
    }
    public void setWeb(String web) {
        this.web = web;
    }

    private String twitter;
    public String getTwitter() {
        return twitter;
    }
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public Links() {
        this.web = null;
        this.twitter = null;
    }
}
