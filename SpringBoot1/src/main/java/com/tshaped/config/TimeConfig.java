package com.tshaped.config;

import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeConfig {
    public TimeConfig(){
        System.out.println("Time config  bean created");
    }
    @Bean
   public LocalTime cretaedInstanceofTime(){
        LocalTime time = LocalTime.now();
        return time;
   }

}

