package org.linjiezhijia.blog.modules.data;

import com.alibaba.fastjson.annotation.JSONField;
import org.linjiezhijia.blog.modules.entity.Comment;

import java.io.Serializable;
import java.util.Date;

/**
 * @author roilat-J
 */
public class CommentVO extends Comment implements Serializable {
	private static final long serialVersionUID = 9192186139010913437L;

	@JSONField(format = "yyyy-MM-dd")
	private Date created;

	// extend parameter
	private UserVO author;
	private CommentVO parent;
	private PostVO post;

	public Date getCreated() {
		return super.getCreated();
	}

	public UserVO getAuthor() {
		return author;
	}

	public void setAuthor(UserVO author) {
		this.author = author;
	}

	public CommentVO getParent() {
		return parent;
	}

	public void setParent(CommentVO parent) {
		this.parent = parent;
	}

	public PostVO getPost() {
		return post;
	}

	public void setPost(PostVO post) {
		this.post = post;
	}
}
