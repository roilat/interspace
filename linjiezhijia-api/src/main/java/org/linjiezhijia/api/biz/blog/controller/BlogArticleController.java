package org.linjiezhijia.api.biz.blog.controller;

import javax.annotation.Resource;

import org.linjiezhijia.api.biz.blog.model.BlogArticle;
import org.linjiezhijia.api.biz.blog.po.BlogArticlePO;
import org.linjiezhijia.api.biz.blog.services.BlogArticleService;
import org.linjiezhijia.api.common.enums.CommonRecordStateEnum;
import org.linjiezhijia.api.common.exception.LinjiezhijiaErrorCodeEnums;
import org.linjiezhijia.api.common.exception.LinjiezhijiaException;
import org.linjiezhijia.api.common.result.CommonPageResult;
import org.linjiezhijia.api.common.result.CommonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/blog/article")
public class BlogArticleController {

    Logger           logger = LoggerFactory.getLogger(getClass());
    @Resource
    private BlogArticleService blogArticleService;

    @RequestMapping(path = "/", method = RequestMethod.GET, produces = "application/json")
    public CommonPageResult<BlogArticle> pageList(BlogArticlePO blogArticlePO) {
        CommonPageResult<BlogArticle> result = blogArticleService.pageList(blogArticlePO);
        return result;
    }

    @RequestMapping(path = "/", method = RequestMethod.POST, produces = "application/json")
    public CommonResult<BlogArticle> save(@RequestBody BlogArticle blogArticle) {
        CommonResult<BlogArticle> result = blogArticleService.save(blogArticle);
        return result;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT, produces = "application/json")
    public CommonResult<BlogArticle> update(@PathVariable("id") String idStr, @RequestBody BlogArticle blogArticle) {
        Integer id = null;
        try {
            id = Integer.parseInt(idStr);
        } catch (NumberFormatException e) {
        }
        if (id == null) {
            throw new LinjiezhijiaException(LinjiezhijiaErrorCodeEnums.ID_NOT_EXISTS);
        }
        blogArticle.setId(id);
        CommonResult<BlogArticle> result = blogArticleService.update(blogArticle);
        return result;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public CommonResult<BlogArticle> delete(@PathVariable("id") String idStr) {
        Integer id = null;
        try {
            id = Integer.parseInt(idStr);
        } catch (NumberFormatException e) {
        }
        if (id == null) {
            throw new LinjiezhijiaException(LinjiezhijiaErrorCodeEnums.ID_NOT_EXISTS);
        }
        BlogArticle article = new BlogArticle();
        article.setId(id);
        article.setState(CommonRecordStateEnum.DELETE.getCode());
        CommonResult<BlogArticle> result = blogArticleService.update(article);
        return result;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public CommonResult<BlogArticle> getById(@PathVariable("id") String idStr) {
        Integer id = null;
        try {
            id = Integer.parseInt(idStr);
        } catch (NumberFormatException e) {
        }
        if (id == null) {
            throw new LinjiezhijiaException(LinjiezhijiaErrorCodeEnums.ID_NOT_EXISTS);
        }
        CommonResult<BlogArticle> result = blogArticleService.getById(id);
        return result;
    }
}
