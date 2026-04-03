package com.telusko.repo;

import com.telusko.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepo2 implements IEmployee {
    @Autowired
    private JdbcTemplate jdbcTemplate;
     private String  sql = "insert into studentinfo(id , sname , age , scity) values(?,?,?,?)";

     public void input(Employee emp){
         jdbcTemplate.update(sql , emp.getId() , emp.getName() , emp.getAge() , emp.getCity());

     }
    @Override
    public List<Employee> getEmployee() {
        return List.of();
    }
}
