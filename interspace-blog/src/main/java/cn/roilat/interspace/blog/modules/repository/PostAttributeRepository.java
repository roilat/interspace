package cn.roilat.interspace.blog.modules.repository;

import cn.roilat.interspace.blog.modules.entity.PostAttribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by roilat-J on 2018/9/27.
 */
public interface PostAttributeRepository
		extends JpaRepository<PostAttribute, Long>, JpaSpecificationExecutor<PostAttribute> {
}
