package com.telusko.springWebMVC.controller;


import com.telusko.springWebMVC.model.StudentData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
import java.util.Objects;


@Controller
public class FirstController {

    @GetMapping("/form")
    public String showForm(Map<String, Object> map){
        map.put("studentData", new StudentData());
        return "form";
    }
    @PostMapping("/register")
    public String register(Map<String , Object> map , StudentData studentData){
        map.put("StudentData" , studentData);
        return "response";

    }


}
 