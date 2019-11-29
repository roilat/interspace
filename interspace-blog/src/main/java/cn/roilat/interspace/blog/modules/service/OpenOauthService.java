package cn.roilat.interspace.blog.modules.service;

import cn.roilat.interspace.blog.modules.data.UserVO;
import cn.roilat.interspace.blog.modules.data.OpenOauthVO;

/**
 * @author roilat-J on 2015/8/12.
 */
public interface OpenOauthService {
	// 通过 oauth_token 查询 user
	UserVO getUserByOauthToken(String oauth_token);

	OpenOauthVO getOauthByToken(String oauth_token);

	OpenOauthVO getOauthByOauthUserId(String oauthUserId);

	OpenOauthVO getOauthByUid(long userId);

	boolean checkIsOriginalPassword(long userId);

	void saveOauthToken(OpenOauthVO oauth);

}
