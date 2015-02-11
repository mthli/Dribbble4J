package Dribbble;

/**
 * Shots are small screenshots (400×300* pixels max) posted by members to show what they are working on.
 *
 * @see <a href="http://help.dribbble.com/customer/portal/articles/1039415-what-are-shots-">Dribbble Help #what are shots?</a>
 * @see <a href="http://developer.dribbble.com/v1/shots/">Dribbble API #shots</a>
 */
public class Shot {
    public static final String ID = "id";

    public static final String TITLE = "title";

    public static final String DESCRIPTION = "description";

    public static final String WIDTH = "width";

    public static final String HEIGHT = "height";

    public static final String IMAGES = "images";

    public static final String VIEWS_COUNT = "views_count";

    public static final String LIKES_COUNT = "likes_count";

    public static final String COMMENTS_COUNT = "comments_count";

    public static final String ATTACHMENTS_COUNT = "attachments_count";

    public static final String REBOUNDS_COUNT = "rebounds_count";

    public static final String BUCKETS_COUNT = "buckets_count";

    public static final String CREATED_AT = "created_at";

    public static final String UPDATED_AT = "updated_at";

    public static final String HTML_URL = "html_url";

    public static final String ATTACHMENTS_URL = "attachments_url";

    public static final String BUCKETS_URL = "buckets_url";

    public static final String COMMENTS_URL = "comments_url";

    public static final String LIKES_URL = "likes_url";

    public static final String PROJECTS_URL = "projects_url";

    public static final String REBOUNDS_URL = "rebounds_url";

    public static final String TAGS = "tags";

    public static final String USER = "user";

    public static final String TEAM = "team";

    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    private String title;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    private String description;
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    private int width;
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    private int height;
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    private Images images;
    public Images getImages() {
        return images;
    }
    public void setImages(Images images) {
        this.images = images;
    }

    private int views_count;
    public int getViewsCount() {
        return views_count;
    }
    public void setViewsCount(int views_count) {
        this.views_count = views_count;
    }

    private int likes_count;
    public int getLikesCount() {
        return likes_count;
    }
    public void setLikesCount(int likes_count) {
        this.likes_count = likes_count;
    }

    private int comments_count;
    public int getCommentsCount() {
        return comments_count;
    }
    public void setCommentsCount(int comments_count) {
        this.comments_count = comments_count;
    }

    private int attachments_count;
    public int getAttachmentsCount() {
        return attachments_count;
    }
    public void setAttachmentsCount(int attachments_count) {
        this.attachments_count = attachments_count;
    }

    private int rebounds_count;
    public int getReboundsCount() {
        return rebounds_count;
    }
    public void setReboundsCount(int rebounds_count) {
        this.rebounds_count = rebounds_count;
    }

    private int buckets_count;
    public int getBucketsCount() {
        return buckets_count;
    }
    public void setBucketsCount(int buckets_count) {
        this.buckets_count = buckets_count;
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

    private String html_url;
    public String getHtmlURL() {
        return html_url;
    }
    public void setHtmlURL(String html_url) {
        this.html_url = html_url;
    }

    private String attachments_url;
    public String getAttachmentsURL() {
        return attachments_url;
    }
    public void setAttachmentsURL(String attachments_url) {
        this.attachments_url = attachments_url;
    }

    private String buckets_url;
    public String getBucketsURL() {
        return buckets_url;
    }
    public void setBucketsURL(String buckets_url) {
        this.buckets_url = buckets_url;
    }

    private String comments_url;
    public String getCommentsURL() {
        return comments_url;
    }
    public void setCommentsURL(String comments_url) {
        this.comments_url = comments_url;
    }

    private String likes_url;
    public String getLikesURL() {
        return likes_url;
    }
    public void setLikesURL(String likes_url) {
        this.likes_url = likes_url;
    }

    private String projects_url;
    public String getProjectsURL() {
        return projects_url;
    }
    public void setProjectsURL(String projects_url) {
        this.projects_url = projects_url;
    }

    private String rebounds_url;
    public String getReboundsURL() {
        return rebounds_url;
    }
    public void setReboundsURL(String rebounds_url) {
        this.rebounds_url = rebounds_url;
    }

    private String[] tags;
    public String[] getTags() {
        return tags;
    }
    public void setTags(String[] tags) {
        this.tags = tags;
    }

    private User user;
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    private Team team;
    public Team getTeam() {
        return team;
    }
    public void setTeam(Team team) {
        this.team = team;
    }

    public Shot() {
        this.id = 0;
        this.title = null;
        this.description = null;
        this.width = 0;
        this.height = 0;
        this.images = null;
        this.views_count = 0;
        this.likes_count = 0;
        this.comments_count = 0;
        this.attachments_count = 0;
        this.rebounds_count = 0;
        this.buckets_count = 0;
        this.created_at = null;
        this.updated_at = null;
        this.html_url = null;
        this.attachments_url = null;
        this.buckets_url = null;
        this.comments_url = null;
        this.likes_url = null;
        this.projects_url = null;
        this.rebounds_url = null;
        this.tags = null;
        this.user = null;
        this.team = null;
    }
}
