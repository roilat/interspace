package org.linjiezhijia.api.biz.blog.services;

import org.linjiezhijia.api.biz.blog.model.BlogCategory;
import org.linjiezhijia.api.biz.blog.po.BlogCategoryPO;
import org.linjiezhijia.api.common.result.CommonPageResult;
import org.linjiezhijia.api.common.result.CommonResult;

public interface BlogCategoryService {
    public CommonResult<BlogCategory> save(BlogCategory blogCategory) ;

    public CommonPageResult<BlogCategory> pageList(BlogCategoryPO blogCategoryPO);

    public CommonResult<BlogCategory> update(BlogCategory blogCategory);
    
    public CommonResult<BlogCategory> delete(BlogCategory blogCategory);

    public CommonResult<BlogCategory> getById(Integer id);

}
