package ee.smkv.erply.api.client.responses;

import java.math.BigDecimal;

public class Status {
    private String request;
    private long  requestUnixTime;
    private String responseStatus;
    private int errorCode;
    private BigDecimal generationTime;
    private int recordsTotal;
    private int recordsInResponse;


    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public long getRequestUnixTime() {
        return requestUnixTime;
    }

    public void setRequestUnixTime(long requestUnixTime) {
        this.requestUnixTime = requestUnixTime;
    }

    public String getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public BigDecimal getGenerationTime() {
        return generationTime;
    }

    public void setGenerationTime(BigDecimal generationTime) {
        this.generationTime = generationTime;
    }

    public int getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public int getRecordsInResponse() {
        return recordsInResponse;
    }

    public void setRecordsInResponse(int recordsInResponse) {
        this.recordsInResponse = recordsInResponse;
    }

    @Override
    public String toString() {
        return "Status{" +
                "request='" + request + '\'' +
                ", responseStatus='" + responseStatus + '\'' +
                ", recordsInResponse=" + recordsInResponse +
                ", recordsTotal=" + recordsTotal +
                '}';
    }
}
