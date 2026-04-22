package com.telusko.service;

import com.telusko.entity.Course;

import java.util.List;

public interface IcourseService {
     public List<Course> getAllCourses();
     public void registerCourse(Course course);
     public void deleteCourse(Integer id);
}
