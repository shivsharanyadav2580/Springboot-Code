package com.telusko.springjdbc;

import com.telusko.springjdbc.entity.Employee;
import com.telusko.springjdbc.repo.IEmployeeRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Iterator;
import java.util.List;

@SpringBootApplication
public class SpringjdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringjdbcApplication.class, args);

		IEmployeeRepo repo = container.getBean(IEmployeeRepo.class);

		repo.getEmployeeInfo().forEach(e -> System.out.println(e));
//		List<Employee> list = repo.getEmployeeInfo();
//		Iterator itr = list.iterator();
//		while (itr.hasNext()){
//			System.out.println(itr.next());
//		}



	}

}
