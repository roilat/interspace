package org.linjiezhijia.api.config;

import org.linjiezhijia.api.config.interceptors.LogInvokeInfoInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LogInvokeInfoInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
