package org.linjiezhijia.api.util;

import org.linjiezhijia.api.common.result.CommonResult;

public class RestApiUtils {
    public static CommonResult<?> build404Response(){
        return new CommonResult<>("", false, null);
    }
}
