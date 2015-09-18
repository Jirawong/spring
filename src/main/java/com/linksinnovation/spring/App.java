/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linksinnovation.spring;

import com.linksinnovation.spring.service.BeanCaller1;
import com.linksinnovation.spring.service.BeanCaller2;
import java.util.Arrays;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Jirawong Wongdokpuang <jirawong@linksinnovation.com>
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        System.out.println(Arrays.toString(context.getEnvironment().getActiveProfiles()));
        
        BeanCaller1 bc1 = context.getBean(BeanCaller1.class);
        System.out.println(bc1.getSimpleMessageBean().getMessage());
        bc1.getSimpleMessageBean().setMessage("bc1 change message");
        BeanCaller2 bc2 = context.getBean(BeanCaller2.class);
        System.out.println(bc2.getSimpleMessageBean().getMessage());
    }
}
