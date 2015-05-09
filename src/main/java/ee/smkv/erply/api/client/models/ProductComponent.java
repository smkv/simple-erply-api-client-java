package ee.smkv.erply.api.client.models;

import java.math.BigDecimal;

public class ProductComponent {
    private Integer componentID;
    private BigDecimal amount;

    public Integer getComponentID() {
        return componentID;
    }

    public void setComponentID(Integer componentID) {
        this.componentID = componentID;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
