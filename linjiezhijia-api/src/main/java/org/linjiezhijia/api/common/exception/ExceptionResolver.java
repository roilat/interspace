package org.linjiezhijia.api.common.exception;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.linjiezhijia.api.common.result.WebErrorResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;

/**
 * 先到这里，然后才重定向到errorController的
 * 
 * @author roilat-J
 * @version $Id: ExceptionResolver.java, v 0.1 2019年3月15日 下午6:05:03 roilat-J Exp $
 */
@Configuration
public class ExceptionResolver implements HandlerExceptionResolver {
    Logger logger = LoggerFactory.getLogger("system.exception.resolver");
    @Value("${server.error.path}")
    private String errorView;
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response,
                                         Object handler, Exception ex) {

        logger.error("system.exceptionResolver", handler, ex);
        WebErrorResult errorResult = null;
        if (ex instanceof LinjiezhijiaException) {
            LinjiezhijiaException exception = (LinjiezhijiaException) ex;
            LinjiezhijiaErrorCodeEnums errorCodeEnums = exception.getExceptionCodeEnums();
            errorResult = build(errorCodeEnums);
            response.setStatus(Integer.parseInt(errorResult.getCode()));
        }

        if (errorResult == null) {
            errorResult = new WebErrorResult();
            errorResult.setCode(response.getStatus() + "");
            errorResult.setMsg("系统内部未知异常");
        }

        request.setAttribute("resultMsg", errorResult);

        return new ModelAndView(errorView);
    }

    public WebErrorResult build(LinjiezhijiaErrorCodeEnums errorCodeEnums) {
        if (errorCodeEnums != null) {
            WebErrorResult result = new WebErrorResult();
            switch (errorCodeEnums) {
                case ID_NOT_EXISTS:
                    result.setCode("404");
                    result.setMsg("你访问的资源不存在！");
                    break;

                default:
                    break;
            }

            return result;
        } else {
            return null;
        }
    }
}
