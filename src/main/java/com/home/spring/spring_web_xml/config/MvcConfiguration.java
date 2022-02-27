package com.home.spring.spring_web_xml.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages="com.home.spring.spring_web_xml")
@EnableWebMvc
public class MvcConfiguration {
	
}
