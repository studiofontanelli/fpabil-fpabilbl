package it.csi.fpabil.fpabilbl.business.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component("integrationAspect")
@Aspect
public class IntegrationAspect extends CommonAspect {

	@Around(value = "execution(* it.csi.fpabil.fpabilbl.integration.impl..*.*(..))", argNames = "joinPoint")
	public Object stopWatchMethod(ProceedingJoinPoint joinPoint) throws Throwable {
		return super.stopWatchAspect(joinPoint);
	}
	
	@Before(value="execution(* it.csi.fpabil.fpabilbl.integration.impl..*.*(..))")
	public void beforeAspect(JoinPoint joinPoint) throws Throwable {
		super.beforeAspect(joinPoint);
	}
	
	@AfterThrowing (pointcut="execution(* it.csi.fpabil.fpabilbl.integration.impl..*.*(..))", throwing="ex" )
	public void afterThrowingAspect(JoinPoint joinPoint, Exception ex) throws Throwable {
		super.afterThrowingAspect(joinPoint, ex);
	}


}