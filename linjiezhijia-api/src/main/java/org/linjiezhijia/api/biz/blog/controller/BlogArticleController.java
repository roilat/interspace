package org.linjiezhijia.api.biz.blog.controller;

import javax.annotation.Resource;

import org.linjiezhijia.api.biz.blog.model.BlogArticle;
import org.linjiezhijia.api.biz.blog.po.BlogArticlePO;
import org.linjiezhijia.api.biz.blog.services.BlogArticleService;
import org.linjiezhijia.api.common.result.CommonPageResult;
import org.linjiezhijia.api.common.result.CommonResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/blog")
public class BlogArticleController {
    @Resource
    private BlogArticleService blogArticleService;

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public CommonResult<BlogArticle> getById(@PathVariable("id") String idStr) {
        CommonResult<BlogArticle> result;
        try {
            Integer id = Integer.parseInt(idStr);
            result = blogArticleService.getById(id);
        } catch (NumberFormatException e) {
            result = new CommonResult<>();
            result.buildResult(false);

        }
        return result;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET, produces = "application/json")
    public CommonPageResult<BlogArticle> pageList(BlogArticlePO blogArticlePO) {
        CommonPageResult<BlogArticle> result = blogArticleService.pageList(blogArticlePO);
        return result;
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public CommonResult<BlogArticle> save(BlogArticle blogArticle) {
        CommonResult<BlogArticle> result = blogArticleService.save(blogArticle);
        return result;
    }

    @RequestMapping(method = RequestMethod.PUT, produces = "application/json")
    public CommonResult<BlogArticle> update(BlogArticle blogArticle) {
        CommonResult<BlogArticle> result = blogArticleService.update(blogArticle);
        return result;
    }

    @RequestMapping(method = RequestMethod.DELETE, produces = "application/json")
    public CommonResult<BlogArticle> delete(BlogArticle blogArticle) {
        CommonResult<BlogArticle> result = blogArticleService.update(blogArticle);
        return result;
    }
}
