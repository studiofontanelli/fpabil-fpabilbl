package it.csi.fpabil.fpabilbl.integration;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;

import it.csi.csi.porte.InfoPortaDelegata;
import it.csi.csi.porte.proxy.PDProxy;
import it.csi.csi.util.xml.PDConfigReader;
import it.csi.fpabil.fpabilbl.util.Constants;
import it.csi.fpabil.fpabilbl.util.Tracer;


public class PdProxyFactory {
	
	protected final static Logger LOG = LoggerFactory.getLogger(Constants.LOGGER_PREFIX + ".business.integration");

	
	public PdProxyFactory() {
		
	}

	public Object getObject(Resource pdConfigXml) throws Exception {
		final InfoPortaDelegata info = PDConfigReader.read(pdConfigXml.getInputStream());
		Object pdInterface = Proxy.newProxyInstance(getClass().getClassLoader(), new Class<?>[] { info.getInterfacciaPubblica() }, new InvocationHandler() {
			
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				
				Object result;
				final String metodo = "invoke";
				
				Tracer.debug(LOG, getClass().getName(), metodo, "BEGIN");
				try {
					
					
					Tracer.debug(LOG, getClass().getName(), "method name= ", method.getName());
					Tracer.debug(LOG, getClass().getName(), "method name= ", info.getUrlPortaApplicativa());
					
					
					InfoPortaDelegata infoPD = info.getPlugins()[0];
					
					Tracer.debug(LOG, getClass().getName(), "endpoint= ", infoPD.getUrlPortaApplicativa());
					
					result = method.invoke(PDProxy.newInstance(info), args);
				} catch (InvocationTargetException e) {
					Tracer.error(LOG, getClass().getName(), metodo, "InvocationTargetException: " + e);
					throw e.getTargetException();
				}
				Tracer.debug(LOG, getClass().getName(), metodo, "END");
				return result;
			}
		});
		
		return pdInterface;
	}
}
