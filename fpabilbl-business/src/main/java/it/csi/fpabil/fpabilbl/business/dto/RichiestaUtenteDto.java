package it.csi.fpabil.fpabilbl.business.dto;

import java.io.Serializable;
import java.util.Date;

public class RichiestaUtenteDto implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -3546641006827350886L;
	

	private String codFiscale;

	private Integer idRichiestaOperatore;

	private String cognome;

	private String nome;

	private Date dataNascita;

	private String numeroDocumento;

	private Date dataRilascioDocumento;

	private String eMail;

	private String numTelefono;

	private boolean flagCertificato;

	private String tipoDocumento;

	private boolean flagAbilitazione;

	public String getCodFiscale() {
		return codFiscale;
	}

	public void setCodFiscale(String codFiscale) {
		this.codFiscale = codFiscale;
	}

	public Integer getIdRichiestaOperatore() {
		return idRichiestaOperatore;
	}

	public void setIdRichiestaOperatore(Integer idRichiestaOperatore) {
		this.idRichiestaOperatore = idRichiestaOperatore;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public Date getDataRilascioDocumento() {
		return dataRilascioDocumento;
	}

	public void setDataRilascioDocumento(Date dataRilascioDocumento) {
		this.dataRilascioDocumento = dataRilascioDocumento;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}

	

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	

	public boolean isFlagCertificato() {
		return flagCertificato;
	}

	public void setFlagCertificato(boolean flagCertificato) {
		this.flagCertificato = flagCertificato;
	}

	public boolean isFlagAbilitazione() {
		return flagAbilitazione;
	}

	public void setFlagAbilitazione(boolean flagAbilitazione) {
		this.flagAbilitazione = flagAbilitazione;
	}


}