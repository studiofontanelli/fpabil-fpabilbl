package it.csi.fpabil.fpabilbl.business.helper.impl;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.csi.fpabil.fpabilbl.business.exception.HelperException;
import it.csi.fpabil.fpabilbl.integration.TestResourceIntegration;
import it.csi.fpabil.fpabilbl.integration.dao.custom.TestResourceMapper;
import it.csi.fpabil.fpabilbl.util.Constants;

@Service("commonHelper")
public class CommonHelperImpl  {

	private static final String LOGGER_PREFIX = Constants.APPLICATION_CODE + ".helper";
	protected final static Logger LOG = LoggerFactory.getLogger(LOGGER_PREFIX);
	
	
	@Autowired
	private TestResourceIntegration testResourceIntegration;
	
	@Autowired
	private TestResourceMapper testResourceMapper;

	public TestResourceIntegration getTestResourceIntegration() {
		return testResourceIntegration;
	}

	public TestResourceMapper getTestResourceMapper() {
		return testResourceMapper;
	}

	
	public Boolean testResources(String arg) throws HelperException {
		final String method = "testResources";
		boolean result = (
				getTestResourceIntegration().testResource() && 
				testResourceMapper.testResource());
		if(1==11) {
			throw new HelperException("EX****");
		}
		return result;

	}
	

}
