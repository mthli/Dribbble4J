package Dribbble;

public class Attachment {
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    private String url;
    public String getURL() {
        return url;
    }
    public void setURL(String url) {
        this.url = url;
    }

    private String thumbnail_url;
    public String getThumbnailURL() {
        return thumbnail_url;
    }
    public void setThumbnailURL(String thumbnail_url) {
        this.thumbnail_url = thumbnail_url;
    }

    private int size;
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    private String content_type;
    public String getContentType() {
        return content_type;
    }
    public void setContentType(String content_type) {
        this.content_type = content_type;
    }

    private int views_count;
    public int getViewsCount() {
        return views_count;
    }
    public void setViewsCount(int views_count) {
        this.views_count = views_count;
    }

    private String created_at;
    public String getCreatedAt() {
        return created_at;
    }
    public void setCreatedAt(String created_at) {
        this.created_at = created_at;
    }

    public Attachment() {
        this.id = 0;
        this.url = null;
        this.thumbnail_url = null;
        this.size = 0;
        this.content_type = null;
        this.views_count = 0;
        this.created_at = null;
    }
}
