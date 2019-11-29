package cn.roilat.interspace.api.biz.blog.services.impl;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import cn.roilat.interspace.api.biz.blog.dao.jpa.BlogArticleDAO;
import cn.roilat.interspace.api.biz.blog.dao.mappers.BlogArticleMapper;
import cn.roilat.interspace.api.biz.blog.dbo.BlogArticleDO;
import cn.roilat.interspace.api.biz.blog.model.BlogArticle;
import cn.roilat.interspace.api.biz.blog.po.BlogArticlePO;
import cn.roilat.interspace.api.biz.blog.services.BlogArticleService;
import cn.roilat.interspace.api.common.enums.CommonRecordStateEnum;
import cn.roilat.interspace.api.common.result.CommonPageResult;
import cn.roilat.interspace.api.common.result.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BlogArticleServiceImpl implements BlogArticleService {

    @Autowired
    private BlogArticleMapper blogArticleMapper;
    @Autowired
    private BlogArticleDAO blogArticleDAO;

    @Transactional
    public CommonResult<BlogArticle> save(BlogArticle blogArticle) {
        CommonResult<BlogArticle> result = new CommonResult<BlogArticle>();
        blogArticle.setState(CommonRecordStateEnum.NORMAL.getCode());
        blogArticle = blogArticleDAO.save(blogArticle);
        result.setData(blogArticle);
        return result;

    }

    @Override
    public CommonPageResult<BlogArticle> pageList(BlogArticlePO blogArticlePO) {
        CommonPageResult<BlogArticle> result = new CommonPageResult<BlogArticle>();
        BlogArticleDO blogArticleDO = new BlogArticleDO();
        blogArticleDO.buildCriteria(blogArticlePO);
        long total = blogArticleMapper.pageCount(blogArticleDO);
        if (total > 0) {
            List<BlogArticle> list = blogArticleMapper.pageList(blogArticleDO);
            result.setData(list);
            result.fillPageInfo(total, blogArticlePO.getCurrentPage(), blogArticlePO.getPageSize());
        }
        return result;
    }

    @Override
    public CommonResult<BlogArticle> update(BlogArticle blogArticle) {
        CommonResult<BlogArticle> result = new CommonResult<BlogArticle>();
        if(blogArticleDAO.existsById(blogArticle.getId())) {
            result.setSuccess(false);
            result.setMsg("数据不存在！");
            return result;
        }
        blogArticle.setUpdateDt(new Date());
        blogArticleDAO.save(blogArticle);
        result.setData(blogArticle);
        return result;
    }

    @Override
    public CommonResult<BlogArticle> delete(BlogArticle blogArticle) {
        CommonResult<BlogArticle> result = new CommonResult<BlogArticle>();
        if(blogArticleDAO.existsById(blogArticle.getId())) {
            result.setSuccess(false);
            result.setMsg("数据不存在！");
            return result;
        }
        blogArticle.setState(CommonRecordStateEnum.DELETE.getCode());
        
        blogArticleDAO.delete(blogArticle);
        result.setData(blogArticle);
        return result;
    }

    @Override
    public CommonResult<BlogArticle> getById(Integer id) {
        CommonResult<BlogArticle> result = new CommonResult<>();
        BlogArticle blogArticle = blogArticleDAO.findById(id).get();
        result.setData(blogArticle);
        result.buildResult(blogArticle != null);
        return result;
    }
}
