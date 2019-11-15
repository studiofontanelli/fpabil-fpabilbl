package it.csi.fpabil.fpabilbl.web.rest.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Richiesta di Test")

public class TestRequest  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [implicit-camel-case] 
  private static final long serialVersionUID = 1L;
  
  private String param = null;

  /**
   * l&#39;operatore da salvare
   **/
  
  @ApiModelProperty(value = "l'operatore da salvare")

  // nome originario nello yaml: param 
  public String getParam() {
    return param;
  }
  public void setParam(String param) {
    this.param = param;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestRequest testRequest = (TestRequest) o;
    return Objects.equals(param, testRequest.param);
  }

  @Override
  public int hashCode() {
    return Objects.hash(param);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestRequest {\n");
    
    sb.append("    param: ").append(toIndentedString(param)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

