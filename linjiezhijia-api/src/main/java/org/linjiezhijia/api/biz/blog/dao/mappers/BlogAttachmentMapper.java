package org.linjiezhijia.api.biz.blog.dao.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.linjiezhijia.api.biz.blog.dbo.BlogAttachmentDO;
import org.linjiezhijia.api.biz.blog.model.BlogArticle;
import org.linjiezhijia.api.biz.blog.model.BlogAttachment;

public interface BlogAttachmentMapper {
    /**
     * 
     */
    int delete(BlogAttachmentDO blogAttachmentDO);

    /**
     * 
     */
    int insert(BlogAttachment blogAttachment);

    /**
     * 
     */
    long pageCount(BlogAttachmentDO blogAttachmentDO);

    /**
     * 
     */
    List<BlogArticle> pageList(BlogAttachmentDO blogAttachmentDO);

    /**
     * 
     */
    int update(@Param("record") BlogAttachment blogAttachment,@Param("param") BlogAttachmentDO blogAttachmentDO);
   
}