package com.aspiresys.ashwindaniel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitEmp implements BeanPostProcessor {
	private final static Logger log = LoggerFactory.getLogger(Client.class);

	public Object postProcessAfterInitialization(Object bean, String beanName) {
		log.debug("BeforeInitialization : " + beanName);
		return bean; // you can return any other object as well

	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) {
		log.debug("AfterInitialization : " + beanName);
		return bean; // you can return any other object as well

	}

}
