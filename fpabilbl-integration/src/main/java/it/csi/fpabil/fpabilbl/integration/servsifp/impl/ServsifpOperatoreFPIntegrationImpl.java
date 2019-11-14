package it.csi.fpabil.fpabilbl.integration.servsifp.impl;



import org.springframework.stereotype.Repository;

import it.csi.common.vo.SelItem;
import it.csi.fpabil.fpabilbl.integration.exception.IntegrationException;
import it.csi.fpabil.fpabilbl.integration.impl.CommonIntegrationImpl;
import it.csi.fpabil.fpabilbl.integration.servsifp.ServsifpOperatoreFPIntegration;
import it.csi.fpabil.fpabilbl.util.Tracer;
import it.csi.operatore.interfacecsi.OperatoreFPService;
import it.csi.operatore.vo.Operatore;
import it.csi.operatore.vo.Sede;


@Repository()
public class ServsifpOperatoreFPIntegrationImpl extends CommonIntegrationImpl  implements ServsifpOperatoreFPIntegration{

	
	public OperatoreFPService getService() {
		return (OperatoreFPService)getApplicationContext().getBean("operatoreFPService");
	}
	

	@Override
	public Operatore getOperatore(String codice) throws IntegrationException {
		final String method = "getOperatore";
		try {
			return  getService().getOperatore(codice);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
	}

	@Override
	public Operatore getOperatore(String ipAddress, int codice) throws IntegrationException {
		final String method = "getOperatore";
		try {
			return  getService().getOperatore(ipAddress, codice);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
	}

	@Override
	public SelItem[] getListaSediOperatore(String ipAddress, String codice) throws IntegrationException {
		final String method = "getListaSediOperatore";
		try {
			return  getService().getListaSediOperatore(ipAddress, codice);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
	}

	@Override
	public SelItem[] getListaSediOperatore(String ipAddress, String gruppoOperatore, String codiceOperatore)
			throws IntegrationException {
		final String method = "getListaSediOperatore";
		try {
			return  getService().getListaSediOperatore(ipAddress, gruppoOperatore, codiceOperatore);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
	}

	@Override
	public String getCodiceEnte(String gruppoOperatore, int codiceOperatore, String ipAddress) throws IntegrationException {
		final String method = "getCodiceEnte";
		try {
			return  getService().getCodiceEnte(gruppoOperatore, codiceOperatore, ipAddress);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
	}

	@Override
	public SelItem[] getListaCentri(String ipAddress, String codice) throws IntegrationException {
		final String method = "getListaCentri";
		try {
			return  getService().getListaCentri(ipAddress, codice);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
	}

	@Override
	public SelItem[] getListaSediCorso(int codiceOp, String ipAddress) throws IntegrationException {
		final String method = "getListaSediCorso";
		try {
			return  getService().getListaSediCorso(codiceOp, ipAddress);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
	}

	@Override
	public SelItem[] getListaSediCorso_V2(int codiceOp, String ipAddress) throws IntegrationException {
		final String method = "getListaSediCorso_V2";
		try {
			return  getService().getListaSediCorso_V2(codiceOp, ipAddress);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
	}

	@Override
	public Operatore getOperatoreDaGruppoCodice(String gruppoOperatore, int codiceOperatore) throws IntegrationException {
		final String method = "getOperatoreDaGruppoCodice";
		try {
			return  getService().getOperatoreDaGruppoCodice(gruppoOperatore, codiceOperatore);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
	}

	@Override
	public String getCodProvinciaByCentro(String ipAddress, String codice, String subcodice) throws IntegrationException {
		final String method = "getCodProvinciaByCentro";
		try {
			return  getService().getCodProvinciaByCentro(ipAddress, codice,subcodice );
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
	}

	@Override
	public Sede getSede(String codComune) throws IntegrationException {
		final String method = "getSede";
		try {
			return  getService().getSede(codComune);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
	}

	@Override
	public boolean isAlive() throws IntegrationException {
		final String method = "isAlive";
		boolean result  = false;
		try {
			result= getService().isAlive();
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
		return result;
	}


	@Override
	public boolean testResources() throws IntegrationException {
		final String method = "testResources";
		boolean result  = false;
		try {
			result= getService().testResources();
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
		return result;
	}
}
