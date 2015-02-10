package Dribbble;

public class Like {
    public static final String ID = "id";

    public static final String CREATED_AT = "created_at";

    public static final String USER = "user";

    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String created_at;
    public String getCreatedAt() {
        return created_at;
    }
    public void setCreatedAt(String created_at) {
        this.created_at = created_at;
    }

    public User user;
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public Like() {
        this.id = 0;
        this.created_at = null;
        this.user = null;
    }
}
