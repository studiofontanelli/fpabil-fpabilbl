package it.csi.fpabil.fpabilbl.business.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import it.csi.fpabil.fpabilbl.util.Constants;


@Component("helperAspect")
@Aspect
public class HelperAspect extends CommonAspect{

	public static final String LOGGER_PREFIX = Constants.APPLICATION_CODE + ".aspect";
	
	@Around(value = "execution(* it.csi.fpabil.fpabilbl.business.helper.impl..*.*(..))", argNames = "joinPoint")
	public Object stopWatchMethod(ProceedingJoinPoint joinPoint) throws Throwable {
		return super.stopWatchAspect(joinPoint);
	}
	
	@Before(value="execution(* it.csi.fpabil.fpabilbl.business.helper.impl..*.*(..))")
	public void beforeAspect(JoinPoint joinPoint) throws Throwable {
		super.beforeAspect(joinPoint);
	}
	
	@AfterThrowing (pointcut="execution(* it.csi.fpabil.fpabilbl.business.helper.impl..*.*(..))", throwing="ex" )
	public void afterThrowingAspect(JoinPoint joinPoint, Exception ex) throws Throwable {
		super.afterThrowingAspect(joinPoint, ex);
	}


}