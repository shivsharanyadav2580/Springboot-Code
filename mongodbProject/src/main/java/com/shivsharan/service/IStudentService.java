package com.shivsharan.service;

import com.shivsharan.dto.CustomerDto;
import com.shivsharan.model.Students;

import java.util.List;

public interface IStudentService {
    public String registerTheCourse(CustomerDto dto);
    List<Students> findAllcx();
    String removeDocument(String id);

}
