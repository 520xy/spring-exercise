package com.chongligong.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({"com.chongligong.dao","com.chongligong.service"})
@PropertySource({"classpath:jdbc.properties"})
@Import({JDBCConfig.class,MybatisConfig.class})
@EnableTransactionManagement
public class SpringConfig {


}
