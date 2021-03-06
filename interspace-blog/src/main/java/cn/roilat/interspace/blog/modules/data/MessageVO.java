package cn.roilat.interspace.blog.modules.data;

import cn.roilat.interspace.blog.modules.entity.Message;

/**
 * @author roilat-J on 2015/8/31.
 */
public class MessageVO extends Message {
	// extend
	private UserVO from;
	private PostVO post;

	public UserVO getFrom() {
		return from;
	}

	public void setFrom(UserVO from) {
		this.from = from;
	}

	public PostVO getPost() {
		return post;
	}

	public void setPost(PostVO post) {
		this.post = post;
	}
}
