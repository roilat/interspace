package org.linjiezhijia.blog.modules.repository;

import java.util.List;

import org.linjiezhijia.blog.modules.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RoleRepository extends JpaRepository<Role, Long>, JpaSpecificationExecutor<Role> {
	List<Role> findAllByStatus(int status);
}
