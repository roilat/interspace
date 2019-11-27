package org.linjiezhijia.blog.web.controller.admin;

import java.util.Map;

import org.linjiezhijia.blog.base.lang.Result;
import org.linjiezhijia.blog.config.ContextStartup;
import org.linjiezhijia.blog.modules.service.OptionsService;
import org.linjiezhijia.blog.modules.service.PostSearchService;
import org.linjiezhijia.blog.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 系统配置
 *
 * @author roilat-J
 *
 */
@Controller
@RequestMapping("/admin/options")
public class OptionsController extends BaseController {
	@Autowired
	private OptionsService optionsService;
	@Autowired
	private PostSearchService postSearchService;
	@Autowired
	private ContextStartup contextStartup;

	@RequestMapping("/index")
	public String index(ModelMap model) {
		return "/admin/options/index";
	}

	@RequestMapping("/update")
	public String update(@RequestParam Map<String, String> body, ModelMap model) {
		optionsService.update(body);
		contextStartup.reloadOptions(false);
		model.put("data", Result.success());
		return "/admin/options/index";
	}

	/**
	 * 刷新系统变量
	 * 
	 * @return
	 */
	@RequestMapping("/reload_options")
	@ResponseBody
	public Result<?> reloadOptions() {
		contextStartup.reloadOptions(false);
		contextStartup.resetChannels();
		return Result.success();
	}

	@RequestMapping("/reset_indexes")
	@ResponseBody
	public Result<?> resetIndexes() {
		postSearchService.resetIndexes();
		return Result.success();
	}
}
