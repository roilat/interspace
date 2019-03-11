package org.linjiezhijia.api.biz.blog.controller;

import javax.annotation.Resource;

import org.linjiezhijia.api.biz.blog.model.BlogAttachment;
import org.linjiezhijia.api.biz.blog.po.BlogAttachmentPO;
import org.linjiezhijia.api.biz.blog.services.BlogAttachmentService;
import org.linjiezhijia.api.common.result.CommonPageResult;
import org.linjiezhijia.api.common.result.CommonResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/blog/attachment")
public class BlogAttachmentController {
    @Resource
    private BlogAttachmentService blogAttachmentService;

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public CommonResult<BlogAttachment> getById(@PathVariable("id") String idStr) {
        CommonResult<BlogAttachment> result;
        try {
            Integer id = Integer.parseInt(idStr);
            result = blogAttachmentService.getById(id);
        } catch (NumberFormatException e) {
            result = new CommonResult<>();
            result.buildResult(false);

        }
        return result;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET, produces = "application/json")
    public CommonPageResult<BlogAttachment> pageList(BlogAttachmentPO blogAttachmentPO) {
        CommonPageResult<BlogAttachment> result = blogAttachmentService.pageList(blogAttachmentPO);
        return result;
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public CommonResult<BlogAttachment> save(BlogAttachment blogAttachment) {
        CommonResult<BlogAttachment> result = blogAttachmentService.save(blogAttachment);
        return result;
    }

    @RequestMapping(method = RequestMethod.PUT, produces = "application/json")
    public CommonResult<BlogAttachment> update(BlogAttachment blogAttachment) {
        CommonResult<BlogAttachment> result = blogAttachmentService.update(blogAttachment);
        return result;
    }

    @RequestMapping(method = RequestMethod.DELETE, produces = "application/json")
    public CommonResult<BlogAttachment> delete(BlogAttachment blogAttachment) {
        CommonResult<BlogAttachment> result = blogAttachmentService.update(blogAttachment);
        return result;
    }
}
