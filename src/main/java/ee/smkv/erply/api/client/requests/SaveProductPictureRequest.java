package ee.smkv.erply.api.client.requests;


import ee.smkv.erply.api.client.responses.SaveProductPictureResponse;

public class SaveProductPictureRequest extends Request<SaveProductPictureResponse> {

    private Integer productPictureID;
    private Integer productID;
    private String pictureName;
    private byte[] picture;
    private String filename;
    private String url;
    private String hostingProvider;

    public SaveProductPictureRequest() {
        super("saveProductPicture");
    }

    @Override
    public Class<SaveProductPictureResponse> getResponseClass() {
        return SaveProductPictureResponse.class;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getHostingProvider() {
        return hostingProvider;
    }

    public void setHostingProvider(String hostingProvider) {
        this.hostingProvider = hostingProvider;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Integer getProductPictureID() {
        return productPictureID;
    }

    public void setProductPictureID(Integer productPictureID) {
        this.productPictureID = productPictureID;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
