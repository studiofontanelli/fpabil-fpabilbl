package it.csi.fpabil.fpabilbl.web.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.csi.fpabil.fpabilbl.util.Constants;
import it.csi.fpabil.fpabilbl.util.Tracer;

public class FpabilHttpServletDispatcher extends HttpServletDispatcher {
	
	protected final static Logger LOG = LoggerFactory.getLogger(Constants.LOGGER_PREFIX);

	/**
	 * 
	 */
	private static final long serialVersionUID = 9015068866707128230L;

	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		final String method = "init";
		super.init(servletConfig);
		
		
		Tracer.info(LOG, getClass().getName(), method, "INIT");
	}

}
