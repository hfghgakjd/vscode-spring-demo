package com.snowfog.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * spring 配置
 * 
 * @author 邵静
 */
@Configuration
@ComponentScan(basePackages = { "com.snowfog" }, excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class) })
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class RootConfig {

}