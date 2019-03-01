package org.linjiezhijia.api.biz.demo.controller;

import org.linjiezhijia.api.biz.demo.dao.ArticleRepository;
import org.linjiezhijia.api.biz.demo.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Autowired
    private ArticleRepository articleRepository;
    @RequestMapping("/hello")
    @ResponseBody
    public Article index() {
        Article article = articleRepository.findById(1L).get();
        return article;
    }
}
