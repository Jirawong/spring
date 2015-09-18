/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linksinnovation.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jirawong Wongdokpuang <jirawong@linksinnovation.com>
 */
public class AnnotationBean1 {
    
    private AnnotationBean2 annotationBean2;
    @Autowired
    private AnnotationBean3 AnnotationBean3;
    
    @Value("${message}")
    private String message;
    
    @Autowired
    public AnnotationBean1(@Qualifier("b2") AnnotationBean b2,@Qualifier("b3") AnnotationBean b3){
        System.out.println(b2.getMessage() + " " + b3.getMessage());
    }

    public AnnotationBean2 getAnnotationBean2() {
        return annotationBean2;
    }

    @Autowired
    public void setAnnotationBean2(AnnotationBean2 annotationBean2) {
        this.annotationBean2 = annotationBean2;
    }

    public AnnotationBean3 getAnnotationBean3() {
        return AnnotationBean3;
    }

    public void setAnnotationBean3(AnnotationBean3 AnnotationBean3) {
        this.AnnotationBean3 = AnnotationBean3;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    
    
    
}
