package Dribbble;

import Network.*;

public class Dribbble {
    private String accessToken;
    public String getAccessToken() {
        return accessToken;
    }

    private Http http;
    public Http getHttp() {
        return http;
    }

    private BucketService bucketService;
    public BucketService getBucketService() {
        return bucketService;
    }

    private ProjectService projectService;
    public ProjectService getProjectService() {
        return projectService;
    }

    private ShotService shotService;
    public ShotService getShotService() {
        return shotService;
    }

    private TeamService teamService;
    public TeamService getTeamService() {
        return teamService;
    }

    private UserService userService;
    public UserService getUserService() {
        return userService;
    }

    public Dribbble(String accessToken) {
        this.accessToken = accessToken;
        this.http = new Http(accessToken);
        this.bucketService = new BucketService(this.http);
        this.projectService = new ProjectService(this.http);
        this.shotService = new ShotService(this.http);
        this.teamService = new TeamService(this.http);
        this.userService = new UserService(this.http);
    }
}
