package it.csi.fpabil.fpabilbl.web.util;

import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.csi.fpabil.fpabilbl.util.Constants;
import it.csi.fpabil.fpabilbl.util.Tracer;

public class TracerWeb {

	protected final static Logger LOG = LoggerFactory.getLogger(Constants.LOGGER_PREFIX);




	public static void traceHeader(final String clazz, final String method, HttpHeaders httpHeaders) {

		MultivaluedMap<String, String> map = httpHeaders.getRequestHeaders();

		Iterator<String> keys = map.keySet().iterator();

		while(keys.hasNext()) {
			String key = keys.next();
			Tracer.debug(LOG, clazz, method, "HEADER["+key+"]= " + map.get(key));
		}


	}

	public static void traceRequest(final String clazz, final String method, HttpServletRequest request) {
		Tracer.debug(LOG, clazz, method, "*** TRACING REQUEST ***");

		Tracer.debug(LOG, clazz, method, "method       = " + request.getMethod());
		Tracer.debug(LOG, clazz, method, "content type = " + request.getContentType());






	}

}
