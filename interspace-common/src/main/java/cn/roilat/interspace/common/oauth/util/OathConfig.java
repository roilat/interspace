package cn.roilat.interspace.common.oauth.util;

import cn.roilat.interspace.common.oauth.APIConfig;

public class OathConfig {
	public static String getValue(String key) {
		return APIConfig.getInstance().getValue(key);
	}
}
