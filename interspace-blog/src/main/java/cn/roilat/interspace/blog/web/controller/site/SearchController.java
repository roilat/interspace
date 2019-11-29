package cn.roilat.interspace.blog.web.controller.site;

import cn.roilat.interspace.blog.modules.data.PostVO;
import cn.roilat.interspace.blog.modules.service.PostSearchService;
import cn.roilat.interspace.blog.web.controller.BaseController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 文章搜索
 * 
 * @author roilat-J
 *
 */
@Controller
public class SearchController extends BaseController {
	@Autowired
	private PostSearchService postSearchService;

	@RequestMapping("/search")
	public String search(String kw, ModelMap model) {
		Pageable pageable = wrapPageable();
		try {
			if (StringUtils.isNotEmpty(kw)) {
				Page<PostVO> page = postSearchService.search(pageable, kw);
				model.put("results", page);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.put("kw", kw);
		return view(Views.SEARCH);
	}

}