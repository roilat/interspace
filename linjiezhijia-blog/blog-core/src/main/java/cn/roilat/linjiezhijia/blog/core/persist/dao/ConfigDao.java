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

import cn.roilat.linjiezhijia.blog.core.persist.entity.ConfigPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author roilat-D
 *
 */
public interface ConfigDao extends JpaRepository<ConfigPO, Long>, JpaSpecificationExecutor<ConfigPO> {
	ConfigPO findByKey(String key);
}
