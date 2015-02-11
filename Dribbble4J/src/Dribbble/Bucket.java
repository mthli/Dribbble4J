package Dribbble;

/**
 * A Bucket is a collection of shots that any Dribbble member can create.
 *
 * @see <a href="http://help.dribbble.com/customer/portal/articles/1039424-what-is-a-bucket-">Dribbble Help #what is a bucket?</a>
 * @see <a href="http://developer.dribbble.com/v1/buckets/">Dribbble API #buckets</a>
 */
public class Bucket {
    public static final String ID = "id";

    public static final String NAME = "name";

    public static final String DESCRIPTION = "description";

    public static final String SHOTS_COUNT = "shots_count";

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

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private String description;
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    private int shots_count;
    public int getShotsCount() {
        return shots_count;
    }
    public void setShotsCount(int shots_count) {
        this.shots_count = shots_count;
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

    private User user;
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public Bucket() {
        this.id = 0;
        this.name = null;
        this.description = null;
        this.shots_count = 0;
        this.created_at = null;
        this.updated_at = null;
        this.user = null;
    }
}
