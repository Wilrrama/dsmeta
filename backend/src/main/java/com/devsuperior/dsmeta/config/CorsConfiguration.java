package com.devsuperior.dsmeta.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

	@Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("http://localhost:3000")
            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT");
    }
	
	public void addCorsMappings2(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("https://dsmeta-wilson.herokuapp.com")
            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT");
    }
	
	public void addCorsMappings3(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("https://dsmeta-wilson.netlify.app/")
            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT");
    }
	
}

