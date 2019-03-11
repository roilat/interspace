package org.linjiezhijia.api.biz.blog.controller;

import javax.annotation.Resource;

import org.linjiezhijia.api.biz.blog.model.BlogCategory;
import org.linjiezhijia.api.biz.blog.po.BlogCategoryPO;
import org.linjiezhijia.api.biz.blog.services.BlogCategoryService;
import org.linjiezhijia.api.common.result.CommonPageResult;
import org.linjiezhijia.api.common.result.CommonResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/blog/category")
public class BlogCategoryController {
    @Resource
    private BlogCategoryService blogCategoryService;

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public CommonResult<BlogCategory> getById(@PathVariable("id") String idStr) {
        CommonResult<BlogCategory> result;
        try {
            Integer id = Integer.parseInt(idStr);
            result = blogCategoryService.getById(id);
        } catch (NumberFormatException e) {
            result = new CommonResult<>();
            result.buildResult(false);

        }
        return result;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET, produces = "application/json")
    public CommonPageResult<BlogCategory> pageList(BlogCategoryPO blogCategoryPO) {
        CommonPageResult<BlogCategory> result = blogCategoryService.pageList(blogCategoryPO);
        return result;
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public CommonResult<BlogCategory> save(BlogCategory blogCategory) {
        CommonResult<BlogCategory> result = blogCategoryService.save(blogCategory);
        return result;
    }

    @RequestMapping(method = RequestMethod.PUT, produces = "application/json")
    public CommonResult<BlogCategory> update(BlogCategory blogCategory) {
        CommonResult<BlogCategory> result = blogCategoryService.update(blogCategory);
        return result;
    }

    @RequestMapping(method = RequestMethod.DELETE, produces = "application/json")
    public CommonResult<BlogCategory> delete(BlogCategory blogCategory) {
        CommonResult<BlogCategory> result = blogCategoryService.update(blogCategory);
        return result;
    }
}
