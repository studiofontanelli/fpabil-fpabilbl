package it.csi.fpabil.fpabilbl.web.rest.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.csi.fpabil.fpabilbl.business.exception.HelperException;
import it.csi.fpabil.fpabilbl.business.exception.UnauthorizedHelperException;
import it.csi.fpabil.fpabilbl.business.helper.FpabilHelper;
import it.csi.fpabil.fpabilbl.dto.ErrorDetail;
import it.csi.fpabil.fpabilbl.web.rest.dto.GenericResponse;
import it.csi.fpabil.fpabilbl.web.rest.service.TestApi;


@Component("testApi")
public class TestApiServiceImpl implements TestApi {

	@Autowired
	FpabilHelper fpabilHelper;

	public Response testResources(SecurityContext securityContext, HttpHeaders httpHeaders ) {
		GenericResponse response = new GenericResponse();
		response.setMessage("TUTTO OK");
		
		//try {
		Boolean result = fpabilHelper.testResources("REST SERVICE");
		
		//result = false;
		
		if(!result) {
			
			List<ErrorDetail> errorDetails = new ArrayList<ErrorDetail>();
			errorDetails.add(new ErrorDetail("nome", "Il nome è un parametro obbligarorio"));
			
			throw new HelperException("Il servizio di test resource ha dato esito negativo", errorDetails);
		}
		if(1==1111) {
			throw new HelperException("SI E' ROTTO TUTTO");
		}
		if(1==1222) {
			throw new UnauthorizedHelperException("NON SEI AUTORIZZATO");
		}
		return Response.ok().entity(response).build();
	}
}


