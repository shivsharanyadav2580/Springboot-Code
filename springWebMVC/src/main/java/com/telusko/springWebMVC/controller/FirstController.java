package com.telusko.springWebMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class FirstController {
    @RequestMapping("/telusko1")
    public ModelAndView display(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("message" , "This is my first controoler");
        mav.setViewName("index");
        return mav;
    }
    @GetMapping("/telusko2")
    public ModelAndView display1(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("message" , "This is my first controoler");
        mav.setViewName("index");
        return mav;
    }
    @GetMapping("/telusko3")
    public String display3(Model model){
        model.addAttribute("message" , "Here is Direct String method");
        return "index";
    }
}
//@GetMapping("/telusko4")
//public String display4(Map map){
//    map.put("message" , "this is learning during IPL match");
//    return "index";
//}
