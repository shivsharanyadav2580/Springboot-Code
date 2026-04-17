package com.telusko.greetingRESTApi.controller;

import com.telusko.greetingRESTApi.model.Student;
import com.telusko.greetingRESTApi.service.Igreeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {
    @Autowired
    private Igreeting greet; // field injection
    @GetMapping("/greet/{name}")
    public String getGreeting(@PathVariable("name") String name){
     String greeting =    greet.generateGreeting(name);
     return greeting; // without " "
    }

    public ResponseEntity<String> getgreeting2(@PathVariable("name") String name){
        String greeting = greet.generateGreeting(name);
        return new ResponseEntity<String>(greeting , HttpStatus.OK);
    }
   @GetMapping("/get-alien")
    public Student getStudent(){
        Student student = new Student(1 , "Shiv" , "Mumbai");
        return student;
    }

    @PostMapping("/student-data")
    public String addStudentName(@RequestBody Student student){
        System.out.println(student);
        return "Alien object added";
    }

}
