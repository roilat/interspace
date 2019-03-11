package org.linjiezhijia.api.biz.blog.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.linjiezhijia.api.BaseTest;
import org.linjiezhijia.api.biz.blog.model.BlogArticle;
import org.linjiezhijia.api.common.result.CommonPageResult;
import org.linjiezhijia.api.common.result.CommonResult;

public class BlogArticleControllerTest extends BaseTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testPageList() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("title", "我是大哥测试标题");
        CommonPageResult<?> result = doGetPage("/api/blog/article/", map);
        logger.info(result.toString());
    }

    @Test
    public void testSave() throws Exception {
        BlogArticle blogArticle = new BlogArticle();
        blogArticle.setAttachments("");
        blogArticle.setCode("00001");
        blogArticle.setCover("http://www.baidu.com");
        blogArticle.setCreateDt(new Date());
        blogArticle.setCreator("admin");
        blogArticle.setIfComment("1");
        blogArticle.setIfPublish("1");
        blogArticle.setSource("own");
        blogArticle.setTitle("我是大哥测试标题");
        blogArticle.setUpdateDt(new Date());
        blogArticle.setUpdator("admin");
        CommonResult<?> result = doPost("/api/blog/article/", blogArticle);
        logger.info(result.toString());
        logger.debug("my logger debug info");
    }

    @Test
    public void testGetById() {
        CommonResult<?> result = doGet("/api/blog/article/74", null);
        logger.info(result.toString());
    }

    @Test
    public void testUpdate() {
        BlogArticle blogArticle = new BlogArticle();
        blogArticle.setAttachments("");
        blogArticle.setCode("00002");
        blogArticle.setCover("http://www.baidu.com");
        blogArticle.setCreateDt(new Date());
        blogArticle.setCreator("admin");
        blogArticle.setIfComment("1");
        blogArticle.setIfPublish("1");
        blogArticle.setSource("own");
        blogArticle.setTitle("我是大哥测试标题123");
        blogArticle.setUpdateDt(new Date());
        blogArticle.setUpdator("admin");
        CommonResult<?> result = doPut("/api/blog/article/75", blogArticle);
        logger.info(result.toString());
        logger.debug("my logger debug info");
    }

    @Test
    public void testDelete() {
        CommonResult<?> result = doDelete("/api/blog/article/75", null);
        logger.info(result.toString());
    }

}
