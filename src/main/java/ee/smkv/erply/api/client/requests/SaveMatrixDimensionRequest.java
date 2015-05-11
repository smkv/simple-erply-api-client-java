package ee.smkv.erply.api.client.requests;

import ee.smkv.erply.api.client.responses.SaveMatrixDimensionResponse;

import java.util.List;

public class SaveMatrixDimensionRequest extends Request<SaveMatrixDimensionResponse> {

  private Integer dimensionID;
  private String name;
  private List<DimensionValue> values;


  public SaveMatrixDimensionRequest() {
    super("saveMatrixDimension");
  }

  @Override
  public Class<SaveMatrixDimensionResponse> getResponseClass() {
    return SaveMatrixDimensionResponse.class;
  }


  public Integer getDimensionID() {
    return dimensionID;
  }

  public void setDimensionID(Integer dimensionID) {
    this.dimensionID = dimensionID;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<DimensionValue> getValues() {
    return values;
  }

  public void setValues(List<DimensionValue> values) {
    this.values = values;
  }

  public static class DimensionValue {
    private String valueName;
    private String valueCode;

    public String getValueName() {
      return valueName;
    }

    public void setValueName(String valueName) {
      this.valueName = valueName;
    }

    public String getValueCode() {
      return valueCode;
    }

    public void setValueCode(String valueCode) {
      this.valueCode = valueCode;
    }
  }
}
