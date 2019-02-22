package org.linjiezhijia.api.demo.dao;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.linjiezhijia.api.Application;
import org.linjiezhijia.api.demo.model.Article;
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

}
