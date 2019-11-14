package it.csi.fpabil.fpabilbl.web.rest.service.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.csi.fpabil.fpabilbl.business.dto.RichiestaOperatoreDto;
import it.csi.fpabil.fpabilbl.business.exception.HelperException;
import it.csi.fpabil.fpabilbl.business.helper.FpabilHelper;
import it.csi.fpabil.fpabilbl.util.Constants;
import it.csi.fpabil.fpabilbl.util.Tracer;
import it.csi.fpabil.fpabilbl.util.XmlSerializer;
import it.csi.fpabil.fpabilbl.util.adapter.exception.DtoConversionException;
import it.csi.fpabil.fpabilbl.web.adapter.RichiestaOperatoreAdapter;
import it.csi.fpabil.fpabilbl.web.rest.dto.SalvaRichiestaRequest;
import it.csi.fpabil.fpabilbl.web.rest.dto.SalvaRichiestaResponse;
import it.csi.fpabil.fpabilbl.web.rest.service.RichiestaApi;

@Component("richiestaApi")
public class RichiestaApiServiceImpl implements RichiestaApi {

	protected final static Logger LOG = LoggerFactory.getLogger(Constants.APPLICATION_CODE  + ".api");

	
	@Autowired
	private FpabilHelper fpabilHelper;

	@Autowired
	private RichiestaOperatoreAdapter richiestaOperatoreAdapter;

	public Response saveRequest(SalvaRichiestaRequest request,SecurityContext securityContext, HttpHeaders httpHeaders ) {
		final String method = "saveRequest";
		try {
			
			if(LOG.isDebugEnabled()) {
				Tracer.debug(LOG, getClass().getName(), method, "SalvaRichiestaRequest\n " + XmlSerializer.objectToXml(request));
			}
			
			RichiestaOperatoreDto richiestaOperatoreDto = richiestaOperatoreAdapter.convertFrom(request);
			
			String result = fpabilHelper.saveRichiesta(richiestaOperatoreDto);

			SalvaRichiestaResponse response = new SalvaRichiestaResponse();
			response.setCodiceRichiesta(result);

			return Response.ok().entity(response).build();


		} catch (DtoConversionException e) {
			Tracer.error(LOG, getClass().getName(), method, "DtoConversionException " + e);
			throw new HelperException("Richiesta non valida: " + e.getMessage());
		}
	}
}
