package it.csi.fpabil.fpabilbl.integration.dto;

public class DbIrideStatoRichiesta {
    private Integer idStatoRichiestaOperatore;

    private String descrizione;

    public Integer getIdStatoRichiestaOperatore() {
        return idStatoRichiestaOperatore;
    }

    public void setIdStatoRichiestaOperatore(Integer idStatoRichiestaOperatore) {
        this.idStatoRichiestaOperatore = idStatoRichiestaOperatore;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione == null ? null : descrizione.trim();
    }
}