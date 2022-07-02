package com.chongligong.config;

import com.chongligong.controller.interceptor.ProjectInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class SupportConfig extends WebMvcConfigurationSupport {

    @Autowired
    private ProjectInterceptor projectInterceptor;

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
         //   registry.addResourceHandler("/html/**").addResourceLocations("/html/");
    }

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
      //  registry.addInterceptor(projectInterceptor).addPathPatterns("/brands","/brands/**");
    }
}
