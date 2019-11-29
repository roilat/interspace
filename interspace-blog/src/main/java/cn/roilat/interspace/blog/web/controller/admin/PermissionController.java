package cn.roilat.interspace.blog.web.controller.admin;

import cn.roilat.interspace.blog.modules.data.PermissionTree;
import cn.roilat.interspace.blog.modules.service.PermissionService;
import cn.roilat.interspace.blog.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author - roilat-J
 * @create - 2018/5/18
 */
@RestController
@RequestMapping("/admin/permission")
public class PermissionController extends BaseController {
	@Autowired
	private PermissionService permissionService;

	@GetMapping("/tree")
	public List<PermissionTree> tree() {
		return permissionService.tree();
	}
}
