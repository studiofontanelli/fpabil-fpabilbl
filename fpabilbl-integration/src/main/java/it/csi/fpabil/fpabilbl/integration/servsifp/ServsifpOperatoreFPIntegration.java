package it.csi.fpabil.fpabilbl.integration.servsifp;

import it.csi.common.vo.SelItem;
import it.csi.fpabil.fpabilbl.integration.exception.IntegrationException;
import it.csi.operatore.vo.Operatore;
import it.csi.operatore.vo.Sede;

public interface ServsifpOperatoreFPIntegration {
	
	 public Operatore  getOperatore(String codice) throws IntegrationException;
	  
	  public Operatore  getOperatore(String ipAddress,int codice) throws IntegrationException;

	  public SelItem[] getListaSediOperatore(String ipAddress,String codice)throws IntegrationException;
	  
	  public SelItem[] getListaSediOperatore(String ipAddress,String gruppoOperatore,String codiceOperatore) throws IntegrationException;

	  public String   getCodiceEnte(String gruppoOperatore, int codiceOperatore,String ipAddress) throws IntegrationException;

	  public SelItem[] getListaCentri(String ipAddress,String codice)throws IntegrationException;

	  public SelItem[] getListaSediCorso(int codiceOp, String ipAddress)throws IntegrationException;
	  
	  public SelItem[] getListaSediCorso_V2(int codiceOp, String ipAddress)throws IntegrationException;

	  public Operatore  getOperatoreDaGruppoCodice(String gruppoOperatore,  int codiceOperatore) throws IntegrationException;

	  public String getCodProvinciaByCentro(String ipAddress, String codice, String subcodice) throws IntegrationException;

	  public Sede getSede(String codComune) throws IntegrationException;

	  public boolean isAlive() throws IntegrationException;
	  
	  public boolean testResources() throws IntegrationException;

}
