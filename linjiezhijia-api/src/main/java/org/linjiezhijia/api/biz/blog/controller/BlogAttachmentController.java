package org.linjiezhijia.api.biz.blog.controller;

import javax.annotation.Resource;

import org.linjiezhijia.api.biz.blog.model.BlogAttachment;
import org.linjiezhijia.api.biz.blog.po.BlogAttachmentPO;
import org.linjiezhijia.api.biz.blog.services.BlogAttachmentService;
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
@RequestMapping(value = "/api/blog/attachment")
public class BlogAttachmentController {
    @Resource
    private BlogAttachmentService blogAttachmentService;
    Logger           logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(path = "/", method = RequestMethod.GET, produces = "application/json")
    public CommonPageResult<BlogAttachment> pageList(BlogAttachmentPO blogAttachmentPO) {
        CommonPageResult<BlogAttachment> result = blogAttachmentService.pageList(blogAttachmentPO);
        return result;
    }

    @RequestMapping(path = "/", method = RequestMethod.POST, produces = "application/json")
    public CommonResult<BlogAttachment> save(@RequestBody BlogAttachment blogAttachment) {
        CommonResult<BlogAttachment> result = blogAttachmentService.save(blogAttachment);
        return result;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT, produces = "application/json")
    public CommonResult<BlogAttachment> update(@PathVariable("id") String idStr, @RequestBody BlogAttachment blogAttachment) {
        Integer id = null;
        try {
            id = Integer.parseInt(idStr);
        } catch (NumberFormatException e) {
        }
        if (id == null) {
            throw new LinjiezhijiaException(LinjiezhijiaErrorCodeEnums.ID_NOT_EXISTS);
        }
        blogAttachment.setId(id);
        CommonResult<BlogAttachment> result = blogAttachmentService.update(blogAttachment);
        return result;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public CommonResult<BlogAttachment> delete(@PathVariable("id") String idStr) {
        Integer id = null;
        try {
            id = Integer.parseInt(idStr);
        } catch (NumberFormatException e) {
        }
        if (id == null) {
            throw new LinjiezhijiaException(LinjiezhijiaErrorCodeEnums.ID_NOT_EXISTS);
        }
        BlogAttachment article = new BlogAttachment();
        article.setId(id);
        article.setState(CommonRecordStateEnum.DELETE.getCode());
        CommonResult<BlogAttachment> result = blogAttachmentService.update(article);
        return result;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public CommonResult<BlogAttachment> getById(@PathVariable("id") String idStr) {
        Integer id = null;
        try {
            id = Integer.parseInt(idStr);
        } catch (NumberFormatException e) {
        }
        if (id == null) {
            throw new LinjiezhijiaException(LinjiezhijiaErrorCodeEnums.ID_NOT_EXISTS);
        }
        CommonResult<BlogAttachment> result = blogAttachmentService.getById(id);
        return result;
    }
}
