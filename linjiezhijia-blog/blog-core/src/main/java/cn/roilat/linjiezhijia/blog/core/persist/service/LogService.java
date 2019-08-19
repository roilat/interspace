/*
+--------------------------------------------------------------------------
|   blog [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2014, 2015 mtons. All Rights Reserved
|   http://www.mtons.com
|
+---------------------------------------------------------------------------
*/
package cn.roilat.linjiezhijia.blog.core.persist.service;

import java.util.Date;

/**
 * @author roilat-D
 *
 */
public interface LogService {
	void add(int logType, long userId, long targetId, String ip);
}
