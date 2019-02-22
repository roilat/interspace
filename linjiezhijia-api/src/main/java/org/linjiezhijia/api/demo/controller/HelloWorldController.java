package org.linjiezhijia.api.demo.controller;

import org.linjiezhijia.api.demo.mappers.ArticleMapper;
import org.linjiezhijia.api.demo.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Autowired
    private ArticleMapper mapper;
    @RequestMapping("/hello")
    @ResponseBody
    public Article index() {
        Article article = mapper.queryById(1L);
        return article;
    }
}
