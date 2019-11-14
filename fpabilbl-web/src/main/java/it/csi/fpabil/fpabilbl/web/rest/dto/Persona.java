package it.csi.fpabil.fpabilbl.web.rest.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import java.util.Date;
import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="L'oggetto rappresentante la persona da abilitare/disabilitare")

public class Persona  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [implicit-camel-case] 
  private static final long serialVersionUID = 1L;
  
  private String nome = null;
  private String cognome = null;
  private Date dataNascita = null;
  private String email = null;
  private String tipoRichiesta = null;
  private String richiestaCertificatoDigitale = null;
  private String tipoDocumento = null;
  private String numeroDocumento = null;
  private Date dataRilascioDocumento = null;

  /**
   * Il nome
   **/
  
  @ApiModelProperty(value = "Il nome")

  // nome originario nello yaml: nome 
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * Il cognome
   **/
  
  @ApiModelProperty(value = "Il cognome")

  // nome originario nello yaml: cognome 
  public String getCognome() {
    return cognome;
  }
  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  /**
   * data nascita
   **/
  
  @ApiModelProperty(value = "data nascita")

  // nome originario nello yaml: dataNascita 
  public Date getDataNascita() {
    return dataNascita;
  }
  public void setDataNascita(Date dataNascita) {
    this.dataNascita = dataNascita;
  }

  /**
   * email
   **/
  
  @ApiModelProperty(value = "email")

  // nome originario nello yaml: email 
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Indica se la richiesta è di abilitazione o disabilitazione
   **/
  
  @ApiModelProperty(value = "Indica se la richiesta è di abilitazione o disabilitazione")

  // nome originario nello yaml: tipoRichiesta 
  public String getTipoRichiesta() {
    return tipoRichiesta;
  }
  public void setTipoRichiesta(String tipoRichiesta) {
    this.tipoRichiesta = tipoRichiesta;
  }

  /**
   * Y &#x3D; SI, N &#x3D; No
   **/
  
  @ApiModelProperty(value = "Y = SI, N = No")

  // nome originario nello yaml: richiestaCertificatoDigitale 
  public String getRichiestaCertificatoDigitale() {
    return richiestaCertificatoDigitale;
  }
  public void setRichiestaCertificatoDigitale(String richiestaCertificatoDigitale) {
    this.richiestaCertificatoDigitale = richiestaCertificatoDigitale;
  }

  /**
   * tipo documento
   **/
  
  @ApiModelProperty(value = "tipo documento")

  // nome originario nello yaml: tipoDocumento 
  public String getTipoDocumento() {
    return tipoDocumento;
  }
  public void setTipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }

  /**
   * numero documento
   **/
  
  @ApiModelProperty(value = "numero documento")

  // nome originario nello yaml: numeroDocumento 
  public String getNumeroDocumento() {
    return numeroDocumento;
  }
  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }

  /**
   * data rilascio documento
   **/
  
  @ApiModelProperty(value = "data rilascio documento")

  // nome originario nello yaml: dataRilascioDocumento 
  public Date getDataRilascioDocumento() {
    return dataRilascioDocumento;
  }
  public void setDataRilascioDocumento(Date dataRilascioDocumento) {
    this.dataRilascioDocumento = dataRilascioDocumento;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Persona persona = (Persona) o;
    return Objects.equals(nome, persona.nome) &&
        Objects.equals(cognome, persona.cognome) &&
        Objects.equals(dataNascita, persona.dataNascita) &&
        Objects.equals(email, persona.email) &&
        Objects.equals(tipoRichiesta, persona.tipoRichiesta) &&
        Objects.equals(richiestaCertificatoDigitale, persona.richiestaCertificatoDigitale) &&
        Objects.equals(tipoDocumento, persona.tipoDocumento) &&
        Objects.equals(numeroDocumento, persona.numeroDocumento) &&
        Objects.equals(dataRilascioDocumento, persona.dataRilascioDocumento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, cognome, dataNascita, email, tipoRichiesta, richiestaCertificatoDigitale, tipoDocumento, numeroDocumento, dataRilascioDocumento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Persona {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
    sb.append("    dataNascita: ").append(toIndentedString(dataNascita)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    tipoRichiesta: ").append(toIndentedString(tipoRichiesta)).append("\n");
    sb.append("    richiestaCertificatoDigitale: ").append(toIndentedString(richiestaCertificatoDigitale)).append("\n");
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
    sb.append("    numeroDocumento: ").append(toIndentedString(numeroDocumento)).append("\n");
    sb.append("    dataRilascioDocumento: ").append(toIndentedString(dataRilascioDocumento)).append("\n");
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

