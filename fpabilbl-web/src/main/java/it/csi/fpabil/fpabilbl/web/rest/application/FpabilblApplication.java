package it.csi.fpabil.fpabilbl.web.rest.application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.csi.fpabil.fpabilbl.business.helper.FpabilHelper;
import it.csi.fpabil.fpabilbl.util.ApplicationContextManager;
import it.csi.fpabil.fpabilbl.util.Constants;
import it.csi.fpabil.fpabilbl.util.Tracer;
import it.csi.fpabil.fpabilbl.web.provider.ExceptionHandler;
import it.csi.fpabil.fpabilbl.web.rest.service.TestApi;


public class FpabilblApplication extends Application {

	protected final static Logger LOG = LoggerFactory.getLogger(Constants.APPLICATION_CODE);

	private Set<Object> singletons = new HashSet<>();
	private Set<Class<?>> classes = new HashSet<>();

	private List<String> getServiceList(){
		List<String> l = new ArrayList<String>();
		l.add("testApi");
		l.add("anagraficheApi");
		l.add("richiestaApi");
		return l;
		
	}
	
	private List<Class> getProviderList(){
		List<Class> l = new ArrayList<Class>();
		l.add(ExceptionHandler.class);
		return l;
		
	}
	
	public FpabilblApplication() {
		final String method = "CONSTRUCTOR";
		try {
			Tracer.debug(LOG, getClass().getName(), method, "loading rest services...");
			
			
			
			//TestApi testApi = (TestApi) ApplicationContextManager.getBean("testApi");
			//AnagraficheApi anagraficheApi = (AnagraficheApi) ApplicationContextManager.getBean("anagraficheApi");
			
			
			// Resources
			for(String api : getServiceList()) {
				Tracer.info(LOG, getClass().getName(), method, "adding api " + api);
				//this.singletons.add(ApplicationContextManager.getBean("anagraficheApi"));
				this.singletons.add(ApplicationContextManager.getBean(api));
			}
			
			//this.singletons.add(testApi);
			//this.singletons.add(ApplicationContextManager.getBean("anagraficheApi"));

			// Providers
			for(Class provider : getProviderList()) {
				Tracer.info(LOG, getClass().getName(), method, "adding provider " + provider);
				classes.add(provider);
			}
			
			//classes.add(ExceptionHandler.class);
			
			
			FpabilHelper fpabilHelper = (FpabilHelper) ApplicationContextManager.getBean("fpabilHelper");
			
			boolean testResource = fpabilHelper.testResources("SELF CHECK");
			
			Tracer.info(LOG, getClass().getName(), method, "testResource= " + testResource);
			
			Tracer.info(LOG, getClass().getName(), method, "Startup rest services done correctly!");
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception: " + e);
			throw new RuntimeException("Errore infase di startup configurazione servizi rest", e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.ws.rs.core.Application#getClasses()
	 */
	@Override
	public Set<Class<?>> getClasses() {
		return this.classes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.ws.rs.core.Application#getSingletons()
	 */
	@Override
	public Set<Object> getSingletons() {
		return this.singletons;
	}
}
