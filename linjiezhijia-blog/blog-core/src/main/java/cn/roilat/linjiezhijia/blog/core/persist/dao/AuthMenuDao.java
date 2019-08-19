package cn.roilat.linjiezhijia.blog.core.persist.dao;

import cn.roilat.linjiezhijia.blog.core.persist.entity.AuthMenuPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface AuthMenuDao extends JpaRepository<AuthMenuPO, Long>, JpaSpecificationExecutor<AuthMenuPO> {
    List<AuthMenuPO> findAllByParentIdOrderBySortAsc(Long parentId);
    List<AuthMenuPO> findAll();
}
