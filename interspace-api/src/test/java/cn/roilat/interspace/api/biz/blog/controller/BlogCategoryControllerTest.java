package cn.roilat.interspace.api.biz.blog.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import cn.roilat.interspace.api.BaseTest;
import cn.roilat.interspace.api.biz.blog.model.BlogCategory;
import cn.roilat.interspace.api.common.result.CommonPageResult;
import cn.roilat.interspace.api.common.result.CommonResult;

public class BlogCategoryControllerTest extends BaseTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testPageList() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("description", "技术");
        CommonPageResult<?> result = doGetPage("/api/blog/category/", map);
        logger.info(result.toString());
    }

    @Test
    public void testSave() throws Exception {
        BlogCategory blogCategory = new BlogCategory();
        blogCategory.setCode("TECH");
        blogCategory.setCounts(10);
        blogCategory.setDescription("技术类");
        blogCategory.setCreateDt(new Date());
        blogCategory.setCreator("admin");
        blogCategory.setUpdateDt(new Date());
        blogCategory.setUpdator("admin");
        CommonResult<?> result = doPost("/api/blog/category/", blogCategory);
        logger.info(result.toString());
    }

    @Test
    public void testGetById() {
        CommonResult<?> result = doGet("/api/blog/category/74", null);
        logger.info(result.toString());
    }

    @Test
    public void testUpdate() {
        BlogCategory blogCategory = new BlogCategory();
        blogCategory.setCode("TECH");
        blogCategory.setCreateDt(new Date());
        blogCategory.setCreator("admin");
        blogCategory.setUpdateDt(new Date());
        blogCategory.setUpdator("admin");
        CommonResult<?> result = doPut("/api/blog/category/75", blogCategory);
        logger.info(result.toString());
    }

    @Test
    public void testDelete() {
        CommonResult<?> result = doDelete("/api/blog/category/75", null);
        logger.info(result.toString());
    }

}
