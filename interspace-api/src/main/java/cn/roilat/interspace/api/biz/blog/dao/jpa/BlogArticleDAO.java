package cn.roilat.interspace.api.biz.blog.dao.jpa;

import cn.roilat.interspace.api.biz.blog.model.BlogArticle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogArticleDAO extends JpaRepository<BlogArticle, Integer> {

}
