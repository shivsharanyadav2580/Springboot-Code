package com.telusko.repo;

import com.telusko.entity.Product;
import com.telusko.view.View;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IproductRepo extends JpaRepository<Product , Integer> {
<T extends View> List<T> findByPPriceLessThan(Double pPrice , Class<T> cls);


}
