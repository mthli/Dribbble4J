package Dribbble;

public class User {
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

    public static final String PROJECTS_COUNT = "projects_count";

    public static final String SHOTS_COUNT = "shots_count";

    public static final String TEAMS_COUNT = "teams_count";

    public static final String TYPE = "type";

    public static final String PRO = "pro";

    public static final String BUCKETS_URL = "buckets_url";

    public static final String FOLLOWERS_URL = "followers_url";

    public static final String FOLLOWING_URL = "following_url";

    public static final String LIKES_URL = "likes_url";

    public static final String SHOTS_URL = "shots_url";

    public static final String TEAMS_URL = "teams_url";

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

    private String html_url;
    public String getHtmlURL() {
        return html_url;
    }
    public void setHtmlUrl(String html_url) {
        this.html_url = html_url;
    }

    private String avatar_url;
    public String getAvatarURL() {
        return avatar_url;
    }
    public void setAvatarURL(String avatarURL) {
        this.avatar_url = avatarURL;
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

    private int buckets_count;
    public int getBucketsCount() {
        return buckets_count;
    }
    public void setBucketsCount(int buckets_count) {
        this.buckets_count = buckets_count;
    }

    private int followers_count;
    public int getFollowersCount() {
        return followers_count;
    }
    public void setFollowersCount(int followers_count) {
        this.followers_count = followers_count;
    }

    private int followings_count;
    public int getFollowingsCount() {
        return followings_count;
    }
    public void setFollowingsCount(int followings_count) {
        this.followings_count = followings_count;
    }

    private int likes_count;
    public int getLikesCount() {
        return likes_count;
    }
    public void setLikesCount(int likes_count) {
        this.likes_count = likes_count;
    }

    private int projects_count;
    public int getProjectsCount() {
        return projects_count;
    }
    public void setProjectsCount(int projects_count) {
        this.projects_count = projects_count;
    }

    private int shots_count;
    public int getShotsCount() {
        return shots_count;
    }
    public void setShotsCount(int shots_count) {
        this.shots_count = shots_count;
    }

    private int teams_count;
    public int getTeamsCount() {
        return teams_count;
    }
    public void setTeamsCount(int teams_count) {
        this.teams_count = teams_count;
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

    private String buckets_url;
    public String getBucketsURL() {
        return buckets_url;
    }
    public void setBucketsURL(String buckets_url) {
        this.buckets_url = buckets_url;
    }

    private String followers_url;
    public String getFollowersURL() {
        return followers_url;
    }
    public void setFollowersURL(String followers_url) {
        this.followers_url = followers_url;
    }

    private String following_url;
    public String getFollowingURL() {
        return following_url;
    }
    public void setFollowingURL(String following_url) {
        this.following_url = following_url;
    }

    private String likes_url;
    public String getLikesURL() {
        return likes_url;
    }
    public void setLikesURL(String likes_url) {
        this.likes_url = likes_url;
    }

    private String shots_url;
    public String getShotsURL() {
        return shots_url;
    }
    public void setShotsURL(String shots_url) {
        this.shots_url = shots_url;
    }

    private String teams_url;
    public String getTeamsURL() {
        return teams_url;
    }
    public void setTeamsURL(String teams_url) {
        this.teams_url = teams_url;
    }

    private String created_at;
    public String getCreatedAt() {
        return created_at;
    }
    public void setCreatedAt(String created_at) {
        this.created_at = created_at;
    }

    private String updated_at;
    public String getUpdatedAt() {
        return updated_at;
    }
    public void setUpdatedAt(String updated_at) {
        this.updated_at = updated_at;
    }

    public User() {
        this.id = 0;
        this.name = null;
        this.username = null;
        this.html_url = null;
        this.avatar_url = null;
        this.bio = null;
        this.location = null;
        this.links = null;
        this.buckets_count = 0;
        this.followers_count = 0;
        this.followings_count = 0;
        this.likes_count = 0;
        this.projects_count = 0;
        this.shots_count = 0;
        this.teams_count = 0;
        this.type = null;
        this.pro = false;
        this.buckets_url = null;
        this.followers_url = null;
        this.following_url = null;
        this.likes_url = null;
        this.shots_url = null;
        this.teams_url = null;
        this.created_at = null;
        this.updated_at = null;
    }
}
