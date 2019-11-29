package cn.roilat.interspace.blog.modules.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import cn.roilat.interspace.blog.BootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * post service test
 *
 * @author roilat-J 2019/4/5 17:32
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootApplication.class)
public class PostServiceImplTest {

    @Autowired
    PostServiceImpl postService;

    @Test
    public void cleanPostPic() {
    }
}