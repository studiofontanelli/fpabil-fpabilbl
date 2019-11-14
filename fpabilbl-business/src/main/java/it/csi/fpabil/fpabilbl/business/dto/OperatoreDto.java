package it.csi.fpabil.fpabilbl.business.dto;

import java.io.Serializable;

public class OperatoreDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8930234899743888544L;
	
	private String codice = null;
	private String gruppoOperatore = null;
	private String codiceOperatore = null;
	private String denominazione = null;
	private String ipAddress = null;
	
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getGruppoOperatore() {
		return gruppoOperatore;
	}
	public void setGruppoOperatore(String gruppoOperatore) {
		this.gruppoOperatore = gruppoOperatore;
	}
	public String getCodiceOperatore() {
		return codiceOperatore;
	}
	public void setCodiceOperatore(String codiceOperatore) {
		this.codiceOperatore = codiceOperatore;
	}
	public String getDenominazione() {
		return denominazione;
	}
	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
