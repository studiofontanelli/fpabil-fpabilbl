package it.csi.fpabil.fpabilbl.integration.dto;

import java.math.BigDecimal;

public class DbIrideRichiestaUtenteKey {
    private String codFiscale;

    private BigDecimal idRichiestaOperatore;

    public String getCodFiscale() {
        return codFiscale;
    }

    public void setCodFiscale(String codFiscale) {
        this.codFiscale = codFiscale == null ? null : codFiscale.trim();
    }

    public BigDecimal getIdRichiestaOperatore() {
        return idRichiestaOperatore;
    }

    public void setIdRichiestaOperatore(BigDecimal idRichiestaOperatore) {
        this.idRichiestaOperatore = idRichiestaOperatore;
    }
}