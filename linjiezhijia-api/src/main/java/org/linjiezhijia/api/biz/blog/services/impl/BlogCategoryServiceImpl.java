package org.linjiezhijia.api.biz.blog.services.impl;

import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.linjiezhijia.api.biz.blog.dao.jpa.BlogCategoryDAO;
import org.linjiezhijia.api.biz.blog.dao.mappers.BlogCategoryMapper;
import org.linjiezhijia.api.biz.blog.dbo.BlogCategoryDO;
import org.linjiezhijia.api.biz.blog.model.BlogCategory;
import org.linjiezhijia.api.biz.blog.po.BlogCategoryPO;
import org.linjiezhijia.api.biz.blog.services.BlogCategoryService;
import org.linjiezhijia.api.common.result.CommonPageResult;
import org.linjiezhijia.api.common.result.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogCategoryServiceImpl implements BlogCategoryService {

    @Autowired
    private BlogCategoryMapper blogCategoryMapper;
    @Autowired
    private BlogCategoryDAO blogCategoryDAO;

    @Transactional(value=TxType.REQUIRED)
    public CommonResult<BlogCategory> save(BlogCategory blogCategory) {
        CommonResult<BlogCategory> result = new CommonResult<BlogCategory>();
        blogCategoryDAO.save(blogCategory);
        result.setData(blogCategory);
        return result;

    }

    @Override
    public CommonPageResult<BlogCategory> pageList(BlogCategoryPO blogCategoryPO) {
        CommonPageResult<BlogCategory> result = new CommonPageResult<BlogCategory>();
        BlogCategoryDO blogCategoryDO = new BlogCategoryDO();
        long total = blogCategoryMapper.pageCount(blogCategoryDO);
        if (total > 0) {
            List<BlogCategory> list = blogCategoryMapper.pageList(blogCategoryDO);
            result.setData(list);
            result.fillPageInfo(total, blogCategoryPO.getCurrentPage(), blogCategoryPO.getPageSize());
        }
        return result;
    }

    @Override
    public CommonResult<BlogCategory> update(BlogCategory blogCategory) {
        CommonResult<BlogCategory> result = new CommonResult<BlogCategory>();
        blogCategoryDAO.save(blogCategory);
        result.setData(blogCategory);
        return result;
    }

    @Override
    public CommonResult<BlogCategory> delete(BlogCategory blogCategory) {
        CommonResult<BlogCategory> result = new CommonResult<BlogCategory>();
        blogCategoryDAO.delete(blogCategory);
        result.setData(blogCategory);
        return result;
    }

    @Override
    public CommonResult<BlogCategory> getById(Integer id) {
        CommonResult<BlogCategory> result = new CommonResult<>();
        BlogCategory blogCategory = blogCategoryDAO.findById(id).get();
        result.setData(blogCategory);
        result.buildResult(blogCategory != null);
        return result;
    }
}
