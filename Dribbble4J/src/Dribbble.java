public class Dribbble {
    private String accessToken;
    public String getAccessToken() {
        return accessToken;
    }
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Dribbble(String accessToken) {
        this.accessToken = accessToken;
    }
}
