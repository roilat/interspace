package cn.roilat.interspace.api.biz.blog.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import cn.roilat.interspace.api.BaseTest;
import cn.roilat.interspace.api.biz.blog.model.BlogAttachment;
import cn.roilat.interspace.api.common.result.CommonPageResult;
import cn.roilat.interspace.api.common.result.CommonResult;

public class BlogAttachmentControllerTest extends BaseTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testPageList() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "myHead");
        CommonPageResult<?> result = doGetPage("/api/blog/attachment/", map);
        logger.info(result.toString());
    }

    @Test
    public void testSave() throws Exception {
        BlogAttachment blogAttachment = new BlogAttachment();
        blogAttachment.setBlogId(75);
        blogAttachment.setName("myHead.jpg");
        blogAttachment.setSavePath("/blog/75/myHead.jpg");
        blogAttachment.setCreateDt(new Date());
        blogAttachment.setCreator("admin");
        blogAttachment.setUpdateDt(new Date());
        blogAttachment.setUpdator("admin");
        CommonResult<?> result = doPost("/api/blog/attachment/", blogAttachment);
        logger.info(result.toString());
    }

    @Test
    public void testGetById() {
        CommonResult<?> result = doGet("/api/blog/attachment/75", null);
        logger.info(result.toString());
    }

    @Test
    public void testUpdate() {
        BlogAttachment blogAttachment = new BlogAttachment();
        blogAttachment.setBlogId(75);
        blogAttachment.setName("myHead.jpg");
        blogAttachment.setSavePath("/blog/75/myHead.jpg");
        blogAttachment.setCreateDt(new Date());
        blogAttachment.setCreator("admin");
        blogAttachment.setUpdateDt(new Date());
        blogAttachment.setUpdator("admin");
        CommonResult<?> result = doPut("/api/blog/attachment/75", blogAttachment);
        logger.info(result.toString());
    }

    @Test
    public void testDelete() {
        CommonResult<?> result = doDelete("/api/blog/attachment/75", null);
        logger.info(result.toString());
    }

}
