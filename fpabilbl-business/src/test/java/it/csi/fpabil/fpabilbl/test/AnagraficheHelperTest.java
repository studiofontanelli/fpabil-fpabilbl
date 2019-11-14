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

import it.csi.fpabil.fpabilbl.business.dto.ComuneDto;
import it.csi.fpabil.fpabilbl.business.dto.OperatoreDto;
import it.csi.fpabil.fpabilbl.business.dto.ProvinciaDto;
import it.csi.fpabil.fpabilbl.business.dto.StatoEsteroDto;
import it.csi.fpabil.fpabilbl.business.dto.TipoDocumentoDto;
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
	
	@Test
	public final void testGetComuniByProvincia() {
		final String method = "testGetComuniByProvincia";
		Tracer.debug(LOG, getClass().getName(), method, "BEGIN");

		try {
			List<ProvinciaDto> list = helper.getProvince();
			Tracer.debug(LOG, getClass().getSimpleName(), method, "list\n" + XmlSerializer.objectToXml(list));
			
			for(ProvinciaDto provinciaDto : list) {
				
				List<ComuneDto> r = helper.getComuniByProvincia(provinciaDto.getCodice());
				Tracer.debug(LOG, getClass().getSimpleName(), method, "comuni\n" + XmlSerializer.objectToXml(r));
				
			}
			
			assertNotNull(list);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getSimpleName(), method, "Exception: " + e);
			fail();
		}
		finally {
			Tracer.debug(LOG, getClass().getName(), method, "END");
		}

	}
	
	
	@Test
	public final void testGetStatiEsteri() {
		final String method = "testGetStatiEsteri";
		Tracer.debug(LOG, getClass().getName(), method, "BEGIN");

		try {
			List<StatoEsteroDto> list = helper.getStatiEsteri();
			Tracer.debug(LOG, getClass().getSimpleName(), method, "list\n" + XmlSerializer.objectToXml(list));
			

			assertNotNull(list);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getSimpleName(), method, "Exception: " + e);
			fail();
		}
		finally {
			Tracer.debug(LOG, getClass().getName(), method, "END");
		}

	}
	
	@Test
	public final void testGetOperatore() {
		final String method = "testGetOperatore";
		Tracer.debug(LOG, getClass().getName(), method, "BEGIN");

		try {
			
			String gruppoOperatore = "B";
			String codiceOperatore = "7";
			
			OperatoreDto operatore = helper.getOperatore(gruppoOperatore, codiceOperatore);
			Tracer.debug(LOG, getClass().getSimpleName(), method, "OPERATORE\n" + XmlSerializer.objectToXml(operatore));
		
			assertNotNull(operatore);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getSimpleName(), method, "Exception: " + e);
			fail();
		}
		finally {
			Tracer.debug(LOG, getClass().getName(), method, "END");
		}
	}
	@Test
	public final void testGetTipiDocumento() {
		final String method = "testGetTipiDocumento";
		Tracer.debug(LOG, getClass().getName(), method, "BEGIN");

		try {
			
			
			List<TipoDocumentoDto> result = helper.getTipiDocumento();
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
