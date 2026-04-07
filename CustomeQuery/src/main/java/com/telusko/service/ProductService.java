package com.telusko.service;

import com.telusko.entity.Product;
import com.telusko.repo.IproductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IproductService {
    @Autowired
    private IproductRepo repo;


    @Override
    public List<Product> findByCategory(String cat) {
        return repo.searchByPCategory(cat);
    }

    @Override
    public List<Product> findByPPrice(Double minPrice, Double maxPrice) {
        return repo.searchByPPrice(minPrice , maxPrice);
    }

    @Override
    public int updateByPproductName(Double newPrice, String productName) {
        return repo.updateThePriceByProductName(newPrice , productName);
    }
}
