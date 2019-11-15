package it.csi.fpabil.fpabilbl.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.csi.fpabil.fpabilbl.util.Constants;
import it.csi.fpabil.fpabilbl.util.Tracer;
import it.csi.fpabil.fpabilbl.web.util.TracerWeb;

public class CorsFilter implements Filter {
	
	
	protected final static Logger LOG = LoggerFactory.getLogger(Constants.LOGGER_PREFIX);

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		final String method = "doFilter";
		Tracer.debug(LOG, getClass().getName(), method, "devmode= " + devmode);
		
		
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		
		TracerWeb.traceRequest(getClass().getName(), method, request);
		Tracer.info(LOG, getClass().getName(), method, "*** CORS FILTER******");
		
		//res.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
		
		
		if (devmode) {
			
			response.setHeader("Access-Control-Allow-Origin", "*");
			response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
			response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
			
			
			if (StringUtils.equals(request.getMethod(), "OPTIONS")){
				Tracer.info(LOG, getClass().getName(), method, "WHY OPTIONS?");
				
			}
		}
		
		
		chain.doFilter(servletRequest, servletResponse);

	}

	private static final String DEVMODE_INIT_PARAM = "devmode";
	private boolean devmode = false;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		String method = "init";
		String sDevmode = filterConfig.getInitParameter(DEVMODE_INIT_PARAM);
		Tracer.info(LOG, getClass().getName(), method, "sDevmode= " + sDevmode);
		
		
		if ("true".equals(sDevmode)) {
			devmode = true;
		} else {
			devmode = false;
		}
	}

	@Override
	public void destroy() {
	}

}