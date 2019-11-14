package it.csi.fpabil.fpabilbl.business.dto;

import java.io.Serializable;

public class StatoEsteroDto  implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -5100658675187469930L;
	
	
	private String codice = null;
	private String descrizione = null;
	
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}
