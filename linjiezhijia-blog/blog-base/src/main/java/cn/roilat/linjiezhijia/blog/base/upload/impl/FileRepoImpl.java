/*
+--------------------------------------------------------------------------
|   blog [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2014, 2015 mtons. All Rights Reserved
|   http://www.mtons.com
|
+---------------------------------------------------------------------------
*/
package cn.roilat.linjiezhijia.blog.base.upload.impl;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

/**
 * @author roilat-D
 *
 */
@Service("fileRepo")
public class FileRepoImpl extends AbstractFileRepo {
	private static String KEY = "absolute";

	@PostConstruct
	public void init() {
		fileRepoFactory.addRepo(KEY, this);
	}

	@Override
	public String getRoot() {
		return appContext.getRoot();
	}

}
