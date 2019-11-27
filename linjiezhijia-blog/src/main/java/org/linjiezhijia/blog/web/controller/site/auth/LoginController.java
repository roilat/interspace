package org.linjiezhijia.blog.web.controller.site.auth;

import org.linjiezhijia.blog.base.lang.Result;
import org.linjiezhijia.blog.modules.data.AccountProfile;
import org.linjiezhijia.blog.web.controller.BaseController;
import org.linjiezhijia.blog.web.controller.site.Views;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 登录
 * 
 * @author roilat-J
 */
@Controller
public class LoginController extends BaseController {

	/**
	 * 跳转登录页
	 * 
	 * @return
	 */
	@GetMapping(value = "/login")
	public String view() {
		return view(Views.LOGIN);
	}

	/**
	 * 提交登录
	 * 
	 * @param username
	 * @param password
	 * @param model
	 * @return
	 */
	@PostMapping(value = "/login")
	public String login(String username, String password,
			@RequestParam(value = "rememberMe", defaultValue = "0") Boolean rememberMe, ModelMap model) {
		String view = view(Views.LOGIN);

		Result<AccountProfile> result = executeLogin(username, password, rememberMe);

		if (result.isOk()) {
			view = String.format(Views.REDIRECT_USER_HOME, result.getData().getId());
		} else {
			model.put("message", result.getMessage());
		}
		return view;
	}

}
