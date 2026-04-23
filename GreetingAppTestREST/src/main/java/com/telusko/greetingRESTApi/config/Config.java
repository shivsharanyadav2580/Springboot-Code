package com.telusko.greetingRESTApi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
@Configuration
public class Config {
    @Bean
    public LocalDateTime generateTime(){
        return LocalDateTime.now();
    }
}
