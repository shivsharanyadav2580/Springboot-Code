package com.telusko.service;

import com.telusko.entity.Product;
import org.springframework.data.domain.PageRequest;

import java.util.Iterator;
import java.util.List;

public interface IproductService {
  Product serachProductById(Integer id);
  Iterable<Product> searchProductsByIds(Iterable<Integer> ids);
  List<Product> serachByProductsDetails(Product products);
  String deleteProductsByidCrud(List<Integer> ids);
  String deleteProdutsByIdJpa(List<Integer> ids);




}
