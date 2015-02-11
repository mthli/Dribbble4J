package Dribbble;

/**
 * The class of a shot's comment.
 *
 * @see <a href="http://developer.dribbble.com/v1/shots/comments/">Dribbble API #shots/comments</a>
 */
public class Comment {
    public static final String ID = "id";

    public static final String BODY = "body";

    public static final String LIKES_COUNT = "likes_count";

    public static final String LIKES_URL = "likes_url";

    public static final String CREATED_AT = "created_at";

    public static final String UPDATED_AT = "updated_at";

    public static final String USER = "user";

    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String body;
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public int likes_count;
    public int getLikesCount() {
        return likes_count;
    }
    public void setLikesCount(int likes_count) {
        this.likes_count = likes_count;
    }

    public String likes_url;
    public String getLikesURL() {
        return likes_url;
    }
    public void setLikesURL(String likes_url) {
        this.likes_url = likes_url;
    }

    public String created_at;
    public String getCreatedAt() {
        return created_at;
    }
    public void setCreatedAt(String created_at) {
        this.created_at = created_at;
    }

    public String updated_at;
    public String getUpdatedAt() {
        return updated_at;
    }
    public void setUpdatedAt(String updated_at) {
        this.updated_at = updated_at;
    }

    public User user;
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public Comment() {
        this.id = 0;
        this.body = null;
        this.likes_count = 0;
        this.likes_url = null;
        this.created_at = null;
        this.updated_at = null;
        this.user = null;
    }
}
