package com.telusko.springWebMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/second")
public class SecondController {
    @GetMapping("/display1")
    public String display1(Model model){
        model.addAttribute("message" , "This is in second controller display ");

        return  "index";
    }

}
