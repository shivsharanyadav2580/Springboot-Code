package com.telusko.repo;

import com.telusko.entity.Product;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IproductRepo extends JpaRepository<Product , Integer> {
    List<Product> findBypPrice(Double price);
    List<Product> findBypPriceIs(Double price);
    List<Product> findByPPriceEquals(Double price);
    List<Product> findBypPriceGreaterThan(Double price);
    List<Product> findBypPriceLessThan(Double price);
    List<Product> findBypPriceBetween(Double minPrice , Double maxprice);
    List<Product> findByPCategoryEquals(String category);
    List<Product> findByPCategoryInAndPPriceBetween(
            List<String> categories,
            Double minPrice,
            Double maxPrice
    );



}
