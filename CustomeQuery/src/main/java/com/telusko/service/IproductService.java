package com.telusko.service;


import com.telusko.entity.Product;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IproductService {
//    public List<Product> findByCategory(String category);
    public List<Product> findByCategory(@Param("category") String cat);

    public List<Product> findByPPrice( Double minPrice , Double maxPrice);

    int updateByPproductName(Double newPrice , String productName);

}
