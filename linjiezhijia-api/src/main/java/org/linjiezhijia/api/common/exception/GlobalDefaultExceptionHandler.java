package org.linjiezhijia.api.common.exception;

import org.linjiezhijia.api.common.result.WebErrorResult;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    @ExceptionHandler(LinjiezhijiaException.class)
    @ResponseBody
    public WebErrorResult LinjiezhijiaExceptionHandler(LinjiezhijiaException exception) {
        WebErrorResult result = new WebErrorResult();
        return result;
    }

    /**
         * 处理 Exception 类型的异常
         * 方法名为任意名，入参一般使用 Exception 异常类，方法返回值可自定义。
         * @param e
         * @return
         */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public WebErrorResult defaultExceptionHandler(Exception e) {
        WebErrorResult result = new WebErrorResult();
        result.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value()+"");
        result.setMsg(e.getMessage());
        return result;
    }
}
