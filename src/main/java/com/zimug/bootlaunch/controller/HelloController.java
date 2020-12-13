package com.zimug.bootlaunch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jay on 20/12/13 - 8:22
 */
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello(){
        return "hello World";
    }

}
