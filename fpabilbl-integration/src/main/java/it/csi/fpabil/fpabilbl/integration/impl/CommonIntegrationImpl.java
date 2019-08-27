package it.csi.fpabil.fpabilbl.integration.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import it.csi.fpabil.fpabilbl.util.Constants;


public class CommonIntegrationImpl  {
	
	protected final static Logger LOG = LoggerFactory.getLogger(Constants.LOGGER_PREFIX);

	@Autowired
	protected ApplicationContext applicationContext;

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}
	
	

}
