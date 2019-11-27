package org.linjiezhijia.blog.web.controller.site;

import javax.servlet.http.HttpServletRequest;

import org.linjiezhijia.blog.base.lang.Consts;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import org.linjiezhijia.blog.web.controller.BaseController;

/**
 * @author roilat-J
 *
 */
@Controller
public class IndexController extends BaseController {

	@RequestMapping(value = { "/", "/index" })
	public String root(ModelMap model, HttpServletRequest request) {
		String order = ServletRequestUtils.getStringParameter(request, "order", Consts.order.NEWEST);
		int pageNo = ServletRequestUtils.getIntParameter(request, "pageNo", 1);
		model.put("order", order);
		model.put("pageNo", pageNo);
		return view(Views.INDEX);
	}

}
