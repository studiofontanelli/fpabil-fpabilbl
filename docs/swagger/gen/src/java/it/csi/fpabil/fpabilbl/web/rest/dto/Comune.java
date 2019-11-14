package it.csi.fpabil.fpabilbl.web.rest.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.fpabil.fpabilbl.web.rest.dto.Provincia;
import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="L'oggetto rappresentante il comune")

public class Comune  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [implicit-camel-case] 
  private static final long serialVersionUID = 1L;
  
  private String codice = null;
  private String descrizione = null;
  private Provincia provincia = null;

  /**
   * codice comune
   **/
  
  @ApiModelProperty(value = "codice comune")

  // nome originario nello yaml: codice 
  public String getCodice() {
    return codice;
  }
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   * la descrizione del comune
   **/
  
  @ApiModelProperty(value = "la descrizione del comune")

  // nome originario nello yaml: descrizione 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   * la provincia di appartenenza al Comune
   **/
  
  @ApiModelProperty(value = "la provincia di appartenenza al Comune")

  // nome originario nello yaml: provincia 
  public Provincia getProvincia() {
    return provincia;
  }
  public void setProvincia(Provincia provincia) {
    this.provincia = provincia;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comune comune = (Comune) o;
    return Objects.equals(codice, comune.codice) &&
        Objects.equals(descrizione, comune.descrizione) &&
        Objects.equals(provincia, comune.provincia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, descrizione, provincia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comune {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    provincia: ").append(toIndentedString(provincia)).append("\n");
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

