/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linksinnovation.spring;

import com.linksinnovation.spring.config.Config;
import com.linksinnovation.spring.service.AnnotationBean1;
import java.util.Arrays;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Jirawong Wongdokpuang <jirawong@linksinnovation.com>
 */
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        
        System.out.println(Arrays.toString(context.getEnvironment().getActiveProfiles()));
        
        AnnotationBean1 bean = context.getBean(AnnotationBean1.class);
        
        System.out.println(bean.getAnnotationBean2().getMessage());
        System.out.println(bean.getAnnotationBean3().getMessage());
        
        bean.getAnnotationBean2().setMessage("new message b2");
        bean.getAnnotationBean3().setMessage("new message b3");
        
        System.out.println(bean.getAnnotationBean2().getMessage());
        System.out.println(bean.getAnnotationBean3().getMessage());
        
        System.out.println(bean.getAnnotationBean3().getAnnotationBean2().getMessage());
        bean.getAnnotationBean3().getAnnotationBean2().setMessage("new for b2");
        System.out.println(bean.getAnnotationBean3().getAnnotationBean2().getMessage());
        System.out.println(bean.getAnnotationBean2().getMessage());
        
        
        System.out.println(bean.getMessage());
        
    }
}
