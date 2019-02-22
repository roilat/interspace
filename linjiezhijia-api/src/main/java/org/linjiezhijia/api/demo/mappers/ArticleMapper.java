package org.linjiezhijia.api.demo.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.linjiezhijia.api.demo.model.Article;

/**
 * mybatis 实现
 * 
 * @author roilat-J
 * @version $Id: ArticleMapper.java, v 0.1 2019年2月21日 下午4:17:40 roilat-J Exp $
 */
public interface ArticleMapper {
    public Long insertArticle(Article article);

    public void updateArticle(Article article);

    public Article queryById(Long id);

    public List<Article> queryArticlesByPage(@Param("article") Article article,
                                             @Param("pageSize") int pageSize,
                                             @Param("offset") int offset);
}
