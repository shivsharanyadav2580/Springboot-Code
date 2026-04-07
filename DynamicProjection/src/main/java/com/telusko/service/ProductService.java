package com.telusko.service;

import com.telusko.entity.Product;
import com.telusko.repo.IproductRepo;
import com.telusko.view.View;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IproductService {
    @Autowired
    private IproductRepo repo;


    @Override
    public <T extends View> List<T> searchByPPriceLessThan(Double pPrice, Class<T> cls) {
        return repo.findByPPriceLessThan(pPrice , cls);
    }
}
