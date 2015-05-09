package ee.smkv.erply.api.client.models;

import java.math.BigDecimal;

public class ParameterOption {
    private Integer optionID;
    private String optionName;
    private BigDecimal optionAdditionalPrice;

    public Integer getOptionID() {
        return optionID;
    }

    public void setOptionID(Integer optionID) {
        this.optionID = optionID;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public BigDecimal getOptionAdditionalPrice() {
        return optionAdditionalPrice;
    }

    public void setOptionAdditionalPrice(BigDecimal optionAdditionalPrice) {
        this.optionAdditionalPrice = optionAdditionalPrice;
    }
}
