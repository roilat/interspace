package cn.roilat.interspace.api.biz.blog.services.impl;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import cn.roilat.interspace.api.biz.blog.dao.jpa.BlogCategoryDAO;
import cn.roilat.interspace.api.biz.blog.dao.mappers.BlogCategoryMapper;
import cn.roilat.interspace.api.biz.blog.dbo.BlogCategoryDO;
import cn.roilat.interspace.api.biz.blog.model.BlogCategory;
import cn.roilat.interspace.api.biz.blog.po.BlogCategoryPO;
import cn.roilat.interspace.api.biz.blog.services.BlogCategoryService;
import cn.roilat.interspace.api.common.enums.CommonRecordStateEnum;
import cn.roilat.interspace.api.common.result.CommonPageResult;
import cn.roilat.interspace.api.common.result.CommonResult;
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
        blogCategoryDO.buildCriteria(blogCategoryPO);
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
        if(blogCategoryDAO.existsById(blogCategory.getId())) {
            result.setSuccess(false);
            result.setMsg("数据不存在！");
            return result;
        }
        blogCategory.setUpdateDt(new Date());
        blogCategoryDAO.save(blogCategory);
        result.setData(blogCategory);
        return result;
    }

    @Override
    public CommonResult<BlogCategory> delete(BlogCategory blogCategory) {
        CommonResult<BlogCategory> result = new CommonResult<BlogCategory>();
        if(blogCategoryDAO.existsById(blogCategory.getId())) {
            result.setSuccess(false);
            result.setMsg("数据不存在！");
            return result;
        }
        blogCategory.setState(CommonRecordStateEnum.DELETE.getCode());
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
