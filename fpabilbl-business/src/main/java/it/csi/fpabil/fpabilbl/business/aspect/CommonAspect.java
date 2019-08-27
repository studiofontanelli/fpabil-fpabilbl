package it.csi.fpabil.fpabilbl.business.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.csi.fpabil.fpabilbl.business.exception.HelperException;
import it.csi.fpabil.fpabilbl.util.Constants;
import it.csi.fpabil.fpabilbl.util.Tracer;
import it.csi.fpabil.fpabilbl.util.XmlSerializer;
import it.csi.util.performance.StopWatch;


public class CommonAspect {

	protected static final String LOGGER_PREFIX = Constants.APPLICATION_CODE + ".aspect";
	protected final static Logger LOG = LoggerFactory.getLogger(LOGGER_PREFIX);
	private StopWatch stopWatch = null; 

	public Object stopWatchAspect(ProceedingJoinPoint joinPoint) throws Throwable {
		String className = joinPoint.getTarget().getClass().getSimpleName();
		String method = joinPoint.getSignature().getName();

		Tracer.debug(LOG, className, method, "BEGIN");
		stopWatch = new StopWatch(LOGGER_PREFIX);
		try {
			stopWatch.start();
			Object result = joinPoint.proceed();
			if(LOG.isDebugEnabled()) {
				Tracer.debug(LOG, className, method, "out:\n " + XmlSerializer.objectToXml(result));
			}
			return result;
		}
		finally {
			Tracer.debug(LOG, className, method, "END");
			stopWatch.stop();
			stopWatch.dumpElapsed(className, method, "tempo esecuzione di [" +LOGGER_PREFIX+"]::["  + method + "]", "(ASPECT)");
		}
	}
	
	public void beforeAspect(JoinPoint joinPoint) throws Throwable {
		
		String className = joinPoint.getTarget().getClass().getSimpleName();
		String method = joinPoint.getSignature().getName();
		
		if(LOG.isDebugEnabled()) {
			Tracer.debug(LOG, className, method, "in:");
		
			for(int i = 0; i<joinPoint.getArgs().length; i++ ) {
				Tracer.debug(LOG, className, method, "arg[" + i + "]:\n " + XmlSerializer.objectToXml(joinPoint.getArgs()[i]));
				
			}
		}
		
		
	}
	
	
	public void afterAspect(JoinPoint joinPoint) throws Throwable {
		String className = joinPoint.getTarget().getClass().getSimpleName();
		String method = joinPoint.getSignature().getName();
		
		
		Tracer.debug(LOG, className, method, "afterAspect....");
		
		
	}
	
	public void afterThrowingAspect(JoinPoint joinPoint, Exception ex) throws Throwable {
		
		String className = joinPoint.getTarget().getClass().getSimpleName();
		String method = joinPoint.getSignature().getName();
		
		Tracer.error(LOG, className, method, "Si e' verificato un errore: " + ex);
		Tracer.info(LOG, className, method, "trace params:");
		for(int i = 0; i<joinPoint.getArgs().length; i++ ) {
			Tracer.info(LOG, className, method, "arg[" + i + "]: " + XmlSerializer.objectToXml(joinPoint.getArgs()[i]));
		}
		throw new HelperException(ex.getMessage(), ex);
		
		
	}


}