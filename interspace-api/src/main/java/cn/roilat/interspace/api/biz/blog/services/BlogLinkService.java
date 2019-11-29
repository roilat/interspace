package cn.roilat.interspace.api.biz.blog.services;

import cn.roilat.interspace.api.biz.blog.model.BlogLink;
import cn.roilat.interspace.api.biz.blog.po.BlogLinkPO;
import cn.roilat.interspace.api.common.result.CommonPageResult;
import cn.roilat.interspace.api.common.result.CommonResult;

public interface BlogLinkService {
    public CommonResult<BlogLink> save(BlogLink blogLink) ;

    public CommonPageResult<BlogLink> pageList(BlogLinkPO blogLinkPO);

    public CommonResult<BlogLink> update(BlogLink blogLink);
    
    public CommonResult<BlogLink> delete(BlogLink blogLink);

    public CommonResult<BlogLink> getById(Integer id);

}
