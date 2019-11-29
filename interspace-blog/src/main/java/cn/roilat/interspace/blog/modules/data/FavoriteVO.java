package cn.roilat.interspace.blog.modules.data;

import cn.roilat.interspace.blog.modules.entity.Favorite;

/**
 * @author roilat-J on 2015/8/31.
 */
public class FavoriteVO extends Favorite {
	// extend
	private PostVO post;

	public PostVO getPost() {
		return post;
	}

	public void setPost(PostVO post) {
		this.post = post;
	}
}
