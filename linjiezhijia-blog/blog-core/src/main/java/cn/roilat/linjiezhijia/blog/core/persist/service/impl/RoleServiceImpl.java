package cn.roilat.linjiezhijia.blog.core.persist.service.impl;

import cn.roilat.linjiezhijia.blog.core.data.AuthMenu;
import cn.roilat.linjiezhijia.blog.core.data.Role;
import cn.roilat.linjiezhijia.blog.core.persist.dao.AuthMenuDao;
import cn.roilat.linjiezhijia.blog.core.persist.dao.RoleDao;
import cn.roilat.linjiezhijia.blog.core.persist.entity.AuthMenuPO;
import cn.roilat.linjiezhijia.blog.core.persist.entity.RolePO;
import cn.roilat.linjiezhijia.blog.core.persist.service.RoleService;
import cn.roilat.linjiezhijia.blog.core.persist.utils.BeanMapUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleDao roleDao;

	@Autowired
	private AuthMenuDao authMenuDao;

	@Override
	@Transactional(readOnly = true)
	public Page<Role> paging(Pageable pageable) {
		Page<RolePO> page = roleDao.findAllByOrderByIdDesc(pageable);
		List<Role> roles = new ArrayList<>();
		page.getContent().forEach(po -> {
			roles.add(BeanMapUtils.copy(po));
		});

		return new PageImpl<>(roles, pageable, page.getTotalElements());
	}

	@Override
	@Transactional(readOnly = true)
	public Role get(Long id) {
		RolePO po = roleDao.getOne(id);
		Role role = BeanMapUtils.copy(po);
		return role;
	}

	@Override
	@Transactional
	public void save(Role role){
		RolePO rolePO = new RolePO();
		List<AuthMenu> authMenus = role.getAuthMenus();
		List<AuthMenuPO> authMenuPOs = new ArrayList<>();
		for(AuthMenu authMenu : authMenus){
			AuthMenuPO authMenuPO = authMenuDao.getOne(authMenu.getId());
			authMenuPOs.add(authMenuPO);
		}
		BeanUtils.copyProperties(role, rolePO);
		rolePO.setAuthMenus(authMenuPOs);
		roleDao.save(rolePO);
	}

	@Override
	@Transactional(readOnly=false)
	public void delete(Long id) {
		roleDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Role> getAll() {
		List<RolePO> list = roleDao.findAll();
		List<Role> roles = new ArrayList<>();
		list.forEach(po -> {
			roles.add(BeanMapUtils.copy(po));
		});
		return roles;
	}

}
