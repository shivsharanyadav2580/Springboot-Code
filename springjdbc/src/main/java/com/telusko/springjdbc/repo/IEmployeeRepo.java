package com.telusko.springjdbc.repo;

import com.telusko.springjdbc.entity.Employee;

import java.util.List;

public interface IEmployeeRepo {
    List<Employee> getEmployeeInfo();
}
