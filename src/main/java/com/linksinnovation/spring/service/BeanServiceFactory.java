/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linksinnovation.spring.service;

/**
 *
 * @author Jirawong Wongdokpuang <jirawong@linksinnovation.com>
 */
public class BeanServiceFactory {
    
    private String message;
    
    private BeanServiceFactory(String message){
        this.message = message;
    }
    
    public static BeanServiceFactory getInstance(String message){
        return new BeanServiceFactory(message);
    }

    public String getMessage() {
        return message;
    }
    
}
