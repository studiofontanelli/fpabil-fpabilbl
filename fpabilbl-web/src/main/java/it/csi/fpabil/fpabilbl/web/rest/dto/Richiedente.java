package it.csi.fpabil.fpabilbl.web.rest.dto;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import java.util.Date;
import java.io.Serializable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="L'oggetto rappresentante il richiedente")

public class Richiedente  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [implicit-camel-case] 
  private static final long serialVersionUID = 1L;
  
  private String nome = null;
  private String cognome = null;
  private Date dataNascita = null;
  private Boolean natoInItalia = null;
  private String comuneNascita = null;
  private String provinciaNascita = null;
  private String statoEsteroNascita = null;
  private String cittaEsteraNascita = null;
  private String tipoStatoNascita = null;
  private String telefono = null;
  private String email = null;

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
   * true se nato in Italia, false all&#39;estero
   **/
  
  @ApiModelProperty(value = "true se nato in Italia, false all'estero")

  // nome originario nello yaml: natoInItalia 
  public Boolean isNatoInItalia() {
    return natoInItalia;
  }
  public void setNatoInItalia(Boolean natoInItalia) {
    this.natoInItalia = natoInItalia;
  }

  /**
   * comune di nascita
   **/
  
  @ApiModelProperty(value = "comune di nascita")

  // nome originario nello yaml: comuneNascita 
  public String getComuneNascita() {
    return comuneNascita;
  }
  public void setComuneNascita(String comuneNascita) {
    this.comuneNascita = comuneNascita;
  }

  /**
   * provincia di nascita
   **/
  
  @ApiModelProperty(value = "provincia di nascita")

  // nome originario nello yaml: provinciaNascita 
  public String getProvinciaNascita() {
    return provinciaNascita;
  }
  public void setProvinciaNascita(String provinciaNascita) {
    this.provinciaNascita = provinciaNascita;
  }

  /**
   * stato estero di nascita
   **/
  
  @ApiModelProperty(value = "stato estero di nascita")

  // nome originario nello yaml: statoEsteroNascita 
  public String getStatoEsteroNascita() {
    return statoEsteroNascita;
  }
  public void setStatoEsteroNascita(String statoEsteroNascita) {
    this.statoEsteroNascita = statoEsteroNascita;
  }

  /**
   * città estera di nascita
   **/
  
  @ApiModelProperty(value = "città estera di nascita")

  // nome originario nello yaml: cittaEsteraNascita 
  public String getCittaEsteraNascita() {
    return cittaEsteraNascita;
  }
  public void setCittaEsteraNascita(String cittaEsteraNascita) {
    this.cittaEsteraNascita = cittaEsteraNascita;
  }

  /**
   * I &#x3D; Italia, E&#x3D;Estero
   **/
  
  @ApiModelProperty(value = "I = Italia, E=Estero")

  // nome originario nello yaml: tipoStatoNascita 
  public String getTipoStatoNascita() {
    return tipoStatoNascita;
  }
  public void setTipoStatoNascita(String tipoStatoNascita) {
    this.tipoStatoNascita = tipoStatoNascita;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Richiedente richiedente = (Richiedente) o;
    return Objects.equals(nome, richiedente.nome) &&
        Objects.equals(cognome, richiedente.cognome) &&
        Objects.equals(dataNascita, richiedente.dataNascita) &&
        Objects.equals(natoInItalia, richiedente.natoInItalia) &&
        Objects.equals(comuneNascita, richiedente.comuneNascita) &&
        Objects.equals(provinciaNascita, richiedente.provinciaNascita) &&
        Objects.equals(statoEsteroNascita, richiedente.statoEsteroNascita) &&
        Objects.equals(cittaEsteraNascita, richiedente.cittaEsteraNascita) &&
        Objects.equals(tipoStatoNascita, richiedente.tipoStatoNascita) &&
        Objects.equals(telefono, richiedente.telefono) &&
        Objects.equals(email, richiedente.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, cognome, dataNascita, natoInItalia, comuneNascita, provinciaNascita, statoEsteroNascita, cittaEsteraNascita, tipoStatoNascita, telefono, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Richiedente {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
    sb.append("    dataNascita: ").append(toIndentedString(dataNascita)).append("\n");
    sb.append("    natoInItalia: ").append(toIndentedString(natoInItalia)).append("\n");
    sb.append("    comuneNascita: ").append(toIndentedString(comuneNascita)).append("\n");
    sb.append("    provinciaNascita: ").append(toIndentedString(provinciaNascita)).append("\n");
    sb.append("    statoEsteroNascita: ").append(toIndentedString(statoEsteroNascita)).append("\n");
    sb.append("    cittaEsteraNascita: ").append(toIndentedString(cittaEsteraNascita)).append("\n");
    sb.append("    tipoStatoNascita: ").append(toIndentedString(tipoStatoNascita)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
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

