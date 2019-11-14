package it.csi.fpabil.fpabilbl.business.dto;

import java.io.Serializable;

public class TipoDocumentoDto  implements Serializable {
	
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
