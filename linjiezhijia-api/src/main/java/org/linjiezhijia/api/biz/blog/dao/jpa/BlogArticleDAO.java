package org.linjiezhijia.api.biz.blog.dao.jpa;

import org.linjiezhijia.api.biz.blog.model.BlogArticle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogArticleDAO extends JpaRepository<BlogArticle, Integer> {

}
