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

import com.alibaba.fastjson.annotation.JSONField;
import cn.roilat.linjiezhijia.blog.base.lang.Consts;
import cn.roilat.linjiezhijia.blog.core.persist.entity.PostAttribute;
import cn.roilat.linjiezhijia.blog.core.persist.entity.PostPO;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.List;

/**
 * @author roilat-D
 * 
 */
public class Post extends PostPO implements Serializable {
	private static final long serialVersionUID = -1144627551517707139L;

	private String content;

	private User author;
	private Channel channel;
	
	@JSONField(serialize = false)
	private PostAttribute attribute;
	
	public String[] getTagsArray() {
		if (StringUtils.isNotBlank(super.getTags())) {
			return super.getTags().split(Consts.SEPARATOR);
		}
		return null;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public PostAttribute getAttribute() {
		return attribute;
	}

	public void setAttribute(PostAttribute attribute) {
		this.attribute = attribute;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}
}
