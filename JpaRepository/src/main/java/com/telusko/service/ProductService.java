package com.telusko.service;

import com.telusko.entity.Product;
import com.telusko.repo.IproductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IproductService {
    @Autowired
    private IproductRepo repo;




    @Override
    public Product serachProductById(Integer id) {
        return   repo.getReferenceById(id);


    }

    @Override
    public Iterable<Product> searchProductsByIds(Iterable<Integer> ids) {
        return repo.findAllById(ids);
    }

    @Override
    public List<Product> serachByProductsDetails(Product products) {
        Example<Product> example = Example.of(products);

        return repo.findAll(example);
    }

    @Override
    public String deleteProductsByidCrud(List<Integer> ids) {
        List<Product> products = repo.findAllById(ids);
        if(products.size() != 0){
            repo.deleteAllById(ids);
            return  "all products with this id" + ids + "is deleted";

        }
        else{
            return "products not availbale in databas";
        }
    }

    @Override
    public String deleteProdutsByIdJpa(List<Integer> ids) {
        List<Product> products = repo.findAllById(ids);
        if(products.size() != 0){
            repo.deleteAllByIdInBatch(ids);
            return "all products delete with this " + ids  +" is delete";
        }
        else
            return "not present with this id ";

    }


}
