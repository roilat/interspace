package cn.roilat.interspace.blog.modules.template.directive;

import cn.roilat.interspace.blog.modules.data.PostVO;
import cn.roilat.interspace.blog.modules.service.PostService;
import cn.roilat.interspace.blog.modules.template.DirectiveHandler;
import cn.roilat.interspace.blog.modules.template.TemplateDirective;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

/**
 * 根据作者取文章列表
 *
 * @author roilat-J
 *
 */
@Component
public class UserContentsDirective extends TemplateDirective {
	@Autowired
	private PostService postService;

	@Override
	public String getName() {
		return "user_contents";
	}

	@Override
	public void execute(DirectiveHandler handler) throws Exception {
		long userId = handler.getInteger("userId", 0);
		Pageable pageable = wrapPageable(handler);

		Page<PostVO> result = postService.pagingByAuthorId(pageable, userId);
		handler.put(RESULTS, result).render();
	}

}
