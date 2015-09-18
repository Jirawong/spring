/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linksinnovation.spring.config;

import com.linksinnovation.spring.service.AnnotationBean1;
import com.linksinnovation.spring.service.AnnotationBean2;
import com.linksinnovation.spring.service.AnnotationBean3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.ImportResource;

/**
 *
 * @author Jirawong Wongdokpuang <jirawong@linksinnovation.com>
 */
@Configuration
@ComponentScan(basePackages = "com.linksinnovation.spring")
@ImportResource("classpath:applicationContext.xml")
public class Config {
    
    @Autowired
    private AnnotationBean2 b2;
    @Autowired
    private AnnotationBean3 b3;
    
    @Bean
    @DependsOn("b2")
    public AnnotationBean1 annotationBean1(){
        return new AnnotationBean1(b2, b3);
    }
}
