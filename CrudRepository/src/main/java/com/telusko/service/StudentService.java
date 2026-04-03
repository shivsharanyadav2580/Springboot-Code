package com.telusko.service;

import com.telusko.entity.Student;
import com.telusko.repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService{
    @Autowired
    private IStudentRepo repo;
    @Override
    public String saveStudent(Student student) {
        Student std = repo.save(student);


        return "Product stored with id" + std.getId();
    }
}
