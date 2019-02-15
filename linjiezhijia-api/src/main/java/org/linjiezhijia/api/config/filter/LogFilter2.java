package org.linjiezhijia.api.config.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
@WebFilter(urlPatterns = "/*", filterName="LogFilter2")
public class LogFilter2 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain chain) throws IOException, ServletException {
        long start = System.currentTimeMillis();
        System.out.println("LogFilter2 invoked");
        chain.doFilter(servletRequest, servletResponse);
        System.out.println("LogFilter2 Execute cost=" + (System.currentTimeMillis() - start));
    }

}
