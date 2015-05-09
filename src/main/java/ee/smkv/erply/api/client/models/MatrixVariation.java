package ee.smkv.erply.api.client.models;

import java.util.List;

public class MatrixVariation {
    private Integer productID;
    private String name;
    private String code;
    private String code2;
    private List<DimantionDescription> dimensions;

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    public List<DimantionDescription> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<DimantionDescription> dimensions) {
        this.dimensions = dimensions;
    }
}
