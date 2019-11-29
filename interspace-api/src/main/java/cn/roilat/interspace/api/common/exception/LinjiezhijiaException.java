package cn.roilat.interspace.api.common.exception;

import cn.roilat.interspace.api.util.StringUtils;

/**
 * 系统异常
 * 
 * @author roilat-J
 * @version $Id: LinjiezhijiaException.java, v 0.1 2019年3月11日 下午6:16:56 roilat-J Exp $
 */
public class LinjiezhijiaException extends RuntimeException {

    /**  */
    private static final long          serialVersionUID = 2194384822886925259L;

    private LinjiezhijiaErrorCodeEnums exceptionCodeEnums;

    public LinjiezhijiaException(LinjiezhijiaErrorCodeEnums exceptionCodeEnums) {
        super(exceptionCodeEnums != null ? exceptionCodeEnums.getDesc() : "unknown error");
        this.exceptionCodeEnums = exceptionCodeEnums;
    }

    public LinjiezhijiaException(LinjiezhijiaErrorCodeEnums exceptionCodeEnums, String msg) {
        super(StringUtils.isNotEmpty(msg) ? msg
            : exceptionCodeEnums != null ? exceptionCodeEnums.getDesc() : "unknown error");
        this.exceptionCodeEnums = exceptionCodeEnums;
    }

    public LinjiezhijiaErrorCodeEnums getExceptionCodeEnums() {
        return exceptionCodeEnums;
    }

    public void setExceptionCodeEnums(LinjiezhijiaErrorCodeEnums exceptionCodeEnums) {
        this.exceptionCodeEnums = exceptionCodeEnums;
    }

}
