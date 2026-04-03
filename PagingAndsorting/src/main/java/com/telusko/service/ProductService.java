package com.telusko.service;

import com.telusko.entity.Product;
import com.telusko.repo.IproductRepo;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Iterable<Product> fetchProductInfoBySorting(boolean status, String... properties) {

        Sort sort = Sort.by(status? Sort.Direction.ASC: Sort.Direction.DESC ,properties );

        return  repo.findAll(sort);

    }

    @Override
    public void fetchPageByPagination(int pageSize) {
        long count = 20l;
        long pageCount = (count + pageSize - 1) / pageSize;

        for (int i = 0; i < pageCount; i++) {
            PageRequest pageable = PageRequest.of(i, pageSize);
            Page<Product> page = repo.findAll(pageable);

            page.getContent().forEach(System.out::println);
            System.out.println("***************");
        }
    }
}
