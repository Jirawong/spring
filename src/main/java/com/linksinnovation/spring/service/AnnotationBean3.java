/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linksinnovation.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jirawong Wongdokpuang <jirawong@linksinnovation.com>
 */
@Component("b3")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class AnnotationBean3 implements AnnotationBean{
    
    @Autowired
    private AnnotationBean2 annotationBean2;
    private String message = "bean3";

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AnnotationBean2 getAnnotationBean2() {
        return annotationBean2;
    }

    public void setAnnotationBean2(AnnotationBean2 annotationBean2) {
        this.annotationBean2 = annotationBean2;
    }
    
    
    
}
