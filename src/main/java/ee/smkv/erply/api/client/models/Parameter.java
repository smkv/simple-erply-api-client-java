package ee.smkv.erply.api.client.models;

import java.util.List;

public class Parameter {
    
    private Integer parameterID;
    private String parameterName;
    private ParameterType parameterType;
    private Integer parameterGroupID;
    private String parameterValue;
    private List<ParameterOption> parameterOptions;

    public Integer getParameterID() {
        return parameterID;
    }

    public void setParameterID(Integer parameterID) {
        this.parameterID = parameterID;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public ParameterType getParameterType() {
        return parameterType;
    }

    public void setParameterType(ParameterType parameterType) {
        this.parameterType = parameterType;
    }

    public Integer getParameterGroupID() {
        return parameterGroupID;
    }

    public void setParameterGroupID(Integer parameterGroupID) {
        this.parameterGroupID = parameterGroupID;
    }

    public String getParameterValue() {
        return parameterValue;
    }

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    public List<ParameterOption> getParameterOptions() {
        return parameterOptions;
    }

    public void setParameterOptions(List<ParameterOption> parameterOptions) {
        this.parameterOptions = parameterOptions;
    }
}
