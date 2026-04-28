package com.telusko.service;

import com.telusko.entity.Product;
import org.springframework.data.domain.PageRequest;

import java.util.Iterator;
import java.util.List;

public interface IproductService {
  Iterable<Product> fetchProductInfoBySorting(boolean status , String... properties);
  void fetchPageByPagination(int pageSize);


  public void deleteProductByPProductName(Product product){

  }


}
