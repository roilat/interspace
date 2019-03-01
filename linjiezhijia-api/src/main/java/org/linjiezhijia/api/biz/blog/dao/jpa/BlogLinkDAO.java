package org.linjiezhijia.api.biz.blog.dao.jpa;

import org.linjiezhijia.api.biz.blog.model.BlogLink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogLinkDAO  extends JpaRepository<BlogLink, Integer> {
}