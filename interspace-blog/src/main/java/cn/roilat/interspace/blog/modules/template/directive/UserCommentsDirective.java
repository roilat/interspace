package cn.roilat.interspace.blog.modules.template.directive;

import cn.roilat.interspace.blog.modules.data.CommentVO;
import cn.roilat.interspace.blog.modules.service.CommentService;
import cn.roilat.interspace.blog.modules.template.DirectiveHandler;
import cn.roilat.interspace.blog.modules.template.TemplateDirective;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

/**
 * 根据作者取评论列表
 *
 * @author roilat-J
 * @since 3.0
 */
@Component
public class UserCommentsDirective extends TemplateDirective {
	@Autowired
	private CommentService commentService;

	@Override
	public String getName() {
		return "user_comments";
	}

	@Override
	public void execute(DirectiveHandler handler) throws Exception {
		long userId = handler.getInteger("userId", 0);
		Pageable pageable = wrapPageable(handler);

		Page<CommentVO> result = commentService.pagingByAuthorId(pageable, userId);
		handler.put(RESULTS, result).render();
	}

}
