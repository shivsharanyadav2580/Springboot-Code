package com.telusko.springWebMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/home")
    public String home() {

        return "home";

    }
    @GetMapping("/response")
    public String course(Model model){

        String course[] = new String[]  {"Java" , "Springboot" , "Devops" , "Gen Ai"};
        model.addAttribute("courses" , course);
        return "response";
    }
}





