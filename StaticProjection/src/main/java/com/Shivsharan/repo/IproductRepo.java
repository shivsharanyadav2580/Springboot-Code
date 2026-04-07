package com.Shivsharan.repo;

import com.Shivsharan.entity.Product;
import com.Shivsharan.view.ResultView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IproductRepo extends JpaRepository<Product , Integer> {
    List<ResultView> findByPPriceLessThan(Double pPrice);
}
