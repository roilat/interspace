package cn.roilat.interspace.common.oauth;

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

import cn.roilat.interspace.common.oauth.util.OathConfig;
import cn.roilat.interspace.common.oauth.util.TokenUtil;

public class OauthOsc extends Oauth {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	private static final String AUTH_URL = "http://www.oschina.net/action/oauth2/authorize";
	private static final String TOKEN_URL = "http://www.oschina.net/action/openapi/token";
	private static final String USER_INFO_URL = "http://www.oschina.net/action/openapi/user";
	private static final String TWEET_PUB = "http://www.oschina.net/action/openapi/tweet_pub";

	public static OauthOsc me() {
		return new OauthOsc();
	}

	public OauthOsc() {
		setClientId(OathConfig.getValue("openid_osc"));
		setClientSecret(OathConfig.getValue("openkey_osc"));
		setRedirectUri(OathConfig.getValue("redirect_osc"));
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
		String token = TokenUtil.getAccessToken(super.doGet(TOKEN_URL, params));
		logger.debug(token);
		return token;
	}

	public JSONObject getUserInfo(String accessToken)
			throws IOException, KeyManagementException, NoSuchAlgorithmException, NoSuchProviderException {
		Map<String, String> params = new HashMap<String, String>();
		params.put("access_token", accessToken);
		String userInfo = super.doGet(USER_INFO_URL, params);
		JSONObject dataMap = JSON.parseObject(userInfo);
		logger.debug(dataMap.toJSONString());
		return dataMap;
	}

	public JSONObject tweetPub(String accessToken, String msg) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("access_token", accessToken);
		params.put("msg", msg);
		try {
			JSONObject dataMap = JSON.parseObject(super.doPost(TWEET_PUB, params));

			logger.debug("", dataMap);
		} catch (KeyManagementException e) {
			logger.error(e.getMessage(), e);
		} catch (NoSuchAlgorithmException e) {
			logger.error(e.getMessage(), e);
		} catch (NoSuchProviderException e) {
			logger.error(e.getMessage(), e);
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}

	public JSONObject getUserInfoByCode(String code)
			throws IOException, KeyManagementException, NoSuchAlgorithmException, NoSuchProviderException {
		String accessToken = getTokenByCode(code);
		if (StringUtils.isBlank(accessToken)) {
			return null;
		}
		JSONObject dataMap = getUserInfo(accessToken);
		dataMap.put("access_token", accessToken);
		logger.debug("", dataMap);
		return dataMap;
	}
}
