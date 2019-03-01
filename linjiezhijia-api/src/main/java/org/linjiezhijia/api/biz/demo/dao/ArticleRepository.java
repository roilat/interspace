package org.linjiezhijia.api.biz.demo.dao;

import java.util.List;

import org.linjiezhijia.api.biz.demo.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * jpa实现
 * 
 * @author roilat-J
 * @version $Id: ArticleRepository.java, v 0.1 2019年2月21日 下午4:17:55 roilat-J Exp $
 */
public interface ArticleRepository extends JpaRepository<Article, Long> {
    public List<Article> findByUserId(Long userId);

    @Query("select art from Article art where title=:title")
    public List<Article> queryByTitle(@Param("title") String title);
}
