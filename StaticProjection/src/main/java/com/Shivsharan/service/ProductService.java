package com.Shivsharan.service;

import com.Shivsharan.repo.IproductRepo;
import com.Shivsharan.view.ResultView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService  implements IproductService{

    @Autowired
    private IproductRepo repo;


    @Override
    public List<ResultView> searchByPPriceLessThan(Double pPrice) {
        return repo.findByPPriceLessThan(pPrice);
    }
}
