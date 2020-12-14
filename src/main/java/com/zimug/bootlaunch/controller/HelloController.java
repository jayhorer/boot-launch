package com.zimug.bootlaunch.controller;

import com.zimug.bootlaunch.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Jay on 20/12/13 - 8:22
 */
@Slf4j
@RestController
public class HelloController {



    @RequestMapping("/hello")
    public Article hello(){
        Article sucker = Article.builder().author("sucdfdfdfdfdfker").id(2L).build();

        log.info("this is i new a object:{}",sucker);

        return sucker;
    }

}
