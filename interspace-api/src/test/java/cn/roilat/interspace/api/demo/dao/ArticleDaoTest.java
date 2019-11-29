package cn.roilat.interspace.api.demo.dao;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import cn.roilat.interspace.api.Application;
import cn.roilat.interspace.api.biz.demo.dao.jdbc.ArticleDAO;
import cn.roilat.interspace.api.biz.demo.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ArticleDaoTest {

    @Autowired
    private ArticleDAO articleDAO;

    @Test
    public void testInsert() {
        Article article = new Article();
        article.setTitle("测试标题");
        article.setSummary("测试摘要");
        article.setUserId(1L);
        article.setStatus(1);
        article.setType(2);
        article.setCreateTime(new Date());
        article.setUpdateTime(new Date());
        article.setPublicTime(new Date());
        articleDAO.insertArticle(article);
    }
}
