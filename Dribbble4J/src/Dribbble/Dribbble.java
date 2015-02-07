package Dribbble;

import Network.Http;

public class Dribbble {
    private String accessToken;
    public String getAccessToken() {
        return accessToken;
    }

    private Http http;
    public Http getHttp() {
        return http;
    }

    public Dribbble(String accessToken) {
        this.accessToken = accessToken;
        this.http = new Http(accessToken);
    }
}
