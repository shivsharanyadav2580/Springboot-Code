package com.telusko.service;

import com.telusko.entity.Product;

import java.util.List;

public interface IproductService {
    List<Product>  searchByPrice(Double price);
    List<Product> searchByPriceIs(Double price);
    List<Product> searchBypriceLessThan(Double price);
    List<Product> gitanjaliBypPriceGreaterThan(Double price);
    List<Product> searchBypPriceBetween(Double minPrice , Double maxprice);
    List<Product> searchBypCategory(String category);
    List<Product> searchBypCategoryInAndpPriceBetween(List<String> categories , Double minPrice , Double maxPrice);


}
