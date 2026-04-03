package com.telusko.service;

import com.telusko.entity.Product;
import com.telusko.repo.IproductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IproductService {
    @Autowired
    private IproductRepo repo;

    @Override
    public String saveproduct(Product product) {
        Product pd  = repo.save(product);


        return "Product stored with id " + pd.getpId();
    }

    @Override
    public Iterable<Product> saveMultipleProducts(Iterable<Product> products) {
        return repo.saveAll(products);
    }

    @Override
    public Iterable<Product> getAllproducts() {
        return repo.findAll();
    }

    @Override
    public Iterable<Product> getAllProductsById(List<Integer> ids) {
        return repo.findAllById(ids);
    }

    @Override
    public Product getproductById(Integer id) {
        Optional<Product> optional = repo.findById(id);
        if (optional.isPresent()){
            Product pd  = optional.get();
            return pd;
        }
        else
            return new Product();
    }

    @Override
    public Boolean isProductAvailable(Integer id) {
      return  repo.existsById(id);

    }

    @Override
    public Integer getTotalProductCount() {
        return (int) repo.count();
    }

    @Override
    public String deleteProductById(Integer id) {
        Optional<Product> optional = repo.findById(id);
        if(optional.isPresent()){
            repo.deleteById(id);
            return "The products with this id " + id + "is deleted";
        }
        else {
            return "The produts with this id is not present";
        }

    }

    @Override
    public String deleteProductsByid(List<Integer> ids) {
        List<Product> products = (List<Product>) repo.findAllById(ids);
        if(products.size() != 0){
            repo.deleteAllById(ids);
            return "all products   with this id" + ids + "is deleted";
        }
        else
            return
                "all products are deleted";


    }


}
