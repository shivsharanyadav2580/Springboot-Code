package com.Shivsharan.service;

import com.Shivsharan.view.ResultView;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IproductService {
    List<ResultView> searchByPPriceLessThan( Double pPrice);

}
