package cn.roilat.interspace.api.biz.blog.dao.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import cn.roilat.interspace.api.biz.blog.dbo.BlogLinkDO;
import cn.roilat.interspace.api.biz.blog.model.BlogLink;

public interface BlogLinkMapper {
    /**
     * 
     */
    int delete(BlogLinkDO blogLinkDO);

    /**
     * 
     */
    int insert(BlogLink blogLink);

    /**
     * 
     */
    long pageCount(BlogLinkDO blogLinkDO);

    /**
     * 
     */
    List<BlogLink> pageList(BlogLinkDO blogLinkDO);

    /**
     * 
     */
    int update(@Param("record") BlogLink blogLink, @Param("param") BlogLinkDO blogLinkDO);
}