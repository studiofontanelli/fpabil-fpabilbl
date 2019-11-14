package it.csi.fpabil.fpabilbl.web.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.StringReader;

import javax.ws.rs.core.Response;

import org.apache.commons.io.IOUtils;
import org.codehaus.jackson.map.ObjectMapper;
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

import it.csi.fpabil.fpabilbl.util.Constants;
import it.csi.fpabil.fpabilbl.util.Tracer;
import it.csi.fpabil.fpabilbl.util.XmlSerializer;
import it.csi.fpabil.fpabilbl.web.rest.dto.Operatore;
import it.csi.fpabil.fpabilbl.web.rest.dto.Persona;
import it.csi.fpabil.fpabilbl.web.rest.dto.PersonaArray;
import it.csi.fpabil.fpabilbl.web.rest.dto.Richiedente;
import it.csi.fpabil.fpabilbl.web.rest.dto.SalvaRichiestaRequest;
import it.csi.fpabil.fpabilbl.web.rest.service.RichiestaApi;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/spring-web-junit.xml")
public class RichiestaApiTest {

	protected final Logger LOG = LoggerFactory.getLogger(Constants.LOGGER_PREFIX);

	private static final String JSON_DATA = "data/SalvaRichiestaRequest.json";
	
	@Autowired
	private RichiestaApi richiestaApi;
	
	
	
	@Test
	public final void testWriteJson() {
		final String method = "testWriteJson";
		Tracer.debug(LOG, getClass().getName(), method, "BEGIN");

		try {
			
			
			ObjectMapper objectMapper = new ObjectMapper();	
			
			
			
			
			SalvaRichiestaRequest request = new SalvaRichiestaRequest();
			
			
			request.setOperatore(new Operatore());
			request.getOperatore().setGruppo("C");
			
			String response = 	objectMapper.writeValueAsString(request);
			
			
			
			
			Tracer.debug(LOG, getClass().getName(), method, "json= \n"+response);
			
			
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
	

	@Test
	public final void testSaveRequest() {
		final String method = "testSaveRequest";
		Tracer.debug(LOG, getClass().getName(), method, "BEGIN");

		try {
			SalvaRichiestaRequest request = new SalvaRichiestaRequest();
			
			DateTimeFormatter fmt = DateTimeFormat.forPattern("dd/MM/yyyy");
			
			DateTime dataNascita = fmt.parseDateTime("22/02/1973");
			DateTime dataRilascioDocumento = fmt.parseDateTime("01/01/2015");
			DateTime currentDate = new DateTime();
			
			
			// OPERATORE
			request.setOperatore(new Operatore());
			request.getOperatore().setCodice("7"); // OBBLIGATORIO
			request.getOperatore().setGruppo("B"); // OBBLIGATORIO
			
			// CF e PI mutuamente esclusive
			request.getOperatore().setCodiceFiscale("FNTOP"); 
			request.getOperatore().setPartitaIva(null);
			
			// CASO ITALIA
			
			request.getOperatore().setCapSedeLegale("10036"); // OBBLIGATORIO
			request.getOperatore().setProvinciaSedeLegale("001"); // OBBLIGATORIO
			request.getOperatore().setComuneSedeLegale("001272"); // OBBLIGATORIO
			
			request.getOperatore().setEmail("operatore@gmail.com");
			request.getOperatore().setTelefono("011"); // OBBLIGATORIO
			request.getOperatore().setFax(null);
			
			
			// RICHIEDENTE
			request.setRichiedente(new Richiedente());
			request.getRichiedente().setNome("Cicillo");
			request.getRichiedente().setCognome("Cacace");
			request.getRichiedente().setDataNascita(dataNascita.toDate());
			request.getRichiedente().setComuneNascita("001004");
			request.getRichiedente().setProvinciaNascita("001");
			request.getRichiedente().setEmail("richiedente@gmail.com");
			request.getRichiedente().setTelefono("02");
			
			
			// PERSONA
			Persona persona = new Persona();
			
			persona.setCognome("Fontanelli"); // OBBLIGATORIO
			persona.setNome("Andrea"); // OBBLIGATORIO
			persona.setDataNascita(dataNascita.toDate());
			
			// ABILITAZIONE
			persona.setTipoDocumento("CI"); // Obbligatorio
			persona.setNumeroDocumento("00990088");
			persona.setDataRilascioDocumento(dataRilascioDocumento.toDate());
			persona.setEmail("persona@gmail.com");
			
			request.setElencoPersone(new PersonaArray());
			request.getElencoPersone().add(persona);
			
			
			
			Response response = richiestaApi.saveRequest(request, null, null);
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
