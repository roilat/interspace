package org.linjiezhijia.api.biz.blog.services.impl;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.linjiezhijia.api.biz.blog.dao.jpa.BlogAttachmentDAO;
import org.linjiezhijia.api.biz.blog.dao.mappers.BlogAttachmentMapper;
import org.linjiezhijia.api.biz.blog.dbo.BlogAttachmentDO;
import org.linjiezhijia.api.biz.blog.model.BlogAttachment;
import org.linjiezhijia.api.biz.blog.po.BlogAttachmentPO;
import org.linjiezhijia.api.biz.blog.services.BlogAttachmentService;
import org.linjiezhijia.api.common.enums.CommonRecordStateEnum;
import org.linjiezhijia.api.common.result.CommonPageResult;
import org.linjiezhijia.api.common.result.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogAttachmentServiceImpl implements BlogAttachmentService {

    @Autowired
    private BlogAttachmentMapper blogAttachmentMapper;
    @Autowired
    private BlogAttachmentDAO blogAttachmentDAO;

    @Transactional(value=TxType.REQUIRED)
    public CommonResult<BlogAttachment> save(BlogAttachment blogAttachment) {
        CommonResult<BlogAttachment> result = new CommonResult<BlogAttachment>();
        blogAttachment.setState(CommonRecordStateEnum.NORMAL.getCode());
        //blogAttachment.setType("");
        blogAttachmentDAO.save(blogAttachment);
        result.setData(blogAttachment);
        return result;

    }

    @Override
    public CommonPageResult<BlogAttachment> pageList(BlogAttachmentPO blogAttachmentPO) {
        CommonPageResult<BlogAttachment> result = new CommonPageResult<BlogAttachment>();
        BlogAttachmentDO blogAttachmentDO = new BlogAttachmentDO();
        blogAttachmentDO.buildCriteria(blogAttachmentPO);
        long total = blogAttachmentMapper.pageCount(blogAttachmentDO);
        if (total > 0) {
            List<BlogAttachment> list = blogAttachmentMapper.pageList(blogAttachmentDO);
            result.setData(list);
            result.fillPageInfo(total, blogAttachmentPO.getCurrentPage(), blogAttachmentPO.getPageSize());
        }
        return result;
    }

    @Override
    public CommonResult<BlogAttachment> update(BlogAttachment blogAttachment) {
        CommonResult<BlogAttachment> result = new CommonResult<BlogAttachment>();
        if(blogAttachmentDAO.existsById(blogAttachment.getId())) {
            result.setSuccess(false);
            result.setMsg("数据不存在！");
            return result;
        }
        blogAttachment.setUpdateDt(new Date());
        blogAttachmentDAO.save(blogAttachment);
        result.setData(blogAttachment);
        return result;
    }

    @Override
    public CommonResult<BlogAttachment> delete(BlogAttachment blogAttachment) {
        CommonResult<BlogAttachment> result = new CommonResult<BlogAttachment>();
        if(blogAttachmentDAO.existsById(blogAttachment.getId())) {
            result.setSuccess(false);
            result.setMsg("数据不存在！");
            return result;
        }
        blogAttachment.setState(CommonRecordStateEnum.DELETE.getCode());
        blogAttachmentDAO.delete(blogAttachment);
        result.setData(blogAttachment);
        return result;
    }

    @Override
    public CommonResult<BlogAttachment> getById(Integer id) {
        CommonResult<BlogAttachment> result = new CommonResult<>();
        BlogAttachment blogAttachment = blogAttachmentDAO.findById(id).get();
        result.setData(blogAttachment);
        result.buildResult(blogAttachment != null);
        return result;
    }
}
