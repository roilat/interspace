package cn.roilat.interspace.blog.modules.hook.interceptor;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 拦截类钩子支持类
 *
 * @author Beldon 2015/10/30
 */
public abstract class InterceptorHookSupport implements InterceptorHook {
    @Autowired
    protected InterceptorHookManager interceptorHookManager;

    @PreDestroy
    public void destroy() {
        interceptorHookManager.removeInterceptorHook(this);
    }
}
