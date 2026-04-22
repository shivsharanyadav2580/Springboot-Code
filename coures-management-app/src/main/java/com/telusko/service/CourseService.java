package com.telusko.service;

import com.telusko.entity.Course;
import com.telusko.repo.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements IcourseService{


    @Autowired
    private ICourseRepo repo;
     @Autowired
    public void setRepo(ICourseRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Course> getAllCourses() {
        return (List<Course>) repo.findAll();
    }

    @Override
    public void registerCourse(Course course) {
         repo.save(course);

    }

    @Override
    public void deleteCourse(Integer id) {
         repo.deleteById(id);

    }
}
