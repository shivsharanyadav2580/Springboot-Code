package com.telusko.springWebMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/display1")
    public String display1(Model model){
        model.addAttribute("message" , "This is in first controller display");
        return "index";
    }


}
