package com.learning.spring.spring_java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
       IRadio radio = (IRadio) ctx.getBean(RadioImpl.class);
       System.out.println(radio.getChannelName());
       
       BeanHiji beanHiji = (BeanHiji) ctx.getBean(BeanHiji.class);
       
       
       
    }
}
