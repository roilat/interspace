/**
 *
 */
package cn.roilat.linjiezhijia.blog.template.directive;

import cn.roilat.linjiezhijia.blog.core.data.Post;
import cn.roilat.linjiezhijia.blog.core.persist.service.PostService;
import cn.roilat.linjiezhijia.blog.template.DirectiveHandler;
import cn.roilat.linjiezhijia.blog.template.TemplateDirective;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 推荐内容查询
 *
 * @author roilat-D
 *
 */
@Component
public class BannerDirective extends TemplateDirective {
	@Autowired
    private PostService postService;

    @Override
    public String getName() {
        return "banner";
    }

    @Override
    public void execute(DirectiveHandler handler) throws Exception {
        List<Post> result = postService.findAllFeatured();
        handler.put(RESULTS, result).render();
    }
}
