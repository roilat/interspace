package org.linjiezhijia.api.biz.blog.services;

import org.linjiezhijia.api.biz.blog.model.BlogArticle;
import org.linjiezhijia.api.biz.blog.po.BlogArticlePO;
import org.linjiezhijia.api.common.result.CommonPageResult;
import org.linjiezhijia.api.common.result.CommonResult;

public interface BlogArticleService {
    public CommonResult<BlogArticle> save(BlogArticle blogArticle) ;

    public CommonPageResult<BlogArticle> pageList(BlogArticlePO blogArticlePO);

    public CommonResult<BlogArticle> update(BlogArticle blogArticle);
    
    public CommonResult<BlogArticle> delete(BlogArticle blogArticle);

    public CommonResult<BlogArticle> getById(Integer id);

}
