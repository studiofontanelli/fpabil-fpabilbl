package it.csi.fpabil.fpabilbl.integration.dto;

public class TabDocIdentita {
    private String codTipoDocIdentita;

    private String descrizione;

    public String getCodTipoDocIdentita() {
        return codTipoDocIdentita;
    }

    public void setCodTipoDocIdentita(String codTipoDocIdentita) {
        this.codTipoDocIdentita = codTipoDocIdentita == null ? null : codTipoDocIdentita.trim();
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione == null ? null : descrizione.trim();
    }
}