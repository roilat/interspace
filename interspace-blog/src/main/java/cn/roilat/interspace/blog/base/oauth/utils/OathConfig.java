package cn.roilat.interspace.blog.base.oauth.utils;

import cn.roilat.interspace.blog.base.oauth.APIConfig;


public class OathConfig {
    public static String getValue(String key) {
        return APIConfig.getInstance().getValue(key);
    }
}
