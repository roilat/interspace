package org.linjiezhijia.api.biz.blog.dao.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.linjiezhijia.api.biz.blog.dbo.BlogArticleDO;
import org.linjiezhijia.api.biz.blog.model.BlogArticle;

public interface BlogArticleMapper {
    /**
     * 
     */
    int delete(BlogArticleDO blogArticleDO);

    /**
     * 
     */
    int insert(BlogArticle blogArticle);

    /**
     * 
     * 也可以使用@Select("select 1 from dual")
     */
    long pageCount(BlogArticleDO blogArticleDO);

    /**
     * 
     */
    List<BlogArticle> pageList(BlogArticleDO blogArticleDO);

    /**
     * 
     */
    int update(@Param("record") BlogArticle blogArticle,@Param("param") BlogArticleDO blogArticleDO);
}