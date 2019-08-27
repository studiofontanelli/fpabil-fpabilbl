package it.csi.fpabil.fpabilbl.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import it.csi.fpabil.fpabilbl.business.helper.FpabilHelper;
import it.csi.fpabil.fpabilbl.util.Constants;
import it.csi.fpabil.fpabilbl.util.Tracer;
import it.csi.fpabil.fpabilbl.util.XmlSerializer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/spring-business-junit.xml")
public class FpabiliHelperTest {

	protected final Logger LOG = LoggerFactory.getLogger(Constants.LOGGER_PREFIX);

	@Autowired
	private FpabilHelper fpabilHelper;

	@Test
	public final void testTestResources() {
		final String method = "testTestResources";
		Tracer.debug(LOG, getClass().getName(), method, "BEGIN");

		try {
			Tracer.debug(LOG, getClass().getSimpleName(), method, "test resource....");
			boolean result = fpabilHelper.testResources("MINIMMI");
			Tracer.debug(LOG, getClass().getSimpleName(), method, "result\n" + XmlSerializer.objectToXml(result));
			assertTrue(result);
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
