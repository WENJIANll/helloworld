package com.myspringboot.helloworld.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// 扩展spring MVC
// 配置类
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registratry){
        registratry.addViewController("/").setViewName("index");
        registratry.addViewController("index.html").setViewName("index");
        registratry.addViewController("main.html").setViewName("dashboard");
    }

    // 自定义国际划
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }

}
