package com.shivsharan.service;

import com.shivsharan.dto.CustomerDto;
import com.shivsharan.model.Students;
import com.shivsharan.repo.ICustomeRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private ICustomeRepo repo;


    @Override
    public String registerTheCourse(CustomerDto dto) {
        Students st = new Students();
//       st.setName(dto.getName());
//       st.setAge(dto.getAge());
//       st.setCity(dto.getCity());
        BeanUtils.copyProperties(dto, st);
        Students s1 = repo.save(st);
        return "customer stored with student with id" + s1.getId();
    }

    @Override
    public List<Students> findAllcx() {
        return repo.findAll();
    }

    @Override
    public String removeDocument(String id) {

        Optional<Students> optional = repo.findById(id);

        if (optional.isPresent()) {
            repo.deleteById(id);
            return "Deleted Successfully with this id " + id;
        } else {
            return "Student Not Found";
        }
    }
}
