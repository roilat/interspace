package org.linjiezhijia.api.biz.blog.services;

import org.linjiezhijia.api.biz.blog.model.BlogAttachment;
import org.linjiezhijia.api.biz.blog.po.BlogAttachmentPO;
import org.linjiezhijia.api.common.result.CommonPageResult;
import org.linjiezhijia.api.common.result.CommonResult;

public interface BlogAttachmentService {
    public CommonResult<BlogAttachment> save(BlogAttachment blogAttachment) ;

    public CommonPageResult<BlogAttachment> pageList(BlogAttachmentPO blogAttachmentPO);

    public CommonResult<BlogAttachment> update(BlogAttachment blogAttachment);
    
    public CommonResult<BlogAttachment> delete(BlogAttachment blogAttachment);

    public CommonResult<BlogAttachment> getById(Integer id);

}
