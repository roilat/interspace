/*
+--------------------------------------------------------------------------
|   blog [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2014, 2015 mtons. All Rights Reserved
|   http://www.mtons.com
|
+---------------------------------------------------------------------------
*/
package cn.roilat.linjiezhijia.blog.core.persist.dao.impl;

import cn.roilat.linjiezhijia.blog.core.data.Feeds;
import cn.roilat.linjiezhijia.blog.core.persist.dao.custom.FeedsDaoCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.text.MessageFormat;

/**
 * @author roilat-D
 *
 */
public class FeedsDaoImpl implements FeedsDaoCustom {
	@Autowired
	@PersistenceContext
	private EntityManager entityManager;

	String pattern = "INSERT INTO mto_feeds (own_id, type, post_id, author_id, created) SELECT user_id, {0}, {1,number,###}, {2,number,###}, now() FROM mto_follows WHERE follow_id = {3,number,###}";

	@Override
	@Transactional
	public int batchAdd(Feeds feeds) {
		String sql = MessageFormat.format(pattern, feeds.getType(), feeds.getPostId(), feeds.getAuthorId(), feeds.getAuthorId());
		return entityManager.createNativeQuery(sql).executeUpdate();
	}

}
