package cn.roilat.linjiezhijia.blog.core.persist.dao;

import cn.roilat.linjiezhijia.blog.core.persist.entity.PostAttribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by roilat-D on 2017/9/27.
 */
public interface PostAttributeDao extends JpaRepository<PostAttribute, Long>, JpaSpecificationExecutor<PostAttribute> {

}
