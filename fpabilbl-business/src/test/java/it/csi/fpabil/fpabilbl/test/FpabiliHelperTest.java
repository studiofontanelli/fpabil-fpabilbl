package it.csi.fpabil.fpabilbl.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import it.csi.fpabil.fpabilbl.business.dto.RichiestaOperatoreDto;
import it.csi.fpabil.fpabilbl.business.dto.RichiestaUtenteDto;
import it.csi.fpabil.fpabilbl.business.helper.FpabilHelper;
import it.csi.fpabil.fpabilbl.util.Constants;
import it.csi.fpabil.fpabilbl.util.Tracer;
import it.csi.fpabil.fpabilbl.util.XmlSerializer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/spring-business-junit.xml")
public class FpabiliHelperTest {

	protected final Logger LOG = LoggerFactory.getLogger(Constants.LOGGER_PREFIX);

	
	private static final String JSON_DATA = "./data/SalvaRichiestaRequest.json";
	
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
	
	
	@Test
	public final void testSaveRichiesta() {
		final String method = "testSaveRichiesta";
		Tracer.debug(LOG, getClass().getName(), method, "BEGIN");

		try {
			Tracer.debug(LOG, getClass().getSimpleName(), method, "saving richiesta");
			
			RichiestaOperatoreDto request = new RichiestaOperatoreDto();
			
			request.setIdStatoRichiestaOperatore(FpabilHelper.STATO_RICHIESTA_DA_ESAMINARE);
			
			DateTimeFormatter fmt = DateTimeFormat.forPattern("dd/MM/yyyy");
			
			
			
			
			DateTime dt = new DateTime();
			DateTime dataNascita = fmt.parseDateTime("22/02/1973");
			
			
			request.setDataRichiesta(dt.toDate());
			request.setLrCognome("Fontanelli");
			request.setLrNome("Andrea");
			request.setLrDataNascita(dataNascita.toDate());
			request.setLrNumTelefono("011");
			request.setLrEmail("studiofontanelli@gmail.com");
			
			request.setOpDenominazione("OP DENOMINAZIONE");
			request.setOpSedeTelefono1("02");
			
			
			request.setElencoRichiestaUtenteDto(new ArrayList<RichiestaUtenteDto>());
			
			
			RichiestaUtenteDto requestUtente = new RichiestaUtenteDto();
			
			requestUtente.setCodFiscale("FNT");
			requestUtente.setCognome("CACACE");
			requestUtente.setNome("CICILLO");
			requestUtente.setDataNascita(dataNascita.toDate());
			requestUtente.seteMail("cicillo.cacace@email.com");
			requestUtente.setFlagCertificato(true);
			
			
			request.getElencoRichiestaUtenteDto().add(requestUtente);
			
			
			fpabilHelper.saveRichiesta(request);
			
			assertTrue(true);
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
