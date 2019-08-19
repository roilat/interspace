package cn.roilat.linjiezhijia.blog.core.data;

import cn.roilat.linjiezhijia.blog.core.persist.entity.NotifyPO;

/**
 * @author roilat-D on 2015/8/31.
 */
public class Notify extends NotifyPO {
    // extend
    private User from;
    private Post post;

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
