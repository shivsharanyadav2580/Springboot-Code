package com.telusko.springWebMVC.controller;

import org.eclipse.tags.shaded.org.apache.xpath.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {
        @GetMapping("/info")
    public String getInfo(@RequestParam("name")  String name , Model model){
        model.addAttribute("name" , name);
        return "index";

    }
    @GetMapping("/details")
    public String getDeatails(@RequestParam("name") String name,
                              @RequestParam("city") String city,
                              Model model) {

        model.addAttribute("name", name);
        model.addAttribute("city", city);

        return "details";
    }
    //PathVariable
    @GetMapping("/user/{name}")
    public String showDetails(@PathVariable String name , Model model){
        model.addAttribute("name" , name);
        return "index";

    }
    @GetMapping("/user/{name}/{city}")
    public String showinfo(@PathVariable String name ,
                           @PathVariable String city ,
                           Model model){


        model.addAttribute("name" , name);
        model.addAttribute("city" , city);
        return "details";

    }

}
 