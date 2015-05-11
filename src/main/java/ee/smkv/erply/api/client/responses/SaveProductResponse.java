package ee.smkv.erply.api.client.responses;

public class SaveProductResponse extends Response<SaveProductResponse.Record> {

    public static class Record {
        private Integer productID;

        public Integer getProductID() {
            return productID;
        }

        public void setProductID(Integer productID) {
            this.productID = productID;
        }
    }
}
