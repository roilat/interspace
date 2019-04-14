package org.linjiezhijia.api.demo.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.linjiezhijia.api.Application;
import org.linjiezhijia.api.biz.demo.dao.mappers.ArticleMapper;
import org.linjiezhijia.api.biz.demo.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ArticleMapperTest {

    @Autowired
    private ArticleMapper mapper;

    @Test
    public void testInsert() {
        Article article = new Article();
        article.setTitle("测试标题2");
        article.setSummary("测试摘要2");
        article.setUserId(1L);
        article.setStatus(1);
        article.setCreateTime(new Date());
        article.setUpdateTime(new Date());
        article.setPublicTime(new Date());
        mapper.insertArticle(article);
    }

    @Test
    public void testMybatisQuery() {
        Article article = mapper.queryById(1L);
        assertNotNull(article);
    }

    @Test
    public void testUpdate() {
        Article article = mapper.queryById(1L);
        article.setPublicTime(new Date());
        article.setUpdateTime(new Date());
        article.setStatus(2);
        mapper.updateArticle(article);
    }

    @Test
    public void testQueryByPage() {
        Article article = new Article();
        article.setUserId(1L);
        List<Article> list = mapper.queryArticlesByPage(article, 10, 0);
        assertTrue(list.size() > 0);
    }
}
