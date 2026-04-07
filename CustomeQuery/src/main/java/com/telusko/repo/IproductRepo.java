package com.telusko.repo;

import com.telusko.entity.Product;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface IproductRepo extends JpaRepository<Product , Integer> {
//
//    @Query("from Product where pCategory =: category")
//    public List<Product> searchByPCategory(String category); // here name and parameter is same

    @Query("from Product where pCategory = :category")
    public List<Product> searchByPCategory(@Param("category") String cat);
//
//    @Query("  from Product where pPrice between :minPrice and :maxPrice")
//    public List<Product> searchByPPrice( Double minPrice , Double maxPrice);
    @Query("from Product where pPrice between :minPrice and :maxPrice")
    public List<Product> searchByPPrice(
            @Param("minPrice") Double minPrice,
            @Param("maxPrice") Double maxPrice
    );

//    @Modifying
//    @Transactional
//    @Query("update Product set pPrice= :newPrice where pName = :productName")
//    public int  updateThePriceByProductName(Double newPrice , String productName);

    @Modifying
    @Transactional
    @Query("update Product  set pPrice = :newPrice where  pName = :productName")
    int updateThePriceByProductName(@Param("newPrice") Double newPrice , @Param("productName") String productName);

}
