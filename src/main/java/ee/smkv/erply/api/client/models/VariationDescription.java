package ee.smkv.erply.api.client.models;

public class VariationDescription {
    private String name;
    private String value;
    private Integer dimensionID;
    private Integer variationID;

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

    public Integer getVariationID() {
        return variationID;
    }

    public void setVariationID(Integer variationID) {
        this.variationID = variationID;
    }
}
