package Dribbble;

import Network.Parameters;
import Network.Service;
import Network.Rest;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;

public class Dribbble {
    private String accessToken;
    public String getAccessToken() {
        return accessToken;
    }

    private Service.UserService userService;
    public Service.UserService getUserService() {
        return userService;
    }

    public Dribbble(final String accessToken) {
        this.accessToken = accessToken;

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setRequestInterceptor(new RequestInterceptor() {
                    @Override
                    public void intercept(RequestFacade requestFacade) {
                        requestFacade.addHeader(Parameters.AUTHORIZATION, " " + Parameters.BEARER + " " + accessToken);
                    }
                })
                .setEndpoint(Rest.SCHEMA)
                .build();

        userService = restAdapter.create(Service.UserService.class);
    }
}
