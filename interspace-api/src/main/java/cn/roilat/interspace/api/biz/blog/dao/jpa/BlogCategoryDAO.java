package cn.roilat.interspace.api.biz.blog.dao.jpa;

import cn.roilat.interspace.api.biz.blog.model.BlogCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogCategoryDAO extends JpaRepository<BlogCategory, Integer>  {
   
}