package it.csi.fpabil.fpabilbl.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.csi.fpabil.fpabilbl.util.Constants;
import it.csi.fpabil.fpabilbl.util.Tracer;

public class CorsFilter implements Filter {
	
	
	protected final static Logger LOG = LoggerFactory.getLogger(Constants.LOGGER_PREFIX);

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {

		if (devmode) {
			HttpServletResponse res = (HttpServletResponse) servletResponse;
			res.setHeader("Access-Control-Allow-Origin", "*");
			res.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
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