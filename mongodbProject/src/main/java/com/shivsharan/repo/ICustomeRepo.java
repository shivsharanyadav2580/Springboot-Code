package com.shivsharan.repo;

import com.shivsharan.model.Students;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ICustomeRepo  extends MongoRepository<Students , String> {



}
