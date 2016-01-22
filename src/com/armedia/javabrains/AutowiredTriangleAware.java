package com.armedia.javabrains;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AutowiredTriangleAware extends AutowiredTriangle implements ApplicationContextAware, BeanNameAware {

	private ApplicationContext context = null;
	private String beanName = "";
	
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
		System.out.println("Bean name is " + this.beanName);
	}

}
