package com.zimug.bootlaunch.controller;

import com.zimug.bootlaunch.model.AjaxResponse;
import com.zimug.bootlaunch.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Created by Jay on 20/12/14 - 21:48
 */
@Slf4j
@RestController
@RequestMapping("/rest")
public class ArticleRestController {

    //@RequestMapping(value = "/article", method = POST, produces = "application/json")
    @PostMapping("/article")
    public AjaxResponse saveArticle(@RequestBody Article article){
        log.info("saveArticle:{}",article);
        log.info("saveArticle: {}",article);
        return AjaxResponse.success(article);
    }
    //@RequestMapping(value = "/article/{id}", method = DELETE, produces = "application/json")
    @DeleteMapping("/article/{id}")
    public AjaxResponse deleteArticle(@PathVariable Long id){

        log.info("deleteArticle: {}",id);
        return AjaxResponse.success(id);
    }
    //@RequestMapping(value = "/article/{id}", method = PUT, produces = "application/json")
    @PutMapping("/article/{id}")
    public AjaxResponse updateArticle(@PathVariable Long id,@RequestBody Article article){
        log.info("updateArticle:{}",id);
        return AjaxResponse.success(article);
    }
    //@RequestMapping(value = "/article/{id}", method = GET, produces = "application/json")
    @GetMapping("/article/{id}")
    public AjaxResponse getArticle(@PathVariable Long id){
        Article article = Article.builder().id(1L).author("fucker").content("this is motherfucker").title("t2").build();
        return AjaxResponse.success(article);
    }


}
