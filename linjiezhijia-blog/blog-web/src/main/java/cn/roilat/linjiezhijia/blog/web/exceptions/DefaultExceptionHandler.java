/*
+--------------------------------------------------------------------------
|   blog [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2014, 2015 mtons. All Rights Reserved
|   http://www.mtons.com
|
+---------------------------------------------------------------------------
*/
package cn.roilat.linjiezhijia.blog.web.exceptions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;

import cn.roilat.linjiezhijia.blog.base.data.Data;

/**
 * 异常处理
 * @author roilat-D
 *
 */
@Component
public class DefaultExceptionHandler implements HandlerExceptionResolver {
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	private String errorView = "/error";
	
	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		
		logger.error(ex.getMessage(), ex);

		ModelAndView view = null;
		String ret = ex.getMessage();
		
		if (isAjax(handler)) {
			try {
				response.setContentType("application/json;charset=UTF-8");
				response.getWriter().print(JSON.toJSONString(Data.failure(ret)));
			} catch (IOException e) {
				// do something
			}
			
			view = new ModelAndView();
		} else {
			Map<String, Object> map = new HashMap<String, Object>();  
			map.put("error", ret);
	        map.put("base", request.getContextPath());
			view = new ModelAndView(errorView, map);
		}
		return view;
	}
	
	/**
	 * 判断是否 ajax 调用
	 * 
	 * @param handler
	 * @return
	 */
	private boolean isAjax(Object handler) {
		if (handler != null && handler instanceof HandlerMethod) {
			HandlerMethod handlerMethod = (HandlerMethod) handler;
			ResponseBody responseBodyAnn = AnnotationUtils.findAnnotation(handlerMethod.getMethod(), ResponseBody.class);  
			return responseBodyAnn != null;
		}
		
		return false;
	}
	
}
