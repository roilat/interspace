package cn.roilat.interspace.api.biz.blog.dao.jpa;

import cn.roilat.interspace.api.biz.blog.model.BlogLink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogLinkDAO  extends JpaRepository<BlogLink, Integer> {
}