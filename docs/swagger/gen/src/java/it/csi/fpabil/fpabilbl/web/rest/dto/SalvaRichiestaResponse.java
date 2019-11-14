package it.csi.fpabil.fpabilbl.web.rest.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Risposta del servizio di inserimento richiesta")

public class SalvaRichiestaResponse  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [implicit-camel-case] 
  private static final long serialVersionUID = 1L;
  
  private String codiceRichiesta = null;

  /**
   * Codice richiesta
   **/
  
  @ApiModelProperty(value = "Codice richiesta")

  // nome originario nello yaml: codiceRichiesta 
  public String getCodiceRichiesta() {
    return codiceRichiesta;
  }
  public void setCodiceRichiesta(String codiceRichiesta) {
    this.codiceRichiesta = codiceRichiesta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalvaRichiestaResponse salvaRichiestaResponse = (SalvaRichiestaResponse) o;
    return Objects.equals(codiceRichiesta, salvaRichiestaResponse.codiceRichiesta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceRichiesta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalvaRichiestaResponse {\n");
    
    sb.append("    codiceRichiesta: ").append(toIndentedString(codiceRichiesta)).append("\n");
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

