package cn.roilat.interspace.api.config;

import javax.servlet.Filter;

import cn.roilat.interspace.api.config.filter.LogFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    
    @Bean
    public FilterRegistrationBean<Filter> registFilter1() {
        FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<Filter>();
        registration.setFilter(new LogFilter());
        registration.addUrlPatterns("/*");
        registration.setName("LogFilter1");
        registration.setOrder(2);
        return registration;
    }
}
