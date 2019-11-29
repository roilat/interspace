package cn.roilat.interspace.api.biz.blog.controller;

import javax.annotation.Resource;

import cn.roilat.interspace.api.biz.blog.model.BlogLink;
import cn.roilat.interspace.api.biz.blog.po.BlogLinkPO;
import cn.roilat.interspace.api.biz.blog.services.BlogLinkService;
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
@RequestMapping(value = "/api/blog/link")
public class BlogLinkController {
    @Resource
    private BlogLinkService blogLinkService;
    Logger           logger = LoggerFactory.getLogger(getClass());


    @RequestMapping(path = "/", method = RequestMethod.GET, produces = "application/json")
    public CommonPageResult<BlogLink> pageList(BlogLinkPO blogLinkPO) {
        CommonPageResult<BlogLink> result = blogLinkService.pageList(blogLinkPO);
        return result;
    }

    @RequestMapping(path = "/", method = RequestMethod.POST, produces = "application/json")
    public CommonResult<BlogLink> save(@RequestBody BlogLink blogLink) {
        CommonResult<BlogLink> result = blogLinkService.save(blogLink);
        return result;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT, produces = "application/json")
    public CommonResult<BlogLink> update(@PathVariable("id") String idStr, @RequestBody BlogLink blogLink) {
        Integer id = null;
        try {
            id = Integer.parseInt(idStr);
        } catch (NumberFormatException e) {
        }
        if (id == null) {
            throw new LinjiezhijiaException(LinjiezhijiaErrorCodeEnums.ID_NOT_EXISTS);
        }
        blogLink.setId(id);
        CommonResult<BlogLink> result = blogLinkService.update(blogLink);
        return result;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public CommonResult<BlogLink> delete(@PathVariable("id") String idStr) {
        Integer id = null;
        try {
            id = Integer.parseInt(idStr);
        } catch (NumberFormatException e) {
        }
        if (id == null) {
            throw new LinjiezhijiaException(LinjiezhijiaErrorCodeEnums.ID_NOT_EXISTS);
        }
        BlogLink article = new BlogLink();
        article.setId(id);
        article.setState(CommonRecordStateEnum.DELETE.getCode());
        CommonResult<BlogLink> result = blogLinkService.update(article);
        return result;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public CommonResult<BlogLink> getById(@PathVariable("id") String idStr) {
        Integer id = null;
        try {
            id = Integer.parseInt(idStr);
        } catch (NumberFormatException e) {
        }
        if (id == null) {
            throw new LinjiezhijiaException(LinjiezhijiaErrorCodeEnums.ID_NOT_EXISTS);
        }
        CommonResult<BlogLink> result = blogLinkService.getById(id);
        return result;
    }
}
