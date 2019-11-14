package it.csi.fpabil.fpabilbl.integration.servsifp;

import it.csi.common.vo.SelItem;
import it.csi.fpabil.fpabilbl.integration.exception.IntegrationException;

public interface ServSifpAnagraficaFPIntegration {

	public boolean testResource() throws IntegrationException;
	
	public SelItem[] getProvinceRegPiemonte() throws IntegrationException;

	public SelItem[] getProvincePiemonteERegione() throws IntegrationException;

	public SelItem[] getListaComuniPerProv(String codProv) throws IntegrationException;

	public SelItem[] getListaProvinceItalia() throws IntegrationException;

	public SelItem[] getListaComuniItalia(String codProv) throws IntegrationException;

	public SelItem[] getListaQuartieri(String comISTAT) throws IntegrationException;

	public SelItem[] getListaStatiEsteri() throws IntegrationException;

	public SelItem[] getListaCittadinanza(String nazionalita) throws IntegrationException;

	public String getCodFiscaleComune(String codComune)  throws  IntegrationException;

	public String getCodFiscaleStatoEstero(int codStatoEstero)  throws IntegrationException;

	public String getComuneSiglaProvincia(String codComune)  throws  IntegrationException;

	public String getDescrProvincia(String provincia)  throws  IntegrationException;

	public String getDescrStato(int codStatoestero)  throws  IntegrationException;

	public String getCapComSigProv(String cap,String codComune)  throws  IntegrationException;

	public byte[] getLogoPerStampa(String codProvincia, String tag)   throws IntegrationException;

	public String getTestoPerStampa(String codProvincia, String tag)   throws IntegrationException;

	public String getCodProvinciaBySigla(String siglaProvincia)  throws IntegrationException;




}
