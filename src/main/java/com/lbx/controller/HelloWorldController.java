package com.lbx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @date 2018/5/18 17:14
 */
@Controller
public class HelloWorldController {
    @RequestMapping("/hello")
    public void hello(){
        System.out.println("hello");
    }
}
