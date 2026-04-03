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
    public List<Product> searchByPrice(Double price) {
        return repo.findBypPrice(price);
    }

    @Override
    public List<Product> searchByPriceIs(Double price) {
        return  repo.findBypPriceIs(price);
    }

    @Override
    public List<Product> searchBypriceLessThan(Double price) {
        return repo.findBypPriceLessThan(price);
    }

    @Override
    public List<Product> gitanjaliBypPriceGreaterThan(Double price) {
        return repo.findBypPriceGreaterThan(price);
    }

    @Override
    public List<Product> searchBypPriceBetween(Double minPrice, Double maxprice) {
        return repo.findBypPriceBetween( minPrice , maxprice);
    }

    @Override
    public List<Product> searchBypCategory(String category) {
        return repo.findByPCategoryEquals(category);
    }

    @Override
    public List<Product> searchBypCategoryInAndpPriceBetween(List<String> categories, Double minPrice, Double maxPrice) {
        return repo.findByPCategoryInAndPPriceBetween(categories , minPrice , maxPrice);
    }


}
