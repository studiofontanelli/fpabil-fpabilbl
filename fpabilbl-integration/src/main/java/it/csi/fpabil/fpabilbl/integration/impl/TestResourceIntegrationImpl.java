package it.csi.fpabil.fpabilbl.integration.impl;

import org.springframework.stereotype.Repository;

import it.csi.fpabil.fpabilbl.integration.TestResourceIntegration;
import it.csi.fpabil.fpabilbl.util.Tracer;

@Repository
public class TestResourceIntegrationImpl extends CommonIntegrationImpl implements TestResourceIntegration {
	public boolean testResource() {
		final String method = "testResource";
		try {
			return true;	
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception  " + e);
			throw new RuntimeException(e.getMessage(), e);
		}
	}

}
