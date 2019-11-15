package it.csi.fpabil.fpabilbl.web.rest.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.fpabil.fpabilbl.web.rest.dto.Operatore;
import it.csi.fpabil.fpabilbl.web.rest.dto.PersonaArray;
import it.csi.fpabil.fpabilbl.web.rest.dto.Richiedente;
import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Richiesta Operatore")

public class RichiestaResponse  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [implicit-camel-case] 
  private static final long serialVersionUID = 1L;
  
  private Operatore operatore = null;
  private Richiedente richiedente = null;
  private PersonaArray elencoPersone = null;

  /**
   * l&#39;operatore da salvare
   **/
  
  @ApiModelProperty(value = "l'operatore da salvare")

  // nome originario nello yaml: operatore 
  public Operatore getOperatore() {
    return operatore;
  }
  public void setOperatore(Operatore operatore) {
    this.operatore = operatore;
  }

  /**
   * Il richiedente
   **/
  
  @ApiModelProperty(value = "Il richiedente")

  // nome originario nello yaml: richiedente 
  public Richiedente getRichiedente() {
    return richiedente;
  }
  public void setRichiedente(Richiedente richiedente) {
    this.richiedente = richiedente;
  }

  /**
   * elenco persone da abilitare/disabilitare
   **/
  
  @ApiModelProperty(value = "elenco persone da abilitare/disabilitare")

  // nome originario nello yaml: elencoPersone 
  public PersonaArray getElencoPersone() {
    return elencoPersone;
  }
  public void setElencoPersone(PersonaArray elencoPersone) {
    this.elencoPersone = elencoPersone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RichiestaResponse richiestaResponse = (RichiestaResponse) o;
    return Objects.equals(operatore, richiestaResponse.operatore) &&
        Objects.equals(richiedente, richiestaResponse.richiedente) &&
        Objects.equals(elencoPersone, richiestaResponse.elencoPersone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatore, richiedente, elencoPersone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RichiestaResponse {\n");
    
    sb.append("    operatore: ").append(toIndentedString(operatore)).append("\n");
    sb.append("    richiedente: ").append(toIndentedString(richiedente)).append("\n");
    sb.append("    elencoPersone: ").append(toIndentedString(elencoPersone)).append("\n");
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

