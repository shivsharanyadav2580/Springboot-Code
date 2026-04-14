package com.telusko.springWebMVC.controller;

import com.telusko.springWebMVC.model.Course;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/first")
public class CourseController {

    @GetMapping("/course-info")
    public String courseInfo(Map<String, Object> map) {
        map.put("courseId",    100);
        map.put("courseName",  "Java");
        map.put("coursePrice", 4999.0);
        return "courseinfo";
    }

    @GetMapping("/course-details")
    public String courseDetails(Model model) {
        Course course = new Course(1, "Devops", 2500.0);
        model.addAttribute("course", course);
        return "courseDetails";
    }
}