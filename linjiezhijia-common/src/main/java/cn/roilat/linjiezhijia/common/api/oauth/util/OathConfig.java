package cn.roilat.linjiezhijia.common.api.oauth.util;

import cn.roilat.linjiezhijia.common.api.oauth.APIConfig;

public class OathConfig {
	public static String getValue(String key) {
		return APIConfig.getInstance().getValue(key);
	}
}
