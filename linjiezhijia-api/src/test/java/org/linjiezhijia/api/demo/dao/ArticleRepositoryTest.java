package org.linjiezhijia.api.demo.dao;

import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.linjiezhijia.api.Application;
import org.linjiezhijia.api.biz.demo.dao.ArticleRepository;
import org.linjiezhijia.api.biz.demo.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ArticleRepositoryTest {

    @Autowired
    private ArticleRepository articleRepository;

    @Test
    public void testFindByUserId() {
        List<Article> articleList = articleRepository.findByUserId(1L);
        System.out.println(articleList);
        assertTrue(articleList.size() > 0);
    }

    @Test
    public void testQueryByTitle() {
        List<Article> articleList = articleRepository.queryByTitle("测试标题");
        System.out.println(articleList);
        assertTrue(articleList.size() > 0);
    }
    
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
        articleRepository.save(article);
        System.out.println(article);
    }
}
