package cn.roilat.interspace.api.biz.blog.services;

import cn.roilat.interspace.api.biz.blog.model.BlogCategory;
import cn.roilat.interspace.api.biz.blog.po.BlogCategoryPO;
import cn.roilat.interspace.api.common.result.CommonPageResult;
import cn.roilat.interspace.api.common.result.CommonResult;

public interface BlogCategoryService {
    public CommonResult<BlogCategory> save(BlogCategory blogCategory) ;

    public CommonPageResult<BlogCategory> pageList(BlogCategoryPO blogCategoryPO);

    public CommonResult<BlogCategory> update(BlogCategory blogCategory);
    
    public CommonResult<BlogCategory> delete(BlogCategory blogCategory);

    public CommonResult<BlogCategory> getById(Integer id);

}
