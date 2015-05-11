package ee.smkv.erply.api.client.responses;

import ee.smkv.erply.api.client.utils.ErplyErrorCodes;

import java.math.BigDecimal;
import java.util.Date;

public class Status {
    private String request;
    private Date requestUnixTime;
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

    public Date getRequestUnixTime() {
        return requestUnixTime;
    }

    public void setRequestUnixTime(Date requestUnixTime) {
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

    public String getErrorMessage(){
        return ErplyErrorCodes.getErrorMessage(getErrorCode());
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
