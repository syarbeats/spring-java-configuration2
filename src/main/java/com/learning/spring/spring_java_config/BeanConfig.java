package com.learning.spring.spring_java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Bean
	public IRadio myRadio() {
		return new RadioImpl();
	}
	
	@Bean(initMethod = "init")
	public BeanHiji beanHiji() {
		return new BeanHiji();
	}
	
	@Bean(destroyMethod = "cleanUp")
	public BeanDua beanDua(){
		return new BeanDua();
	}
}
