package cn.roilat.interspace.api.biz.blog.dao.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import cn.roilat.interspace.api.biz.blog.dbo.BlogCategoryDO;
import cn.roilat.interspace.api.biz.blog.model.BlogCategory;

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
    List<BlogCategory> pageList(BlogCategoryDO blogCategoryDO);

    /**
     * 
     */
    int update(@Param("record") BlogCategory blogCategory,@Param("param") BlogCategoryDO blogCategoryDO);
   
}