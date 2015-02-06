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

    private int viewsCount;
    public int getViewsCount() {
        return viewsCount;
    }
    public void setViewsCount(int viewsCount) {
        this.viewsCount = viewsCount;
    }

    private int likesCount;
    public int getLikesCount() {
        return likesCount;
    }
    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    private int commentsCount;
    public int getCommentsCount() {
        return commentsCount;
    }
    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }

    private int attachmentsCount;
    public int getAttachmentsCount() {
        return attachmentsCount;
    }
    public void setAttachmentsCount(int attachmentsCount) {
        this.attachmentsCount = attachmentsCount;
    }

    private int reboundsCount;
    public int getReboundsCount() {
        return reboundsCount;
    }
    public void setReboundsCount(int reboundsCount) {
        this.reboundsCount = reboundsCount;
    }

    private int bucketsCount;
    public int getBucketsCount() {
        return bucketsCount;
    }
    public void setBucketsCount(int bucketsCount) {
        this.bucketsCount = bucketsCount;
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

    private String htmlURL;
    public String getHtmlURL() {
        return htmlURL;
    }
    public void setHtmlURL(String htmlURL) {
        this.htmlURL = htmlURL;
    }

    private String attachmentsURL;
    public String getAttachmentsURL() {
        return attachmentsURL;
    }
    public void setAttachmentsURL(String attachmentsURL) {
        this.attachmentsURL = attachmentsURL;
    }

    private String bucketsURL;
    public String getBucketsURL() {
        return bucketsURL;
    }
    public void setBucketsURL(String bucketsURL) {
        this.bucketsURL = bucketsURL;
    }

    private String commentsURL;
    public String getCommentsURL() {
        return commentsURL;
    }
    public void setCommentsURL(String commentsURL) {
        this.commentsURL = commentsURL;
    }

    private String likesURL;
    public String getLikesURL() {
        return likesURL;
    }
    public void setLikesURL(String likesURL) {
        this.likesURL = likesURL;
    }

    private String projectsURL;
    public String getProjectsURL() {
        return projectsURL;
    }
    public void setProjectsURL(String projectsURL) {
        this.projectsURL = projectsURL;
    }

    private String reboundsURL;
    public String getReboundsURL() {
        return reboundsURL;
    }
    public void setReboundsURL(String reboundsURL) {
        this.reboundsURL = reboundsURL;
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

    // TODO
    public Shot() {}
}
