package it.csi.fpabil.fpabilbl.web.rest.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="L'oggetto rappresentante l'operatore")

public class Operatore  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [implicit-camel-case] 
  private static final long serialVersionUID = 1L;
  
  private String codice = null;
  private String gruppo = null;
  private String codiceFiscale = null;
  private String partitaIva = null;
  private String tipoStatoSedeLegale = null;
  private String comuneSedeLegale = null;
  private String provinciaSedeLegale = null;
  private String indirizzoSedeLegale = null;
  private String capSedeLegale = null;
  private String statoEsteroSedeLegale = null;
  private String cittaEsteraSedeLegale = null;
  private String telefono = null;
  private String telefonoSecondario = null;
  private String fax = null;
  private String email = null;

  /**
   * codice operatore
   **/
  
  @ApiModelProperty(value = "codice operatore")

  // nome originario nello yaml: codice 
  public String getCodice() {
    return codice;
  }
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   * gruppo operatore
   **/
  
  @ApiModelProperty(value = "gruppo operatore")

  // nome originario nello yaml: gruppo 
  public String getGruppo() {
    return gruppo;
  }
  public void setGruppo(String gruppo) {
    this.gruppo = gruppo;
  }

  /**
   * codice fiscale operatore
   **/
  
  @ApiModelProperty(value = "codice fiscale operatore")

  // nome originario nello yaml: codiceFiscale 
  public String getCodiceFiscale() {
    return codiceFiscale;
  }
  public void setCodiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
  }

  /**
   * partita Iva operatore
   **/
  
  @ApiModelProperty(value = "partita Iva operatore")

  // nome originario nello yaml: partitaIva 
  public String getPartitaIva() {
    return partitaIva;
  }
  public void setPartitaIva(String partitaIva) {
    this.partitaIva = partitaIva;
  }

  /**
   * tipo stato sede legale operatore
   **/
  
  @ApiModelProperty(value = "tipo stato sede legale operatore")

  // nome originario nello yaml: tipoStatoSedeLegale 
  public String getTipoStatoSedeLegale() {
    return tipoStatoSedeLegale;
  }
  public void setTipoStatoSedeLegale(String tipoStatoSedeLegale) {
    this.tipoStatoSedeLegale = tipoStatoSedeLegale;
  }

  /**
   * comune sede legale operatore
   **/
  
  @ApiModelProperty(value = "comune sede legale operatore")

  // nome originario nello yaml: comuneSedeLegale 
  public String getComuneSedeLegale() {
    return comuneSedeLegale;
  }
  public void setComuneSedeLegale(String comuneSedeLegale) {
    this.comuneSedeLegale = comuneSedeLegale;
  }

  /**
   * provincia sede legale operatore
   **/
  
  @ApiModelProperty(value = "provincia sede legale operatore")

  // nome originario nello yaml: provinciaSedeLegale 
  public String getProvinciaSedeLegale() {
    return provinciaSedeLegale;
  }
  public void setProvinciaSedeLegale(String provinciaSedeLegale) {
    this.provinciaSedeLegale = provinciaSedeLegale;
  }

  /**
   * indirizzo sede legale operatore
   **/
  
  @ApiModelProperty(value = "indirizzo sede legale operatore")

  // nome originario nello yaml: indirizzoSedeLegale 
  public String getIndirizzoSedeLegale() {
    return indirizzoSedeLegale;
  }
  public void setIndirizzoSedeLegale(String indirizzoSedeLegale) {
    this.indirizzoSedeLegale = indirizzoSedeLegale;
  }

  /**
   * cap sede legale operatore
   **/
  
  @ApiModelProperty(value = "cap sede legale operatore")

  // nome originario nello yaml: capSedeLegale 
  public String getCapSedeLegale() {
    return capSedeLegale;
  }
  public void setCapSedeLegale(String capSedeLegale) {
    this.capSedeLegale = capSedeLegale;
  }

  /**
   * Stato Estero legale operatore
   **/
  
  @ApiModelProperty(value = "Stato Estero legale operatore")

  // nome originario nello yaml: statoEsteroSedeLegale 
  public String getStatoEsteroSedeLegale() {
    return statoEsteroSedeLegale;
  }
  public void setStatoEsteroSedeLegale(String statoEsteroSedeLegale) {
    this.statoEsteroSedeLegale = statoEsteroSedeLegale;
  }

  /**
   * Città estera sede legale operatore
   **/
  
  @ApiModelProperty(value = "Città estera sede legale operatore")

  // nome originario nello yaml: cittaEsteraSedeLegale 
  public String getCittaEsteraSedeLegale() {
    return cittaEsteraSedeLegale;
  }
  public void setCittaEsteraSedeLegale(String cittaEsteraSedeLegale) {
    this.cittaEsteraSedeLegale = cittaEsteraSedeLegale;
  }

  /**
   * telefono
   **/
  
  @ApiModelProperty(value = "telefono")

  // nome originario nello yaml: telefono 
  public String getTelefono() {
    return telefono;
  }
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  /**
   * telefono 2 legale operatore
   **/
  
  @ApiModelProperty(value = "telefono 2 legale operatore")

  // nome originario nello yaml: telefonoSecondario 
  public String getTelefonoSecondario() {
    return telefonoSecondario;
  }
  public void setTelefonoSecondario(String telefonoSecondario) {
    this.telefonoSecondario = telefonoSecondario;
  }

  /**
   * fax legale operatore
   **/
  
  @ApiModelProperty(value = "fax legale operatore")

  // nome originario nello yaml: fax 
  public String getFax() {
    return fax;
  }
  public void setFax(String fax) {
    this.fax = fax;
  }

  /**
   * email legale operatore
   **/
  
  @ApiModelProperty(value = "email legale operatore")

  // nome originario nello yaml: email 
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Operatore operatore = (Operatore) o;
    return Objects.equals(codice, operatore.codice) &&
        Objects.equals(gruppo, operatore.gruppo) &&
        Objects.equals(codiceFiscale, operatore.codiceFiscale) &&
        Objects.equals(partitaIva, operatore.partitaIva) &&
        Objects.equals(tipoStatoSedeLegale, operatore.tipoStatoSedeLegale) &&
        Objects.equals(comuneSedeLegale, operatore.comuneSedeLegale) &&
        Objects.equals(provinciaSedeLegale, operatore.provinciaSedeLegale) &&
        Objects.equals(indirizzoSedeLegale, operatore.indirizzoSedeLegale) &&
        Objects.equals(capSedeLegale, operatore.capSedeLegale) &&
        Objects.equals(statoEsteroSedeLegale, operatore.statoEsteroSedeLegale) &&
        Objects.equals(cittaEsteraSedeLegale, operatore.cittaEsteraSedeLegale) &&
        Objects.equals(telefono, operatore.telefono) &&
        Objects.equals(telefonoSecondario, operatore.telefonoSecondario) &&
        Objects.equals(fax, operatore.fax) &&
        Objects.equals(email, operatore.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, gruppo, codiceFiscale, partitaIva, tipoStatoSedeLegale, comuneSedeLegale, provinciaSedeLegale, indirizzoSedeLegale, capSedeLegale, statoEsteroSedeLegale, cittaEsteraSedeLegale, telefono, telefonoSecondario, fax, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Operatore {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    gruppo: ").append(toIndentedString(gruppo)).append("\n");
    sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
    sb.append("    partitaIva: ").append(toIndentedString(partitaIva)).append("\n");
    sb.append("    tipoStatoSedeLegale: ").append(toIndentedString(tipoStatoSedeLegale)).append("\n");
    sb.append("    comuneSedeLegale: ").append(toIndentedString(comuneSedeLegale)).append("\n");
    sb.append("    provinciaSedeLegale: ").append(toIndentedString(provinciaSedeLegale)).append("\n");
    sb.append("    indirizzoSedeLegale: ").append(toIndentedString(indirizzoSedeLegale)).append("\n");
    sb.append("    capSedeLegale: ").append(toIndentedString(capSedeLegale)).append("\n");
    sb.append("    statoEsteroSedeLegale: ").append(toIndentedString(statoEsteroSedeLegale)).append("\n");
    sb.append("    cittaEsteraSedeLegale: ").append(toIndentedString(cittaEsteraSedeLegale)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    telefonoSecondario: ").append(toIndentedString(telefonoSecondario)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

