package com.telusko.service;

import com.telusko.entity.Product;
import com.telusko.view.View;

import java.util.List;

public interface IproductService {
    <T extends View> List<T> searchByPPriceLessThan(Double pPrice , Class<T> cls);


}
