package cn.roilat.linjiezhijia.blog.core.persist.dao.custom;

import cn.roilat.linjiezhijia.blog.core.data.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by roilat-D on 2017/9/30.
 */
public interface PostDaoCustom {
    Page<Post> search(Pageable pageable, String q) throws Exception;
    Page<Post> searchByTag(Pageable pageable, String tag);
    void resetIndexs();
}
