package org.linjiezhijia.api.common.result;

import org.linjiezhijia.api.common.exception.LinjiezhijiaErrorCodeEnums;

public class WebErrorResult extends BaseResult {

    /**  */
    private static final long serialVersionUID = 1L;

    
    public WebErrorResult() {
        this.success = false;
    }

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "WebErrorResult [code=" + code + ", msg=" + msg + ", success=" + success + "]";
    }
    
}
