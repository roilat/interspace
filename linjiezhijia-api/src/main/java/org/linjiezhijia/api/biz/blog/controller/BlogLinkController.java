package org.linjiezhijia.api.biz.blog.controller;

import javax.annotation.Resource;

import org.linjiezhijia.api.biz.blog.model.BlogLink;
import org.linjiezhijia.api.biz.blog.po.BlogLinkPO;
import org.linjiezhijia.api.biz.blog.services.BlogLinkService;
import org.linjiezhijia.api.common.result.CommonPageResult;
import org.linjiezhijia.api.common.result.CommonResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/blog/link")
public class BlogLinkController {
    @Resource
    private BlogLinkService blogLinkService;

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public CommonResult<BlogLink> getById(@PathVariable("id") String idStr) {
        CommonResult<BlogLink> result;
        try {
            Integer id = Integer.parseInt(idStr);
            result = blogLinkService.getById(id);
        } catch (NumberFormatException e) {
            result = new CommonResult<>();
            result.buildResult(false);

        }
        return result;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET, produces = "application/json")
    public CommonPageResult<BlogLink> pageList(BlogLinkPO blogLinkPO) {
        CommonPageResult<BlogLink> result = blogLinkService.pageList(blogLinkPO);
        return result;
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public CommonResult<BlogLink> save(BlogLink blogLink) {
        CommonResult<BlogLink> result = blogLinkService.save(blogLink);
        return result;
    }

    @RequestMapping(method = RequestMethod.PUT, produces = "application/json")
    public CommonResult<BlogLink> update(BlogLink blogLink) {
        CommonResult<BlogLink> result = blogLinkService.update(blogLink);
        return result;
    }

    @RequestMapping(method = RequestMethod.DELETE, produces = "application/json")
    public CommonResult<BlogLink> delete(BlogLink blogLink) {
        CommonResult<BlogLink> result = blogLinkService.update(blogLink);
        return result;
    }
}
