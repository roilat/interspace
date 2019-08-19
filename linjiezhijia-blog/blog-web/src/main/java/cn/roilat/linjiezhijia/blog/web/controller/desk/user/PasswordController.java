/*
+--------------------------------------------------------------------------
|   blog [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2014, 2015 mtons. All Rights Reserved
|   http://www.mtons.com
|
+---------------------------------------------------------------------------
*/
package cn.roilat.linjiezhijia.blog.web.controller.desk.user;

import cn.roilat.linjiezhijia.blog.base.data.Data;
import cn.roilat.linjiezhijia.blog.core.data.AccountProfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.roilat.linjiezhijia.blog.core.persist.service.UserService;
import cn.roilat.linjiezhijia.blog.web.controller.BaseController;
import cn.roilat.linjiezhijia.blog.web.controller.desk.Views;

/**
 * @author roilat-D
 *
 */
@Controller
@RequestMapping("/user")
public class PasswordController extends BaseController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/password", method = RequestMethod.GET)
	public String view() {
		return view(Views.USER_PASSWORD);
	}
	
	@RequestMapping(value = "/password", method = RequestMethod.POST)
	public String post(String oldPassword, String password, ModelMap model) {
		Data data;
		try {
			AccountProfile profile = getSubject().getProfile();
			userService.updatePassword(profile.getId(), oldPassword, password);
			
			data = Data.success("操作成功", Data.NOOP);
		} catch (Exception e) {
			data = Data.failure(e.getMessage());
		}
		model.put("data", data);
		return view(Views.USER_PASSWORD);
	}

}
