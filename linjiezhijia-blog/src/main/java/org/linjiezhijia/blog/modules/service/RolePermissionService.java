package org.linjiezhijia.blog.modules.service;

import org.linjiezhijia.blog.modules.entity.Permission;
import org.linjiezhijia.blog.modules.entity.RolePermission;

import java.util.List;
import java.util.Set;

/**
 * @author - roilat-J
 * @create - 2018/5/18
 */
public interface RolePermissionService {
	List<Permission> findPermissions(long roleId);

	void deleteByRoleId(long roleId);

	void add(Set<RolePermission> rolePermissions);

}
