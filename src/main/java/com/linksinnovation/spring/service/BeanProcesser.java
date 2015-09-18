/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linksinnovation.spring.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 *
 * @author Jirawong Wongdokpuang <jirawong@linksinnovation.com>
 */
public class BeanProcesser implements InitializingBean,BeanNameAware,BeanFactoryAware,ApplicationContextAware,BeanPostProcessor{
    
    @PostConstruct
    public void postConstruct(){
        System.out.println("PostConstruct");
    }
    
    @PreDestroy
    public void preeDestroy(){
        System.out.println("PreDestroy");
    }
    
    public void init(){
        System.out.println("call init method");
    }
    
    public void destroy(){
        System.out.println("call destroy method");
    }

    @Override
    public void setBeanName(String string) {
        System.out.println("--------------------- beanName "+string);
    }

    @Override
    public void setBeanFactory(BeanFactory bf) throws BeansException {
        if(bf.containsBean("bf")){
            System.out.println("---------------- contain in bf");
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        if(ac.containsBean("bf")){
            System.out.println("---------------- contain in ac");
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Property set");
    }

    @Override
    public Object postProcessBeforeInitialization(Object o, String string) throws BeansException {
        //System.out.println("postProcessBeforeInitialization "+string);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String string) throws BeansException {
        //System.out.println("postProcessAfterInitialization "+string);
        return o;
    }
}
