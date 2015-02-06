public class Team {
    public static final String ID = "id";

    public static final String NAME = "name";

    public static final String USERNAME = "username";

    public static final String HTML_URL = "html_url";

    public static final String AVATAR_URL = "avatar_url";

    public static final String BIO = "bio";

    public static final String LOCATION = "location";

    public static final String LINKS = "links";

    public static final String BUCKETS_COUNT = "buckets_count";

    public static final String FOLLOWERS_COUNT = "followers_count";

    public static final String FOLLOWINGS_COUNT = "followings_count";

    public static final String LIKES_COUNT = "likes_count";

    public static final String MEMBERS_COUNT = "members_count";

    public static final String PROJECTS_COUNT = "projects_count";

    public static final String SHOTS_COUNT = "shots_count";

    public static final String TYPE = "type";

    public static final String PRO = "pro";

    public static final String BUCKETS_URL = "buckets_url";

    public static final String FOLLOWERS_URL = "followers_url";

    public static final String FOLLOWING_URL = "following_url";

    public static final String LIKES_URL = "likes_url";

    public static final String MEMBERS_URL = "members_url";

    public static final String SHOTS_URL = "shots_url";

    public static final String TEAM_SHOTS_URL = "team_shots_url";

    public static final String CREATED_AT = "created_at";

    public static final String UPDATED_AT = "updated_at";

    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private String username;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    private String htmlURL;
    public String getHtmlURL() {
        return htmlURL;
    }
    public void setHtmlUrl(String htmlURL) {
        this.htmlURL = htmlURL;
    }

    private String avatarURL;
    public String getAvatarURL() {
        return avatarURL;
    }
    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
    }

    private String bio;
    public String getBio() {
        return bio;
    }
    public void setBio(String bio) {
        this.bio = bio;
    }

    private String location;
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    private Links links;
    public Links getLinks() {
        return links;
    }
    public void setLinks(Links links) {
        this.links = links;
    }

    private int bucketsCount;
    public int getBucketsCount() {
        return bucketsCount;
    }
    public void setBucketsCount(int bucketsCount) {
        this.bucketsCount = bucketsCount;
    }

    private int followersCount;
    public int getFollowersCount() {
        return followersCount;
    }
    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }

    private int followingsCount;
    public int getFollowingsCount() {
        return followingsCount;
    }
    public void setFollowingsCount(int followingsCount) {
        this.followingsCount = followingsCount;
    }

    private int likesCount;
    public int getLikesCount() {
        return likesCount;
    }
    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    private int membersCount;
    public int getMembersCount() {
        return membersCount;
    }
    public void setMembersCount(int membersCount) {
        this.membersCount = membersCount;
    }

    private int projectsCount;
    public int getProjectsCount() {
        return projectsCount;
    }
    public void setProjectsCount(int projectsCount) {
        this.projectsCount = projectsCount;
    }

    private int shotsCount;
    public int getShotsCount() {
        return shotsCount;
    }
    public void setShotsCount(int shotsCount) {
        this.shotsCount = shotsCount;
    }

    private String type;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    private boolean pro;
    public boolean isPro() {
        return pro;
    }
    public void setPro(boolean pro) {
        this.pro = pro;
    }

    private String bucketsURL;
    public String getBucketsURL() {
        return bucketsURL;
    }
    public void setBucketsURL(String bucketsURL) {
        this.bucketsURL = bucketsURL;
    }

    private String followersURL;
    public String getFollowersURL() {
        return followersURL;
    }
    public void setFollowersURL(String followersURL) {
        this.followersURL = followersURL;
    }

    private String followingURL;
    public String getFollowingURL() {
        return followingURL;
    }
    public void setFollowingURL(String followingURL) {
        this.followingURL = followingURL;
    }

    private String likesURL;
    public String getLikesURL() {
        return likesURL;
    }
    public void setLikesURL(String likesURL) {
        this.likesURL = likesURL;
    }

    private String membersURL;
    public String getMembersURL() {
        return membersURL;
    }
    public void setMembersURL(String membersURL) {
        this.membersURL = membersURL;
    }

    private String shotsURL;
    public String getShotsURL() {
        return shotsURL;
    }
    public void setShotsURL(String shotsURL) {
        this.shotsURL = shotsURL;
    }

    private String teamShotsURL;
    public String getTeamShotsURL() {
        return teamShotsURL;
    }
    public void setTeamShotsURL(String teamShotsURL) {
        this.teamShotsURL = teamShotsURL;
    }

    private String createdAt;
    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    private String updatedAt;
    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    // TODO
    public Team() {}
}
