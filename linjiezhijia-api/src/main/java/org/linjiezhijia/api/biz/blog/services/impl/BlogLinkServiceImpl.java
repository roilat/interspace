package org.linjiezhijia.api.biz.blog.services.impl;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.linjiezhijia.api.biz.blog.dao.jpa.BlogLinkDAO;
import org.linjiezhijia.api.biz.blog.dao.mappers.BlogLinkMapper;
import org.linjiezhijia.api.biz.blog.dbo.BlogLinkDO;
import org.linjiezhijia.api.biz.blog.model.BlogLink;
import org.linjiezhijia.api.biz.blog.po.BlogLinkPO;
import org.linjiezhijia.api.biz.blog.services.BlogLinkService;
import org.linjiezhijia.api.common.enums.CommonRecordStateEnum;
import org.linjiezhijia.api.common.result.CommonPageResult;
import org.linjiezhijia.api.common.result.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogLinkServiceImpl implements BlogLinkService {

    @Autowired
    private BlogLinkMapper blogLinkMapper;
    @Autowired
    private BlogLinkDAO blogLinkDAO;

    @Transactional(value=TxType.REQUIRED)
    public CommonResult<BlogLink> save(BlogLink blogLink) {
        CommonResult<BlogLink> result = new CommonResult<BlogLink>();
        blogLinkDAO.save(blogLink);
        result.setData(blogLink);
        return result;

    }

    @Override
    public CommonPageResult<BlogLink> pageList(BlogLinkPO blogLinkPO) {
        CommonPageResult<BlogLink> result = new CommonPageResult<BlogLink>();
        BlogLinkDO blogLinkDO = new BlogLinkDO();
        blogLinkDO.buildCriteria(blogLinkPO);
        long total = blogLinkMapper.pageCount(blogLinkDO);
        if (total > 0) {
            List<BlogLink> list = blogLinkMapper.pageList(blogLinkDO);
            result.setData(list);
            result.fillPageInfo(total, blogLinkPO.getCurrentPage(), blogLinkPO.getPageSize());
        }
        return result;
    }

    @Override
    public CommonResult<BlogLink> update(BlogLink blogLink) {
        CommonResult<BlogLink> result = new CommonResult<BlogLink>();
        if(blogLinkDAO.existsById(blogLink.getId())) {
            result.setSuccess(false);
            result.setMsg("数据不存在！");
            return result;
        }
        blogLink.setUpdateDt(new Date());
        blogLinkDAO.save(blogLink);
        result.setData(blogLink);
        return result;
    }

    @Override
    public CommonResult<BlogLink> delete(BlogLink blogLink) {
        CommonResult<BlogLink> result = new CommonResult<BlogLink>();
        if(blogLinkDAO.existsById(blogLink.getId())) {
            result.setSuccess(false);
            result.setMsg("数据不存在！");
            return result;
        }
        blogLink.setState(CommonRecordStateEnum.DELETE.getCode());
        blogLinkDAO.delete(blogLink);
        result.setData(blogLink);
        return result;
    }

    @Override
    public CommonResult<BlogLink> getById(Integer id) {
        CommonResult<BlogLink> result = new CommonResult<>();
        BlogLink blogLink = blogLinkDAO.findById(id).get();
        result.setData(blogLink);
        result.buildResult(blogLink != null);
        return result;
    }
}
