package com.telusko.service;

import org.springframework.stereotype.Service;

@Service
public class Java implements ICourse {
    public Java(){
        System.out.println("Java bean cretaed");
    }

    @Override
    public Boolean getTheCourse(Double price) {

        System.out.println("java course i spurchased ");
        return true;
    }
}
