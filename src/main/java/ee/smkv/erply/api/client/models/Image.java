package ee.smkv.erply.api.client.models;

public class Image {
    private Integer pictureID;
    private String name;
    private String thumbURL;
    private String smallURL;
    private String largeURL;
    private String fullURL;
    private Boolean external;
    private String hostingProvider;


    public Integer getPictureID() {
        return pictureID;
    }

    public void setPictureID(Integer pictureID) {
        this.pictureID = pictureID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumbURL() {
        return thumbURL;
    }

    public void setThumbURL(String thumbURL) {
        this.thumbURL = thumbURL;
    }

    public String getSmallURL() {
        return smallURL;
    }

    public void setSmallURL(String smallURL) {
        this.smallURL = smallURL;
    }

    public String getLargeURL() {
        return largeURL;
    }

    public void setLargeURL(String largeURL) {
        this.largeURL = largeURL;
    }

    public String getFullURL() {
        return fullURL;
    }

    public void setFullURL(String fullURL) {
        this.fullURL = fullURL;
    }

    public Boolean getExternal() {
        return external;
    }

    public void setExternal(Boolean external) {
        this.external = external;
    }

    public String getHostingProvider() {
        return hostingProvider;
    }

    public void setHostingProvider(String hostingProvider) {
        this.hostingProvider = hostingProvider;
    }
}
