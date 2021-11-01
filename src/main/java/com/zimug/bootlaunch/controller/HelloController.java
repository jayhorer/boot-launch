package com.zimug.bootlaunch.controller;

import com.zimug.bootlaunch.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jay on 20/12/13 - 8:22
 */
@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Article hello(){
        // Article fucker = new Article(1L, "fucker");
        Article fucker = Article.builder().id(1L).author("fucker").build();
        log.info("fucker.getId():{}",fucker.getId());
        log.info("fucker.getAuthor():{}",fucker.getAuthor());
        log.info("fucker:{}",fucker);
        return fucker;
    }

}
