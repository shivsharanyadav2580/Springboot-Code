package com.tshaped.service;

import com.tshaped.config.TimeConfig;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Greeting {
    @Autowired
    private TimeConfig time;
    public Greeting(){
        System.out.println("Bean created ");
    }
    public void Greeting(){
        System.out.println("good evening");
    }




}
