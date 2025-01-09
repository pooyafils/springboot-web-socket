package com.example.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*") // Allow requests from all origins (adjust as needed)
                .allowedMethods("GET", "POST", "OPTIONS", "HEAD", "PUT", "DELETE", "PATCH")
                .allowedHeaders("*");
    }
}