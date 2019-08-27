package it.csi.fpabil.fpabilbl.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import it.csi.fpabil.fpabilbl.business.dto.ProvinciaDto;
import it.csi.fpabil.fpabilbl.business.helper.AnagraficheHelper;
import it.csi.fpabil.fpabilbl.util.Constants;
import it.csi.fpabil.fpabilbl.util.Tracer;
import it.csi.fpabil.fpabilbl.util.XmlSerializer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/spring-business-junit.xml")
public class AnagraficheHelperTest {

	protected final Logger LOG = LoggerFactory.getLogger(Constants.LOGGER_PREFIX);

	@Autowired
	private AnagraficheHelper helper;

	@Test
	public final void testGetProvince() {
		final String method = "testGetProvince";
		Tracer.debug(LOG, getClass().getName(), method, "BEGIN");

		try {
			List<ProvinciaDto> result = helper.getProvince();
			Tracer.debug(LOG, getClass().getSimpleName(), method, "result\n" + XmlSerializer.objectToXml(result));
			assertNotNull(result);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getSimpleName(), method, "Exception: " + e);
			fail();
		}
		finally {
			Tracer.debug(LOG, getClass().getName(), method, "END");
		}

	}
	@Test
	public final void testGetProvinceCache() {
		final String method = "testGetProvinceCache";
		Tracer.debug(LOG, getClass().getName(), method, "BEGIN");

		try {
			List<ProvinciaDto> result = null;
			for(int i=0; i<10; i++) {
				result = helper.getProvince();
				Tracer.debug(LOG, getClass().getName(), method, "response ok!!");
			}
			
			
			
			Tracer.debug(LOG, getClass().getSimpleName(), method, "result\n" + XmlSerializer.objectToXml(result));
			assertNotNull(result);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getSimpleName(), method, "Exception: " + e);
			fail();
		}
		finally {
			Tracer.debug(LOG, getClass().getName(), method, "END");
		}

	}

}
