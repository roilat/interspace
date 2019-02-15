package org.linjiezhijia.api.config;

import javax.servlet.Filter;

import org.linjiezhijia.api.config.filter.LogFilter0;
import org.linjiezhijia.api.config.filter.LogFilter1;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    
    @Bean
    public FilterRegistrationBean<Filter> registFilter0() {
        FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<Filter>();
        registration.setFilter(new LogFilter0());
        registration.addUrlPatterns("/*");
        registration.setName("LogFilter0");
        registration.setOrder(1);
        return registration;
    }
    @Bean
    public FilterRegistrationBean<Filter> registFilter1() {
        FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<Filter>();
        registration.setFilter(new LogFilter1());
        registration.addUrlPatterns("/*");
        registration.setName("LogFilter1");
        registration.setOrder(2);
        return registration;
    }
}
