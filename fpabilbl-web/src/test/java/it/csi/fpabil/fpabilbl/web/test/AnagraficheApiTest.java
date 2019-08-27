package it.csi.fpabil.fpabilbl.web.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import javax.ws.rs.core.Response;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import it.csi.fpabil.fpabilbl.util.Constants;
import it.csi.fpabil.fpabilbl.util.Tracer;
import it.csi.fpabil.fpabilbl.util.XmlSerializer;
import it.csi.fpabil.fpabilbl.web.adapter.ProvinciaAdapter;
import it.csi.fpabil.fpabilbl.web.rest.service.AnagraficheApi;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/spring-web-junit.xml")
public class AnagraficheApiTest {

	protected final Logger LOG = LoggerFactory.getLogger(Constants.LOGGER_PREFIX);

	@Autowired
	private AnagraficheApi anagraficheApi;
	
	

	@Test
	public final void testGetProvince() {
		final String method = "testGetProvince";
		Tracer.debug(LOG, getClass().getName(), method, "BEGIN");

		try {
			Tracer.debug(LOG, getClass().getName(), method, "test resource....");
			Response response = anagraficheApi.getProvince(null, null);
			Tracer.debug(LOG, getClass().getSimpleName(), method, "result\n" + XmlSerializer.objectToXml(response));
			assertNotNull(response);
		} catch (Exception e) {
			LOG.error("", e);
			Tracer.error(LOG, getClass().getSimpleName(), method, "Exception: " + e);
			fail();
		}
		finally {
			Tracer.debug(LOG, getClass().getName(), method, "END");
		}

	}

}
