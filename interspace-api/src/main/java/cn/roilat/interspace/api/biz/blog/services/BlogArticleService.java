package cn.roilat.interspace.api.biz.blog.services;

import cn.roilat.interspace.api.biz.blog.model.BlogArticle;
import cn.roilat.interspace.api.biz.blog.po.BlogArticlePO;
import cn.roilat.interspace.api.common.result.CommonPageResult;
import cn.roilat.interspace.api.common.result.CommonResult;

public interface BlogArticleService {
    public CommonResult<BlogArticle> save(BlogArticle blogArticle) ;

    public CommonPageResult<BlogArticle> pageList(BlogArticlePO blogArticlePO);

    public CommonResult<BlogArticle> update(BlogArticle blogArticle);
    
    public CommonResult<BlogArticle> delete(BlogArticle blogArticle);

    public CommonResult<BlogArticle> getById(Integer id);

}
