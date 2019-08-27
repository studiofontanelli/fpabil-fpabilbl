package it.csi.fpabil.fpabilbl.web.provider;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

import it.csi.fpabil.fpabilbl.business.exception.HelperException;
import it.csi.fpabil.fpabilbl.business.exception.UnauthorizedHelperException;
import it.csi.fpabil.fpabilbl.util.Constants;
import it.csi.fpabil.fpabilbl.util.Tracer;
import it.csi.fpabil.fpabilbl.util.XmlSerializer;
import it.csi.fpabil.fpabilbl.web.dto.ExceptionDto;



@Provider
public class ExceptionHandler implements ExceptionMapper<RuntimeException> {

	private Logger LOG = LoggerFactory.getLogger(Constants.LOGGER_PREFIX);

	@Override
	public Response toResponse(RuntimeException exception) {
		String method = "toResponse";
		Tracer.info(LOG, getClass().getName(), method, "RuntimeException " + exception);
		ExceptionDto e = null;
		if(exception instanceof HelperException) {
			e = new ExceptionDto(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(), ((HelperException)exception).getErrorDetails());	
		}
		else if(exception instanceof UnauthorizedHelperException) {
			e = new ExceptionDto(HttpStatus.UNAUTHORIZED, exception.getMessage(), ((UnauthorizedHelperException)exception).getErrorDetails());	
		}
		else {	
			e = new ExceptionDto(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage());
		}	
		
		Tracer.info(LOG, getClass().getName(), method, "ExceptionDto\n " + XmlSerializer.objectToXml(e));
		return Response.status(e.getStatus()).entity(e).build();
	}
}