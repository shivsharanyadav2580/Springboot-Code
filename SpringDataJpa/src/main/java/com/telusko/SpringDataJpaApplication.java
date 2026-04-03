package com.telusko;

import com.telusko.Entity.Employee;
import com.telusko.repo.EmployeeRepo2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container  = SpringApplication.run(SpringDataJpaApplication.class, args);
		EmployeeRepo2 repo2 = container.getBean(EmployeeRepo2.class);
		Employee e = new Employee();

		e.setId(414);
		e.setName("Bhola");
		e.setAge(29);
		e.setCity("jhuanipur");
		repo2.input(e);


	}

}
