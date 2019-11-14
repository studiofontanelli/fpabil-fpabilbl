package it.csi.fpabil.fpabilbl.web.rest.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="L'oggetto rappresentante lo stato richiesta")

public class StatoRchiesta  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [implicit-camel-case] 
  private static final long serialVersionUID = 1L;
  
  private BigDecimal id = null;
  private String descrizione = null;

  /**
   * id stato richiesta
   **/
  
  @ApiModelProperty(value = "id stato richiesta")

  // nome originario nello yaml: id 
  public BigDecimal getId() {
    return id;
  }
  public void setId(BigDecimal id) {
    this.id = id;
  }

  /**
   * la descrizione dello stato richiesta
   **/
  
  @ApiModelProperty(value = "la descrizione dello stato richiesta")

  // nome originario nello yaml: descrizione 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatoRchiesta statoRchiesta = (StatoRchiesta) o;
    return Objects.equals(id, statoRchiesta.id) &&
        Objects.equals(descrizione, statoRchiesta.descrizione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descrizione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatoRchiesta {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
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

