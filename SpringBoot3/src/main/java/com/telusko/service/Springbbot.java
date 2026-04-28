package com.telusko.service;

import org.springframework.stereotype.Service;

@Service
public class Springbbot implements ICourse {
    public Springbbot(){
        System.out.println("Springboot bean created");
    }
    @Override
    public Boolean getTheCourse(Double price) {
        System.out.println("Springboot course is purchased");
        return true;
    }
}
