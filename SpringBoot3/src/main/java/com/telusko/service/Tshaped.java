package com.telusko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tshaped {

    private ICourse course;

    @Autowired
    public Tshaped(ICourse course){
        super();
        System.out.println("Dependency injection through constructor");
        this.course = course;
    }
    public Tshaped(){
        System.out.println("Tshaped skill bean created");
    }
}
