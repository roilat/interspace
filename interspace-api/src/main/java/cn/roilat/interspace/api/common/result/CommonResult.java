package cn.roilat.interspace.api.common.result;

public class CommonResult<T> extends BaseResult {
    
    /**  */
    private static final long serialVersionUID = -3803768200600232932L;

    public CommonResult() {};
    public CommonResult(String msg, Boolean success,T data) {
        super(msg, success);
        this.data = data;
    }

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "CommonResult [data=" + data + ", msg=" + msg + ", success=" + success + "]";
    }
}
