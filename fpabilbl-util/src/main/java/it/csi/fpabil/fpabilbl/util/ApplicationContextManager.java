package it.csi.fpabil.fpabilbl.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextManager implements ApplicationContextAware {

	private static ApplicationContext appContext;

	// Private constructor prevents instantiation from other classes
	private ApplicationContextManager() {
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		appContext = applicationContext;
	}

	public static Object getBean(String beanName) {
		return appContext.getBean(beanName);
	}

	public static <T> T getBean(Class<T> clazz) {
		return appContext.getBean(clazz);
	}

}
