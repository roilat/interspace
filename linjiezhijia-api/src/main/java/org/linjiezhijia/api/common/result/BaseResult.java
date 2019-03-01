package org.linjiezhijia.api.common.result;

import java.io.Serializable;

public class BaseResult implements Serializable {
    /**  */
    private static final long serialVersionUID = -8108913939000376272L;
    private String            msg;
    private Boolean           success;

    public BaseResult() {
    }

    public BaseResult(String msg, Boolean success) {
        this.msg = msg;
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "BaseResult [msg=" + msg + ", success=" + success + "]";
    }

    public void buildResult(boolean success) {
        this.setMsg(success ? "操作成功" : "操作失败");
        this.setSuccess(success);
    }
}