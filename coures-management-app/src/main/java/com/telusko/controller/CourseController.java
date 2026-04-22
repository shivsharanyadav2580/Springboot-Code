package com.telusko.controller;

import com.telusko.entity.Course;
import com.telusko.service.IcourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CourseController {
    @Autowired
    private IcourseService service;

    @Autowired
    public void setService(IcourseService service) {
        this.service = service;
    }

    @GetMapping("/courselist")
    public String registerCourse(Model model) {
        List<Course> courses = service.getAllCourses();
        model.addAttribute("courses", courses);
        courses.forEach(c-> System.out.println(c));
        return "courselist";

    }
    @GetMapping("/showCourseForm")
    public String showForm(@ModelAttribute("course") Course course){

        return "courseform";
    }
    @GetMapping("/updateCourseForm")
    public String updateshowForm(@ModelAttribute("course") Course course){
        return "courseform";
    }
    @PostMapping("/registerCourse")
    public String registerCourse( @ModelAttribute("course") Course course){
        service.registerCourse(course);
        return "redirect:/courselist";

    }
    @GetMapping("/deleteCourse")
    public String deleteCourseById(@RequestParam("id") Integer id){
        service.deleteCourse(id);
        return "redirect:/courselist";
    }

}
