package cn.roilat.interspace.api.biz.blog.dao.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import cn.roilat.interspace.api.biz.blog.dbo.BlogAttachmentDO;
import cn.roilat.interspace.api.biz.blog.model.BlogAttachment;

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
    List<BlogAttachment> pageList(BlogAttachmentDO blogAttachmentDO);

    /**
     * 
     */
    int update(@Param("record") BlogAttachment blogAttachment,@Param("param") BlogAttachmentDO blogAttachmentDO);
   
}