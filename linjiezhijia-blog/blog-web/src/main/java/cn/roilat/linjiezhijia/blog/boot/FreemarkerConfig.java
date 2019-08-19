package cn.roilat.linjiezhijia.blog.boot;

import freemarker.template.Configuration;
import freemarker.template.TemplateModelException;
import cn.roilat.linjiezhijia.blog.shiro.tags.ShiroTags;
import cn.roilat.linjiezhijia.blog.template.directive.*;
import cn.roilat.linjiezhijia.blog.template.method.TimeAgoMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by roilat-D on 2017/11/14.
 */
@Component
public class FreemarkerConfig {
    @Autowired
    private Configuration configuration;
    @Autowired
    private ApplicationContext applicationContext;

    @PostConstruct
    public void setSharedVariable() throws TemplateModelException {
        configuration.setSharedVariable("author_contents", applicationContext.getBean(AuthorContentsDirective.class));
        configuration.setSharedVariable("channel", applicationContext.getBean(ChannelDirective.class));
        configuration.setSharedVariable("contents", applicationContext.getBean(ContentsDirective.class));
        configuration.setSharedVariable("num", applicationContext.getBean(NumberDirective.class));
        configuration.setSharedVariable("resource", applicationContext.getBean(ResourceDirective.class));
        configuration.setSharedVariable("authc", applicationContext.getBean(AuthcDirective.class));
        configuration.setSharedVariable("banner", applicationContext.getBean(BannerDirective.class));

        configuration.setSharedVariable("timeAgo", new TimeAgoMethod());
        configuration.setSharedVariable("shiro", new ShiroTags());
    }
}
