/*
+--------------------------------------------------------------------------
|   blog [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2014, 2015 mtons. All Rights Reserved
|   http://www.mtons.com
|
+---------------------------------------------------------------------------
*/
package cn.roilat.linjiezhijia.blog.core.persist.dao;

import cn.roilat.linjiezhijia.blog.core.persist.entity.ChannelPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Collection;
import java.util.List;

/**
 * @author roilat-D
 *
 */
public interface ChannelDao extends JpaRepository<ChannelPO, Integer>, JpaSpecificationExecutor<ChannelPO> {
	List<ChannelPO> findAllByStatus(int status);
	List<ChannelPO> findAllByIdIn(Collection<Integer> id);
	ChannelPO findByKey(String key);
}
