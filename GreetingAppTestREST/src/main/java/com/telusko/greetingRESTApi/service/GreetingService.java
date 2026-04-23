package com.telusko.greetingRESTApi.service;

import com.telusko.greetingRESTApi.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class GreetingService implements Igreeting {
    @Autowired
    private LocalDateTime dateTime;

    @Override
    public String generateGreeting(String name) {
        int hour = dateTime.getHour();
        if (hour <= 12) {
            return "Good morning " + name;
        } else if (hour >= 12) {
            return "Good After noon" + name;
        } else {
            return "Good evening " + name;
        }


    }

    @Override
    public Boolean addAlienInfo(Student student) {
        System.out.println("alien");
        System.out.println("Data added");
        return true;
    }

}

