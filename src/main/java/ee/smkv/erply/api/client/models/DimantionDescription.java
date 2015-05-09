package ee.smkv.erply.api.client.models;

public class DimantionDescription {
    private String name;
    private String value;
    private String code;
    private Integer dimensionID;
    private Integer dimensionValueID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getDimensionID() {
        return dimensionID;
    }

    public void setDimensionID(Integer dimensionID) {
        this.dimensionID = dimensionID;
    }

    public Integer getDimensionValueID() {
        return dimensionValueID;
    }

    public void setDimensionValueID(Integer dimensionValueID) {
        this.dimensionValueID = dimensionValueID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
