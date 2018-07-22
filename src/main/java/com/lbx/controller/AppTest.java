package com.lbx.controller;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Create by lbx on 2018/6/18  9:47
 **/
@Component
public class AppTest implements ApplicationContextAware, EnvironmentAware {
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //实现了这个方法Spring会把applicationContext对象传进来
        System.out.println(applicationContext);
    }

    public void setEnvironment(Environment environment) {
        //实现了这个方法Spring会把Environment对象传进来
        System.out.println(environment);
    }

}

