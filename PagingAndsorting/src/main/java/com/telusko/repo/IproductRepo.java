package com.telusko.repo;

import com.telusko.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IproductRepo extends PagingAndSortingRepository<Product , Integer> {


}
