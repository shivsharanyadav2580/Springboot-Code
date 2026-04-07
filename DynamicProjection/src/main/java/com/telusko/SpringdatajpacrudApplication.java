package com.telusko;

import com.telusko.entity.Product;
import com.telusko.service.IproductService;
import com.telusko.view.ResultView2;
import com.telusko.view.ResultView3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringdatajpacrudApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext container = SpringApplication.run(SpringdatajpacrudApplication.class, args);
		IproductService service = container.getBean(IproductService.class);
         service.searchByPPriceLessThan(60000.0 , ResultView2.class).forEach(p-> System.out.println(p.getpCategory() + ":" + p.getpName()));


	}
}
