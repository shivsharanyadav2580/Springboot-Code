package com.telusko.service;

import com.telusko.entity.Product;

import java.util.List;

public interface IproductService {
    String saveproduct(Product product);
  Iterable<Product>  saveMultipleProducts(Iterable<Product> products);
  Iterable<Product> getAllproducts();
  Iterable<Product> getAllProductsById(List<Integer> ids);
  Product getproductById(Integer id);
  Boolean isProductAvailable(Integer id);
  Integer  getTotalProductCount();
  String deleteProductById(Integer id);
  String deleteProductsByid(List<Integer> ids);

}
