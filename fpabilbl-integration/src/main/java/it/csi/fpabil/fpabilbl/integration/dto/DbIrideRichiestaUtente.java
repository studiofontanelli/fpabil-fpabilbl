package it.csi.fpabil.fpabilbl.integration.dto;

import java.util.Date;

public class DbIrideRichiestaUtente extends DbIrideRichiestaUtenteKey {
    private String cognome;

    private String nome;

    private Date dataNascita;

    private String numeroDocumento;

    private Date dataRilascioDocumento;

    private String eMail;

    private String numTelefono;

    private String flagCertificato;

    private String tipoDocumento;

    private String flagAbilitazione;

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome == null ? null : cognome.trim();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome == null ? null : nome.trim();
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
        this.numeroDocumento = numeroDocumento == null ? null : numeroDocumento.trim();
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
        this.eMail = eMail == null ? null : eMail.trim();
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono == null ? null : numTelefono.trim();
    }

    public String getFlagCertificato() {
        return flagCertificato;
    }

    public void setFlagCertificato(String flagCertificato) {
        this.flagCertificato = flagCertificato == null ? null : flagCertificato.trim();
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento == null ? null : tipoDocumento.trim();
    }

    public String getFlagAbilitazione() {
        return flagAbilitazione;
    }

    public void setFlagAbilitazione(String flagAbilitazione) {
        this.flagAbilitazione = flagAbilitazione == null ? null : flagAbilitazione.trim();
    }
}