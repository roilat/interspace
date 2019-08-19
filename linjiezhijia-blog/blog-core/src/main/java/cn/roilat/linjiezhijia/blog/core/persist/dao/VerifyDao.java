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

import cn.roilat.linjiezhijia.blog.core.persist.entity.VerifyPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author roilat-D on 2015/8/14.
 */
public interface VerifyDao extends JpaRepository<VerifyPO, Long>, JpaSpecificationExecutor<VerifyPO> {
    VerifyPO findByUserIdAndType(long userId, int type);
    VerifyPO findByUserId(long userId);
}
