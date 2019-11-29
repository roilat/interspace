package cn.roilat.interspace.api.biz.blog.dao.jpa;

import cn.roilat.interspace.api.biz.blog.model.BlogAttachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogAttachmentDAO extends JpaRepository<BlogAttachment, Integer> {

}