package org.linjiezhijia.api.biz.blog.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.linjiezhijia.api.BaseTest;
import org.linjiezhijia.api.biz.blog.model.BlogLink;
import org.linjiezhijia.api.common.result.CommonPageResult;
import org.linjiezhijia.api.common.result.CommonResult;

public class BlogLinkControllerTest extends BaseTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testPageList() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("title", "我是大哥测试标题");
        CommonPageResult<?> result = doGetPage("/api/blog/link/", map);
        logger.info(result.toString());
    }

    @Test
    public void testSave() throws Exception {
        BlogLink blogLink = new BlogLink();
        blogLink.setAddress("http://www.roilat.com");
        blogLink.setCreateDt(new Date());
        blogLink.setSource("test");
        blogLink.setCreator("admin");
        blogLink.setSource("own");
        blogLink.setUpdateDt(new Date());
        blogLink.setUpdator("admin");
        CommonResult<?> result = doPost("/api/blog/link/", blogLink);
        logger.info(result.toString());
    }

    @Test
    public void testGetById() {
        CommonResult<?> result = doGet("/api/blog/link/74", null);
        logger.info(result.toString());
    }

    @Test
    public void testUpdate() {
        BlogLink blogLink = new BlogLink();
        blogLink.setAddress("http://www.roilat.com");
        blogLink.setCreateDt(new Date());
        blogLink.setSource("test");
        blogLink.setCreator("admin");
        blogLink.setSource("own");
        blogLink.setUpdateDt(new Date());
        blogLink.setUpdator("admin");
        CommonResult<?> result = doPut("/api/blog/link/75", blogLink);
        logger.info(result.toString());
    }

    @Test
    public void testDelete() {
        CommonResult<?> result = doDelete("/api/blog/link/75", null);
        logger.info(result.toString());
    }

}
