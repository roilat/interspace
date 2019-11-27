package org.linjiezhijia.blog.modules.service.impl;

import org.linjiezhijia.blog.modules.data.OpenOauthVO;
import org.linjiezhijia.blog.modules.data.UserVO;
import org.linjiezhijia.blog.modules.entity.UserOauth;
import org.linjiezhijia.blog.modules.entity.User;
import org.linjiezhijia.blog.modules.repository.UserRepository;
import org.linjiezhijia.blog.modules.service.OpenOauthService;
import org.linjiezhijia.blog.base.utils.BeanMapUtils;
import org.linjiezhijia.blog.base.utils.MD5;
import org.linjiezhijia.blog.modules.repository.UserOauthRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * 第三方登录授权管理
 * 
 * @author roilat-J on 2015/8/12.
 */
@Service
@Transactional
public class OpenOauthServiceImpl implements OpenOauthService {
	@Autowired
	private UserOauthRepository userOauthRepository;
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserVO getUserByOauthToken(String oauth_token) {
		UserOauth thirdToken = userOauthRepository.findByAccessToken(oauth_token);
		Optional<User> po = userRepository.findById(thirdToken.getId());
		return BeanMapUtils.copy(po.get());
	}

	@Override
	public OpenOauthVO getOauthByToken(String oauth_token) {
		UserOauth po = userOauthRepository.findByAccessToken(oauth_token);
		OpenOauthVO vo = null;
		if (po != null) {
			vo = new OpenOauthVO();
			BeanUtils.copyProperties(po, vo);
		}
		return vo;
	}

	@Override
	public OpenOauthVO getOauthByUid(long userId) {
		UserOauth po = userOauthRepository.findByUserId(userId);
		OpenOauthVO vo = null;
		if (po != null) {
			vo = new OpenOauthVO();
			BeanUtils.copyProperties(po, vo);
		}
		return vo;
	}

	@Override
	public boolean checkIsOriginalPassword(long userId) {
		UserOauth po = userOauthRepository.findByUserId(userId);
		if (po != null) {
			Optional<User> optional = userRepository.findById(userId);

			String pwd = MD5.md5(po.getAccessToken());
			// 判断用户密码 和 登录状态
			if (optional.isPresent() && pwd.equals(optional.get().getPassword())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void saveOauthToken(OpenOauthVO oauth) {
		UserOauth po = new UserOauth();
		BeanUtils.copyProperties(oauth, po);
		userOauthRepository.save(po);
	}

	@Override
	public OpenOauthVO getOauthByOauthUserId(String oauthUserId) {
		UserOauth po = userOauthRepository.findByOauthUserId(oauthUserId);
		OpenOauthVO vo = null;
		if (po != null) {
			vo = new OpenOauthVO();
			BeanUtils.copyProperties(po, vo);
		}
		return vo;
	}

}
