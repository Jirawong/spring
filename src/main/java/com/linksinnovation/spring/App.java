/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linksinnovation.spring;

import com.linksinnovation.spring.service.BeanCaller1;
import com.linksinnovation.spring.service.BeanCaller2;
import com.linksinnovation.spring.service.ConstructorBean;
import com.linksinnovation.spring.service.SetterBean;
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
        
        ConstructorBean cb = context.getBean(ConstructorBean.class);
        System.out.println(cb.getInjectBean().getMessage());
        
        SetterBean sb = context.getBean(SetterBean.class);
        System.out.println(sb.getInjectBean().getMessage());
    }
}
