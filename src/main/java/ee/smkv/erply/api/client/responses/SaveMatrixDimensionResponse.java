package ee.smkv.erply.api.client.responses;


public class SaveMatrixDimensionResponse extends Response<SaveMatrixDimensionResponse.Record> {

    public static class Record {
        private Integer dimensionID;

        public Integer getDimensionID() {
            return dimensionID;
        }

        public void setDimensionID(Integer dimensionID) {
            this.dimensionID = dimensionID;
        }
    }
}

