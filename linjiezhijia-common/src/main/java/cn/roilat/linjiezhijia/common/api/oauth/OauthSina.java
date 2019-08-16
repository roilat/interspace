package cn.roilat.linjiezhijia.common.api.oauth;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import cn.roilat.linjiezhijia.common.api.oauth.util.EnumOauthTypeBean;
import cn.roilat.linjiezhijia.common.api.oauth.util.OathConfig;
import cn.roilat.linjiezhijia.common.api.oauth.util.OpenOauthBean;
import cn.roilat.linjiezhijia.common.api.oauth.util.TokenUtil;

public class OauthSina extends Oauth {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	private static final String AUTH_URL = "https://api.weibo.com/oauth2/authorize";
	private static final String TOKEN_URL = "https://api.weibo.com/oauth2/access_token";
	private static final String TOKEN_INFO_URL = "https://api.weibo.com/oauth2/get_token_info";
	private static final String USER_INFO_URL = "https://api.weibo.com/2/users/show.json";

	public static OauthSina me() {
		return new OauthSina();
	}

	public OauthSina() {
		setClientId(OathConfig.getValue("openid_sina"));
		setClientSecret(OathConfig.getValue("openkey_sina"));
		setRedirectUri(OathConfig.getValue("redirect_sina"));
	}

	public String getAuthorizeUrl(String state) throws UnsupportedEncodingException {
		Map<String, String> params = new HashMap<String, String>();
		params.put("response_type", "code");
		params.put("client_id", getClientId());
		params.put("redirect_uri", getRedirectUri());
		if (StringUtils.isNotBlank(state)) {
			params.put("state", state);
		}
		return super.getAuthorizeUrl(AUTH_URL, params);
	}

	public String getTokenByCode(String code)
			throws IOException, KeyManagementException, NoSuchAlgorithmException, NoSuchProviderException {
		Map<String, String> params = new HashMap<String, String>();
		params.put("code", code);
		params.put("client_id", getClientId());
		params.put("client_secret", getClientSecret());
		params.put("grant_type", "authorization_code");
		params.put("redirect_uri", getRedirectUri());
		String token = TokenUtil.getAccessToken(super.doPost(TOKEN_URL, params));
		logger.debug(token);
		return token;
	}

	public String getTokenInfo(String accessToken)
			throws IOException, KeyManagementException, NoSuchAlgorithmException, NoSuchProviderException {
		Map<String, String> params = new HashMap<String, String>();
		params.put("access_token", accessToken);
		String openid = TokenUtil.getUid(super.doPost(TOKEN_INFO_URL, params));
		logger.debug(openid);
		return openid;
	}

	public String getUserInfo(String accessToken, String uid)
			throws IOException, KeyManagementException, NoSuchAlgorithmException, NoSuchProviderException {
		Map<String, String> params = new HashMap<String, String>();
		params.put("uid", uid);
		params.put("access_token", accessToken);
		String userInfo = super.doGet(USER_INFO_URL, params);
		logger.debug(userInfo);
		return userInfo;
	}

	public JSONObject getUserInfoByCode(String code)
			throws IOException, KeyManagementException, NoSuchAlgorithmException, NoSuchProviderException {
		String accessToken = getTokenByCode(code);
		if (StringUtils.isBlank(accessToken)) {
			return null;
		}
		String uid = getTokenInfo(accessToken);
		if (StringUtils.isBlank(uid)) {
			return null;
		}
		JSONObject dataMap = JSON.parseObject(getUserInfo(accessToken, uid));
		dataMap.put("access_token", accessToken);
		logger.debug("", dataMap);
		return dataMap;
	}

	public OpenOauthBean getUserBeanByCode(String code)
			throws KeyManagementException, NoSuchAlgorithmException, NoSuchProviderException, IOException {
		OpenOauthBean openOauthBean = null;
		JSONObject userInfo = me().getUserInfoByCode(code);

		openOauthBean = new OpenOauthBean();
		String openid = userInfo.getString("id");
		String accessToken = userInfo.getString("access_token");
		String nickname = userInfo.getString("screen_name");
		String photoUrl = userInfo.getString("profile_image_url");

		openOauthBean.setOauthCode(code);
		openOauthBean.setAccessToken(accessToken);
		openOauthBean.setExpireIn("");
		openOauthBean.setOauthUserId(openid);
		openOauthBean.setOauthType(EnumOauthTypeBean.TYPE_SINA.getValue());
		openOauthBean.setUsername("SN" + openid.getBytes().hashCode());
		openOauthBean.setNickname(nickname);
		openOauthBean.setAvatar(photoUrl);

		return openOauthBean;
	}
}
