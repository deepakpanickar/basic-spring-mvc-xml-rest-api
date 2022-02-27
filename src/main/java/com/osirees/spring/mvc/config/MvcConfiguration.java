package com.osirees.spring.mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages="com.osirees.spring.mvc")
@EnableWebMvc
public class MvcConfiguration {
	
}
