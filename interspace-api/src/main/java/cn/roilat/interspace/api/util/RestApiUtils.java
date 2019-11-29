package cn.roilat.interspace.api.util;

import cn.roilat.interspace.api.common.result.CommonResult;

public class RestApiUtils {
    public static CommonResult<?> build404Response(){
        return new CommonResult<>("", false, null);
    }
}
