/**
 *
 */
package cn.roilat.linjiezhijia.blog.template.directive;

import cn.roilat.linjiezhijia.blog.core.data.Post;
import cn.roilat.linjiezhijia.blog.core.persist.service.PostService;
import cn.roilat.linjiezhijia.blog.template.DirectiveHandler;
import cn.roilat.linjiezhijia.blog.template.TemplateDirective;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

/**
 * 根据作者取文章列表
 *
 * @author roilat-D
 *
 */
@Component
public class AuthorContentsDirective extends TemplateDirective {
    @Autowired
	private PostService postService;

	@Override
	public String getName() {
		return "author_contents";
	}

    @Override
    public void execute(DirectiveHandler handler) throws Exception {
        int pn = handler.getInteger("pn", 1);
        long uid = handler.getInteger("uid", 0);

        Pageable pageable = new PageRequest(pn - 1, 10);
        Page<Post> result = postService.pagingByAuthorId(pageable, uid);

        handler.put(RESULTS, result).render();
    }

}
