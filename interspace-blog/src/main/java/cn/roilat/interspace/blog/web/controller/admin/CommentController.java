package cn.roilat.interspace.blog.web.controller.admin;

import java.util.List;

import cn.roilat.interspace.blog.base.lang.Result;
import cn.roilat.interspace.blog.web.controller.BaseController;
import cn.roilat.interspace.blog.modules.data.CommentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.roilat.interspace.blog.modules.service.CommentService;

/**
 * @author roilat-J
 *
 */
@Controller("adminCommentController")
@RequestMapping("/admin/comment")
public class CommentController extends BaseController {
	@Autowired
	private CommentService commentService;

	@RequestMapping("/list")
	public String list(ModelMap model) {
		Pageable pageable = wrapPageable();
		Page<CommentVO> page = commentService.paging4Admin(pageable);
		model.put("page", page);
		return "/admin/comment/list";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public Result<?> delete(@RequestParam("id") List<Long> id) {
		Result<?> data = Result.failure("操作失败");
		if (id != null) {
			try {
				commentService.delete(id);
				data = Result.success();
			} catch (Exception e) {
				data = Result.failure(e.getMessage());
			}
		}
		return data;
	}
}
