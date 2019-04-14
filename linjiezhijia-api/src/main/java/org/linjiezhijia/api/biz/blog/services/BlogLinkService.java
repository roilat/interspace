package org.linjiezhijia.api.biz.blog.services;

import org.linjiezhijia.api.biz.blog.model.BlogLink;
import org.linjiezhijia.api.biz.blog.po.BlogLinkPO;
import org.linjiezhijia.api.common.result.CommonPageResult;
import org.linjiezhijia.api.common.result.CommonResult;

public interface BlogLinkService {
    public CommonResult<BlogLink> save(BlogLink blogLink) ;

    public CommonPageResult<BlogLink> pageList(BlogLinkPO blogLinkPO);

    public CommonResult<BlogLink> update(BlogLink blogLink);
    
    public CommonResult<BlogLink> delete(BlogLink blogLink);

    public CommonResult<BlogLink> getById(Integer id);

}
