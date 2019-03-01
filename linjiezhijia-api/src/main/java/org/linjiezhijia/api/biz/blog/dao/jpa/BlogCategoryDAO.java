package org.linjiezhijia.api.biz.blog.dao.jpa;

import org.linjiezhijia.api.biz.blog.model.BlogCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogCategoryDAO extends JpaRepository<BlogCategory, Integer>  {
   
}