package org.linjiezhijia.api.common.exception;

public enum LinjiezhijiaErrorCodeEnums {
    ID_NOT_EXISTS("id_not_exist","请求的主键信息不存在！"),
    PARAM_FORMAT_ERROR("param_format_error","请求参数格式错误！");
    private String code;
    private String desc;
    public String getCode() {
        return code;
    }
    public String getDesc() {
        return desc;
    }
    private LinjiezhijiaErrorCodeEnums(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    
}
