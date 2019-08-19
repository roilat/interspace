/*
+--------------------------------------------------------------------------
|   blog [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2014, 2015 mtons. All Rights Reserved
|   http://www.mtons.com
|
+---------------------------------------------------------------------------
*/
package cn.roilat.linjiezhijia.blog.core.data;

import cn.roilat.linjiezhijia.blog.core.persist.entity.FeedsPO;

/**
 * 订阅
 * @author roilat-D
 *
 */
public class Feeds extends FeedsPO {
	private Post post;

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

}
