package cn.roilat.interspace.api.biz.blog.services;

import cn.roilat.interspace.api.biz.blog.model.BlogAttachment;
import cn.roilat.interspace.api.biz.blog.po.BlogAttachmentPO;
import cn.roilat.interspace.api.common.result.CommonPageResult;
import cn.roilat.interspace.api.common.result.CommonResult;

public interface BlogAttachmentService {
    public CommonResult<BlogAttachment> save(BlogAttachment blogAttachment) ;

    public CommonPageResult<BlogAttachment> pageList(BlogAttachmentPO blogAttachmentPO);

    public CommonResult<BlogAttachment> update(BlogAttachment blogAttachment);
    
    public CommonResult<BlogAttachment> delete(BlogAttachment blogAttachment);

    public CommonResult<BlogAttachment> getById(Integer id);

}
