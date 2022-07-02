package com.chongligong.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.chongligong.controller","com.chongligong.config"})
@EnableWebMvc
public class SpringMVCConfig {
}
