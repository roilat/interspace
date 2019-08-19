package cn.roilat.linjiezhijia.blog.template.directive;

import cn.roilat.linjiezhijia.blog.core.data.AuthMenu;
import cn.roilat.linjiezhijia.blog.core.persist.service.AuthMenuService;
import cn.roilat.linjiezhijia.blog.template.DirectiveHandler;
import cn.roilat.linjiezhijia.blog.template.TemplateDirective;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by roilat-D on 2017/11/21.
 */
@Component
public class AuthcDirective extends TemplateDirective {
    @Autowired
    private AuthMenuService authMenuService;

    @Override
    public String getName() {
        return "authc";
    }

    @Override
    public void execute(DirectiveHandler handler) throws Exception {
        long pid = handler.getInteger("pid", 0);

        List<AuthMenu> list = authMenuService.findByParentId(pid);
        handler.put(RESULTS, list).render();
    }

}
