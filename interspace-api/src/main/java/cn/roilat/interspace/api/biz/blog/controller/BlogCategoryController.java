package cn.roilat.interspace.api.biz.blog.controller;

import javax.annotation.Resource;

import cn.roilat.interspace.api.biz.blog.model.BlogCategory;
import cn.roilat.interspace.api.biz.blog.po.BlogCategoryPO;
import cn.roilat.interspace.api.biz.blog.services.BlogCategoryService;
import cn.roilat.interspace.api.common.enums.CommonRecordStateEnum;
import cn.roilat.interspace.api.common.exception.LinjiezhijiaErrorCodeEnums;
import cn.roilat.interspace.api.common.exception.LinjiezhijiaException;
import cn.roilat.interspace.api.common.result.CommonPageResult;
import cn.roilat.interspace.api.common.result.CommonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/blog/category")
public class BlogCategoryController {
    @Resource
    private BlogCategoryService blogCategoryService;
    Logger           logger = LoggerFactory.getLogger(getClass());


    @RequestMapping(path = "/", method = RequestMethod.GET, produces = "application/json")
    public CommonPageResult<BlogCategory> pageList(BlogCategoryPO blogCategoryPO) {
        CommonPageResult<BlogCategory> result = blogCategoryService.pageList(blogCategoryPO);
        return result;
    }

    @RequestMapping(path = "/", method = RequestMethod.POST, produces = "application/json")
    public CommonResult<BlogCategory> save(@RequestBody BlogCategory blogCategory) {
        CommonResult<BlogCategory> result = blogCategoryService.save(blogCategory);
        return result;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT, produces = "application/json")
    public CommonResult<BlogCategory> update(@PathVariable("id") String idStr, @RequestBody BlogCategory blogCategory) {
        Integer id = null;
        try {
            id = Integer.parseInt(idStr);
        } catch (NumberFormatException e) {
        }
        if (id == null) {
            throw new LinjiezhijiaException(LinjiezhijiaErrorCodeEnums.ID_NOT_EXISTS);
        }
        blogCategory.setId(id);
        CommonResult<BlogCategory> result = blogCategoryService.update(blogCategory);
        return result;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public CommonResult<BlogCategory> delete(@PathVariable("id") String idStr) {
        Integer id = null;
        try {
            id = Integer.parseInt(idStr);
        } catch (NumberFormatException e) {
        }
        if (id == null) {
            throw new LinjiezhijiaException(LinjiezhijiaErrorCodeEnums.ID_NOT_EXISTS);
        }
        BlogCategory article = new BlogCategory();
        article.setId(id);
        article.setState(CommonRecordStateEnum.DELETE.getCode());
        CommonResult<BlogCategory> result = blogCategoryService.update(article);
        return result;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public CommonResult<BlogCategory> getById(@PathVariable("id") String idStr) {
        Integer id = null;
        try {
            id = Integer.parseInt(idStr);
        } catch (NumberFormatException e) {
        }
        if (id == null) {
            throw new LinjiezhijiaException(LinjiezhijiaErrorCodeEnums.ID_NOT_EXISTS);
        }
        CommonResult<BlogCategory> result = blogCategoryService.getById(id);
        return result;
    }
}
