package it.csi.fpabil.fpabilbl.business.helper.impl;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.csi.fpabil.fpabilbl.business.exception.HelperException;
import it.csi.fpabil.fpabilbl.integration.TestResourceIntegration;
import it.csi.fpabil.fpabilbl.integration.dao.DbIrideRichiestaOperatoreMapper;
import it.csi.fpabil.fpabilbl.integration.dao.DbIrideRichiestaUtenteMapper;
import it.csi.fpabil.fpabilbl.integration.dao.TabDocIdentitaMapper;
import it.csi.fpabil.fpabilbl.integration.dao.custom.TestResourceMapper;
import it.csi.fpabil.fpabilbl.integration.exception.IntegrationException;
import it.csi.fpabil.fpabilbl.integration.servsifp.ServSifpAnagraficaFPIntegration;
import it.csi.fpabil.fpabilbl.integration.servsifp.ServsifpOperatoreFPIntegration;
import it.csi.fpabil.fpabilbl.util.Constants;
import it.csi.fpabil.fpabilbl.util.Tracer;

@Service("commonHelper")
public class CommonHelperImpl  {

	private static final String LOGGER_PREFIX = Constants.APPLICATION_CODE + ".helper";
	protected final static Logger LOG = LoggerFactory.getLogger(LOGGER_PREFIX);

	@Autowired
	private ServSifpAnagraficaFPIntegration servSifpAnagraficaFPIntegration;
	
	@Autowired
	private ServsifpOperatoreFPIntegration servsifpOperatoreFPIntegration;

	@Autowired
	private TestResourceIntegration testResourceIntegration;

	@Autowired
	private TestResourceMapper testResourceMapper;
	
	@Autowired
	private DbIrideRichiestaOperatoreMapper dbIrideRichiestaOperatoreMapper;
	@Autowired
	private DbIrideRichiestaUtenteMapper dbIrideRichiestaUtenteMapper;
	@Autowired
	private TabDocIdentitaMapper tabDocIdentitaMapper;
	
	public TestResourceIntegration getTestResourceIntegration() {
		return testResourceIntegration;
	}

	public TestResourceMapper getTestResourceMapper() {
		return testResourceMapper;
	}
	public ServSifpAnagraficaFPIntegration getServSifpAnagraficaFPIntegration() {
		return servSifpAnagraficaFPIntegration;
	}

	public void setServSifpAnagraficaFPIntegration(ServSifpAnagraficaFPIntegration servSifpAnagraficaFPIntegration) {
		this.servSifpAnagraficaFPIntegration = servSifpAnagraficaFPIntegration;
	}


	public Boolean testResources(String arg) throws HelperException {
		final String method = "testResources";
		try {
			boolean result = (
					getTestResourceIntegration().testResource() && 
					testResourceMapper.testResource() && 
					servSifpAnagraficaFPIntegration.testResource() && 
					servsifpOperatoreFPIntegration.testResources());
			
			if(1==11) {
				throw new HelperException("EX****");
			}
			
			return result;
		}
		catch(IntegrationException e) {
			Tracer.error(LOG, getClass().getName(), method, "IntegrationException " +e);
			throw new HelperException("Errore in fase di test resources", e);
		}
		
		

	}

	public ServsifpOperatoreFPIntegration getServsifpOperatoreFPIntegration() {
		return servsifpOperatoreFPIntegration;
	}

	public DbIrideRichiestaOperatoreMapper getDbIrideRichiestaOperatoreMapper() {
		return dbIrideRichiestaOperatoreMapper;
	}

	public DbIrideRichiestaUtenteMapper getDbIrideRichiestaUtenteMapper() {
		return dbIrideRichiestaUtenteMapper;
	}

	public TabDocIdentitaMapper getTabDocIdentitaMapper() {
		return tabDocIdentitaMapper;
	}

	




}
