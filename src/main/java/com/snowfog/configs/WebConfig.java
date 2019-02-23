package com.snowfog.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * spring mvc配置
 * 
 * @author 邵静
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.snowfog.controller" })
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class WebConfig implements WebMvcConfigurer {

    /**
     * 视图解析器配置
     * 
     * @author 邵静
     * @return {@link ViewResolver}
     */
    @Bean(name = "viewResolver")
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/view/");
        resolver.setSuffix(".html");
        resolver.setExposeContextBeansAsAttributes(true);
        resolver.setViewClass(JstlView.class);
        return resolver;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}