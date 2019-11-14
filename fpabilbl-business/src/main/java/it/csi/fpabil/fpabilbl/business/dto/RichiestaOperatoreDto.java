package it.csi.fpabil.fpabilbl.business.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class RichiestaOperatoreDto implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -2567781412156504292L;

	private Integer idRichiestaOperatore;

    private Integer idStatoRichiestaOperatore;

    private Date dataRichiesta;

    private Date dataInvioRichiesta;

    private String lrCognome;

    private String lrNome;

    private String lrProvNascita;

    private String lrComuneNascita;

    private Short lrStatoEsteroNascita;

    private String lrCittaEsteraNascita;

    private Date lrDataNascita;

    private String lrNumTelefono;

    private String lrEmail;

    private String opIpAddress;

    private Integer opCodice;

    private String opDenominazione;

    private String opCodFiscale;

    private String opPartitaIva;

    private String opSedeProvincia;

    private String opSedeComune;

    private String opSedeIndirizzo;

    private String opSedeCap;

    private Short opSedeStatoEstero;

    private String opSedeLocalitaEstera;

    private String opSedeTelefono1;

    private String opSedeTelefono2;

    private String opSedeFax;

    private String opSedeEmail;

    private Date dataModificaStato;

    private String matricolaUtenteRiferimento;
    
    private List<RichiestaUtenteDto> elencoRichiestaUtenteDto;

    public Integer getIdRichiestaOperatore() {
        return idRichiestaOperatore;
    }

    public void setIdRichiestaOperatore(Integer idRichiestaOperatore) {
        this.idRichiestaOperatore = idRichiestaOperatore;
    }

    public Integer getIdStatoRichiestaOperatore() {
        return idStatoRichiestaOperatore;
    }

    public void setIdStatoRichiestaOperatore(Integer idStatoRichiestaOperatore) {
        this.idStatoRichiestaOperatore = idStatoRichiestaOperatore;
    }

    public Date getDataRichiesta() {
        return dataRichiesta;
    }

    public void setDataRichiesta(Date dataRichiesta) {
        this.dataRichiesta = dataRichiesta;
    }

    public Date getDataInvioRichiesta() {
        return dataInvioRichiesta;
    }

    public void setDataInvioRichiesta(Date dataInvioRichiesta) {
        this.dataInvioRichiesta = dataInvioRichiesta;
    }

    public String getLrCognome() {
        return lrCognome;
    }

    public void setLrCognome(String lrCognome) {
        this.lrCognome = lrCognome == null ? null : lrCognome.trim();
    }

    public String getLrNome() {
        return lrNome;
    }

    public void setLrNome(String lrNome) {
        this.lrNome = lrNome == null ? null : lrNome.trim();
    }

    public String getLrProvNascita() {
        return lrProvNascita;
    }

    public void setLrProvNascita(String lrProvNascita) {
        this.lrProvNascita = lrProvNascita == null ? null : lrProvNascita.trim();
    }

    public String getLrComuneNascita() {
        return lrComuneNascita;
    }

    public void setLrComuneNascita(String lrComuneNascita) {
        this.lrComuneNascita = lrComuneNascita == null ? null : lrComuneNascita.trim();
    }

    public Short getLrStatoEsteroNascita() {
        return lrStatoEsteroNascita;
    }

    public void setLrStatoEsteroNascita(Short lrStatoEsteroNascita) {
        this.lrStatoEsteroNascita = lrStatoEsteroNascita;
    }

    public String getLrCittaEsteraNascita() {
        return lrCittaEsteraNascita;
    }

    public void setLrCittaEsteraNascita(String lrCittaEsteraNascita) {
        this.lrCittaEsteraNascita = lrCittaEsteraNascita == null ? null : lrCittaEsteraNascita.trim();
    }

    public Date getLrDataNascita() {
        return lrDataNascita;
    }

    public void setLrDataNascita(Date lrDataNascita) {
        this.lrDataNascita = lrDataNascita;
    }

    public String getLrNumTelefono() {
        return lrNumTelefono;
    }

    public void setLrNumTelefono(String lrNumTelefono) {
        this.lrNumTelefono = lrNumTelefono == null ? null : lrNumTelefono.trim();
    }

    public String getLrEmail() {
        return lrEmail;
    }

    public void setLrEmail(String lrEmail) {
        this.lrEmail = lrEmail == null ? null : lrEmail.trim();
    }

    public String getOpIpAddress() {
        return opIpAddress;
    }

    public void setOpIpAddress(String opIpAddress) {
        this.opIpAddress = opIpAddress == null ? null : opIpAddress.trim();
    }

    public Integer getOpCodice() {
        return opCodice;
    }

    public void setOpCodice(Integer opCodice) {
        this.opCodice = opCodice;
    }

    public String getOpDenominazione() {
        return opDenominazione;
    }

    public void setOpDenominazione(String opDenominazione) {
        this.opDenominazione = opDenominazione == null ? null : opDenominazione.trim();
    }

    public String getOpCodFiscale() {
        return opCodFiscale;
    }

    public void setOpCodFiscale(String opCodFiscale) {
        this.opCodFiscale = opCodFiscale == null ? null : opCodFiscale.trim();
    }

    public String getOpPartitaIva() {
        return opPartitaIva;
    }

    public void setOpPartitaIva(String opPartitaIva) {
        this.opPartitaIva = opPartitaIva == null ? null : opPartitaIva.trim();
    }

    public String getOpSedeProvincia() {
        return opSedeProvincia;
    }

    public void setOpSedeProvincia(String opSedeProvincia) {
        this.opSedeProvincia = opSedeProvincia == null ? null : opSedeProvincia.trim();
    }

    public String getOpSedeComune() {
        return opSedeComune;
    }

    public void setOpSedeComune(String opSedeComune) {
        this.opSedeComune = opSedeComune == null ? null : opSedeComune.trim();
    }

    public String getOpSedeIndirizzo() {
        return opSedeIndirizzo;
    }

    public void setOpSedeIndirizzo(String opSedeIndirizzo) {
        this.opSedeIndirizzo = opSedeIndirizzo == null ? null : opSedeIndirizzo.trim();
    }

    public String getOpSedeCap() {
        return opSedeCap;
    }

    public void setOpSedeCap(String opSedeCap) {
        this.opSedeCap = opSedeCap == null ? null : opSedeCap.trim();
    }

    public Short getOpSedeStatoEstero() {
        return opSedeStatoEstero;
    }

    public void setOpSedeStatoEstero(Short opSedeStatoEstero) {
        this.opSedeStatoEstero = opSedeStatoEstero;
    }

    public String getOpSedeLocalitaEstera() {
        return opSedeLocalitaEstera;
    }

    public void setOpSedeLocalitaEstera(String opSedeLocalitaEstera) {
        this.opSedeLocalitaEstera = opSedeLocalitaEstera == null ? null : opSedeLocalitaEstera.trim();
    }

    public String getOpSedeTelefono1() {
        return opSedeTelefono1;
    }

    public void setOpSedeTelefono1(String opSedeTelefono1) {
        this.opSedeTelefono1 = opSedeTelefono1 == null ? null : opSedeTelefono1.trim();
    }

    public String getOpSedeTelefono2() {
        return opSedeTelefono2;
    }

    public void setOpSedeTelefono2(String opSedeTelefono2) {
        this.opSedeTelefono2 = opSedeTelefono2 == null ? null : opSedeTelefono2.trim();
    }

    public String getOpSedeFax() {
        return opSedeFax;
    }

    public void setOpSedeFax(String opSedeFax) {
        this.opSedeFax = opSedeFax == null ? null : opSedeFax.trim();
    }

    public String getOpSedeEmail() {
        return opSedeEmail;
    }

    public void setOpSedeEmail(String opSedeEmail) {
        this.opSedeEmail = opSedeEmail == null ? null : opSedeEmail.trim();
    }

    public Date getDataModificaStato() {
        return dataModificaStato;
    }

    public void setDataModificaStato(Date dataModificaStato) {
        this.dataModificaStato = dataModificaStato;
    }

    public String getMatricolaUtenteRiferimento() {
        return matricolaUtenteRiferimento;
    }

    public void setMatricolaUtenteRiferimento(String matricolaUtenteRiferimento) {
        this.matricolaUtenteRiferimento = matricolaUtenteRiferimento == null ? null : matricolaUtenteRiferimento.trim();
    }

	public List<RichiestaUtenteDto> getElencoRichiestaUtenteDto() {
		return elencoRichiestaUtenteDto;
	}

	public void setElencoRichiestaUtenteDto(List<RichiestaUtenteDto> elencoRichiestaUtenteDto) {
		this.elencoRichiestaUtenteDto = elencoRichiestaUtenteDto;
	}
}