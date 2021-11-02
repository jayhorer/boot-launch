package com.zimug.bootlaunch.controller;

import com.zimug.bootlaunch.model.AjaxResponse;
import com.zimug.bootlaunch.model.Article;
import com.zimug.bootlaunch.model.Reader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Created by Jay on 20/12/14 - 21:48
 */
@Slf4j
@RestController
@RequestMapping("/rest")
public class ArticleRestController {

    //@RequestMapping(value = "/article",method = POST,produces = "application/json")
    @PostMapping("/article")
    public AjaxResponse saveArticle(Article article){
        log.info("saveArticle:{}",article);
        return AjaxResponse.success(article);
    }

    // @RequestMapping(value = "/article/{id}",method = DELETE,produces = "application/json")
    @DeleteMapping("/article/{id}")
    public AjaxResponse deleteArticle(@PathVariable Long id){
        log.info("deleteArticle:{}",id);
        return AjaxResponse.success(id);
    }

    // @RequestMapping(value = "/article/{id}",method = PUT,produces = "application/json")
    @PutMapping("/article/{id}")
    public AjaxResponse updateArticle(@PathVariable Long id){
        log.info("updateArticle:{}",id);
        return AjaxResponse.success(id);
    }

    /**
     *
     * @param id
     * @return
     * {"code":200,"message":"success","data":{"id":1,"author":"fucker","title":"No 1","createTime":"2021-11-01T22:26:49.441+00:00","content":"这是一个SpringBoot 教学","reader":[{"name":"goodMan","age":18}]},"ok":true}
     */
    // @RequestMapping(value = "/article/{id}",method = GET,produces = "application/json")
    @GetMapping("/article/{id}")
    public AjaxResponse getArticle(@PathVariable Long id){
        Reader reader = new Reader();
        reader.setName("goodMan");
        reader.setAge(18);
        List<Reader> readers = new ArrayList<>();
        readers.add(reader);
        Article article = Article.builder().id(1L).author("fucker").reader(readers).content("这是一个SpringBoot 教学").title("No 1").createTime(new Date()).build();
        return AjaxResponse.success(article);
    }


}
