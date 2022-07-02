package com.chongligong.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.chongligong.dao","com.chongligong.service"})
@PropertySource({"jdbc.properties"})
@Import({JDBCConfig.class})
public class SpringConfig {


}
