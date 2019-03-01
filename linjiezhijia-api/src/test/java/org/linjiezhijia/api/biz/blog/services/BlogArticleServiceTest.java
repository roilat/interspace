package org.linjiezhijia.api.biz.blog.services;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.linjiezhijia.api.Application;
import org.linjiezhijia.api.biz.blog.model.BlogArticle;
import org.linjiezhijia.api.biz.blog.po.BlogArticlePO;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class BlogArticleServiceTest {
    @Resource
    BlogArticleService blogArticleService;

    @Test
    public void pageList() {
        BlogArticlePO blogArticlePO = new BlogArticlePO();
        System.out.println(blogArticleService.pageList(blogArticlePO));
    }

    @Test
    public void save() {
        BlogArticle blogArticle = new BlogArticle();
        blogArticle.setAttachments("");
        blogArticle.setCode("00001");
        blogArticle.setCover("http://www.baidu.com");
        blogArticle.setCreateDt(new Date());
        blogArticle.setCreator("admin");
        blogArticle.setIfComment("1");
        blogArticle.setIfPublish("1");
        blogArticle.setSource("own");
        blogArticle.setState("1");
        blogArticle.setTitle("测试标题");
        blogArticle.setUpdateDt(new Date());
        blogArticle.setUpdator("admin");
        System.out.println(blogArticleService.save(blogArticle));
    }
}
