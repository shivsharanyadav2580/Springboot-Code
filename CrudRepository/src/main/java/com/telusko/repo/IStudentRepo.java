package com.telusko.repo;

import com.telusko.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentRepo extends CrudRepository<Student , Integer> {

}
