package org.linjiezhijia.blog.base.oauth.utils;

import org.linjiezhijia.blog.base.oauth.APIConfig;


public class OathConfig {
    public static String getValue(String key) {
        return APIConfig.getInstance().getValue(key);
    }
}
