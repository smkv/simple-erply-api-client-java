package ee.smkv.erply.api.client.responses;

public class SaveProductPictureResponse extends Response<SaveProductPictureResponse.Record>{
    public static class Record{
        private Integer productPictureID;

        public Integer getProductPictureID() {
            return productPictureID;
        }

        public void setProductPictureID(Integer productPictureID) {
            this.productPictureID = productPictureID;
        }
    }
}
