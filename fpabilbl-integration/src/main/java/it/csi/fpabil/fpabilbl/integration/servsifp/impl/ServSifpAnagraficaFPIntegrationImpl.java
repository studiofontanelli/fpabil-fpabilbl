package it.csi.fpabil.fpabilbl.integration.servsifp.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import it.csi.anagrFP.interfacecsi.AnagraficaFPService;
import it.csi.common.vo.SelItem;
import it.csi.fpabil.fpabilbl.integration.exception.IntegrationException;
import it.csi.fpabil.fpabilbl.integration.impl.CommonIntegrationImpl;
import it.csi.fpabil.fpabilbl.integration.servsifp.ServSifpAnagraficaFPIntegration;
import it.csi.fpabil.fpabilbl.util.Tracer;


@Repository()
public class ServSifpAnagraficaFPIntegrationImpl extends CommonIntegrationImpl implements ServSifpAnagraficaFPIntegration {

	public AnagraficaFPService getService() {
		return (AnagraficaFPService)getApplicationContext().getBean("anagraficaFPService");
	}
	

	/*
	 * (non-Javadoc)
	 * @see it.csi.fpsiap.siapweb.business.integration.SiapCatalGestioneCatalFPIntegration#testResource()
	 */
	public boolean testResource() throws IntegrationException {
		final String method = "testResource";
		boolean result = false;
		try {
			result=  getService().testResources();
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
		return result;
	}

	@Override
	public SelItem[] getProvinceRegPiemonte() throws IntegrationException {
		final String method = "getProvinceRegPiemonte";
		SelItem [] result  = null;
		try {
			result=  getService().getProvinceRegPiemonte();
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
		return result;
	}

	@Override
	public SelItem[] getProvincePiemonteERegione() throws IntegrationException {
		final String method = "getProvincePiemonteERegione";
		SelItem [] result  = null;
		try {
			result=  getService().getProvincePiemonteERegione();
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
		return result;
	}

	@Override
	public SelItem[] getListaComuniPerProv(String codProv) throws IntegrationException {
		final String method = "getListaComuniPerProv";
		SelItem [] result  = null;
		try {
			result=  getService().getListaComuniPerProv(codProv);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
		return result;
	}

	@Override
	public SelItem[] getListaProvinceItalia() throws IntegrationException {
		final String method = "getListaProvinceItalia";
		SelItem [] result  = null;
		try {
			result=  getService().getListaProvinceItalia();
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
		return result;
	}

	@Override
	public SelItem[] getListaComuniItalia(String codProv) throws IntegrationException {
		final String method = "getListaComuniItalia";
		SelItem [] result  = null;
		try {
			result=  getService().getListaComuniItalia(codProv);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
		return result;
	}

	@Override
	public SelItem[] getListaQuartieri(String comISTAT) throws IntegrationException {
		final String method = "getListaQuartieri";
		SelItem [] result  = null;
		try {
			result=  getService().getListaQuartieri(comISTAT);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
		return result;
	}

	@Override
	public SelItem[] getListaStatiEsteri() throws IntegrationException {
		final String method = "getListaStatiEsteri";
		SelItem [] result  = null;
		try {
			result=  getService().getListaStatiEsteri();
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
		return result;
	}

	@Override
	public SelItem[] getListaCittadinanza(String nazionalita) throws IntegrationException {
		final String method = "getListaCittadinanza";
		SelItem [] result  = null;
		try {
			result=  getService().getListaCittadinanza(nazionalita);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
		return result;
	}

	@Override
	public String getCodFiscaleComune(String codComune) throws IntegrationException {
		final String method = "getCodFiscaleComune";
		String result  = null;
		try {
			result=  getService().getCodFiscaleComune(codComune);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
		return result;
	}

	@Override
	public String getCodFiscaleStatoEstero(int codStatoEstero) throws IntegrationException {
		final String method = "getCodFiscaleStatoEstero";
		String result  = null;
		try {
			result=  getService().getCodFiscaleStatoEstero(codStatoEstero);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
		return result;
	}

	@Override
	public String getComuneSiglaProvincia(String codComune) throws IntegrationException {
		final String method = "getComuneSiglaProvincia";
		String result  = null;
		try {
			result=  getService().getComuneSiglaProvincia(codComune);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
		return result;
	}

	@Override
	public String getDescrProvincia(String provincia) throws IntegrationException {
		final String method = "getDescrProvincia";
		String result  = null;
		try {
			result=  getService().getDescrProvincia(provincia);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
		return result;
	}

	@Override
	public String getDescrStato(int codStatoestero) throws IntegrationException {
		final String method = "getDescrStato";
		String result  = null;
		try {
			result=  getService().getDescrStato(codStatoestero);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
		return result;
	}

	@Override
	public String getCapComSigProv(String cap, String codComune) throws IntegrationException {
		final String method = "getCapComSigProv";
		String result  = null;
		try {
			result=  getService().getCapComSigProv(cap, codComune);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
		return result;
	}

	@Override
	public byte[] getLogoPerStampa(String codProvincia, String tag) throws IntegrationException {
		final String method = "getLogoPerStampa";
		byte [] result  = null;
		try {
			result=  getService().getLogoPerStampa(codProvincia, tag);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
		return result;
	}

	@Override
	public String getTestoPerStampa(String codProvincia, String tag) throws IntegrationException {
		final String method = "getTestoPerStampa";
		String result  = null;
		try {
			result=  getService().getTestoPerStampa(codProvincia, tag);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
		return result;
	}

	@Override
	public String getCodProvinciaBySigla(String siglaProvincia) throws IntegrationException {
		final String method = "getCodProvinciaBySigla";
		String result  = null;
		try {
			result=  getService().getCodProvinciaBySigla(siglaProvincia);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new IntegrationException(e, e.getMessage());
		}
		return result;
	}

	
	






}
