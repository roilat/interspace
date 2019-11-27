package org.linjiezhijia.blog.web.controller.site.auth;

import org.linjiezhijia.blog.base.lang.Consts;
import org.linjiezhijia.blog.base.lang.Result;
import org.linjiezhijia.blog.modules.data.UserVO;
import org.linjiezhijia.blog.modules.service.SecurityCodeService;
import org.linjiezhijia.blog.modules.service.UserService;
import org.linjiezhijia.blog.web.controller.BaseController;
import org.linjiezhijia.blog.web.controller.site.Views;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author roilat-J on 2015/8/14.
 */
@Controller
public class ForgotController extends BaseController {
	@Autowired
	private UserService userService;
	@Autowired
	private SecurityCodeService securityCodeService;

	@GetMapping("/forgot")
	public String view() {
		return view(Views.FORGOT);
	}

	@PostMapping("/forgot")
	public String reset(String email, String code, String password, ModelMap model) {
		String view = view(Views.FORGOT);
		try {
			Assert.hasLength(email, "请输入邮箱地址");
			Assert.hasLength(code, "请输入验证码");
			UserVO user = userService.getByEmail(email);
			Assert.notNull(user, "账户不存在");

			securityCodeService.verify(String.valueOf(user.getId()), Consts.CODE_FORGOT, code);
			userService.updatePassword(user.getId(), password);
			model.put("data", Result.successMessage("恭喜您, 密码重置成功"));
			view = view(Views.LOGIN);
		} catch (Exception e) {
			model.put("data", Result.failure(e.getMessage()));
		}
		return view;
	}
}
