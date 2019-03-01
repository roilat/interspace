package org.linjiezhijia.api.biz.blog.dao.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.linjiezhijia.api.biz.blog.dbo.BlogCategoryDO;
import org.linjiezhijia.api.biz.blog.model.BlogArticle;
import org.linjiezhijia.api.biz.blog.model.BlogCategory;

public interface BlogCategoryMapper {
    /**
     * 
     */
    int delete(BlogCategoryDO blogCategoryDO);

    /**
     * 
     */
    int insert(BlogCategory blogCategory);

    /**
     * 
     */
    long pageCount(BlogCategoryDO blogCategoryDO);

    /**
     * 
     */
    List<BlogArticle> pageList(BlogCategoryDO blogCategoryDO);

    /**
     * 
     */
    int update(@Param("record") BlogCategory blogCategory,@Param("param") BlogCategoryDO blogCategoryDO);
   
}