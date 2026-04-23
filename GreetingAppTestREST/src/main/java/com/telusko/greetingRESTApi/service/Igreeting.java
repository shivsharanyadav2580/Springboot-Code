package com.telusko.greetingRESTApi.service;

import com.telusko.greetingRESTApi.model.Student;

public interface Igreeting {
    public String generateGreeting(String name);
    Boolean addAlienInfo(Student student);



}
