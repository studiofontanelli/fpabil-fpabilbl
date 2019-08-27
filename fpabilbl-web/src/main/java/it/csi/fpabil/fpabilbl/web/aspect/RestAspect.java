package it.csi.fpabil.fpabilbl.web.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import it.csi.fpabil.fpabilbl.business.aspect.CommonAspect;
import it.csi.fpabil.fpabilbl.util.Constants;


@Component("restAspect")
@Aspect
public class RestAspect extends CommonAspect{

	public static final String LOGGER_PREFIX = Constants.APPLICATION_CODE + ".aspect";
	
	@Around(value = "execution(* it.csi.fpabil.fpabilbl.web.rest.service.impl..*.*(..))", argNames = "joinPoint")
	public Object stopWatchMethod(ProceedingJoinPoint joinPoint) throws Throwable {
		return super.stopWatchAspect(joinPoint);
	}

}