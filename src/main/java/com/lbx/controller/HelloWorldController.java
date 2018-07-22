package com.lbx.controller;

import com.lbx.cache.CacheService;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.servlet.HttpServletBean;

/**
 * @date 2018/5/18 17:14
 */
@Controller
public class HelloWorldController  extends HttpServletBean{

    @Autowired
    CacheService cacheService;


    @RequestMapping("/hello")
    public void hello() throws InterruptedException {
        cacheService.put("hello","world");
        Thread.sleep(1000);
        System.out.println(cacheService.get("hello"));
        Thread.sleep(1000);
        System.out.println("这个时什么"+cacheService.get("hello"));
    }

    @RequestMapping("/world")
    public void world(){
        System.out.println("world");
    }

    @RequestMapping("/helloworld")
    public String helloworld(){
        System.out.println("helloworld");
        return null;
    }

    @RequestMapping("/helloInteger")
    public Integer helloInteger(){
        System.out.println("helloInteger");
        return null;
    }






}
