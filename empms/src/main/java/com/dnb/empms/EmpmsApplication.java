package com.dnb.empms;



import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EmpmsApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(EmpmsApplication.class, args);

		EmployeeRepository employeeRepository = applicationContext.getBean(EmployeeRepository.class);
		Employee em = new Employee();
//		em.setId((long) 3);
//		em.setDept("IT");
//		em.setName("Divya");
//		em.setSalary(70988);
//		employeeRepository.save(em);
//
//		employeeRepository.findByDept("IT");
//
//		
//		
//		em.setId((long) 4);
//		em.setDept("IT");
//		em.setName("Ramya");
//		em.setSalary(7678);
//		employeeRepository.save(em);
//		em.setId((long) 6);
//		em.setDept("Finance");
//		em.setName("Ramya");
//		em.setSalary(767800);
//		employeeRepository.save(em);

		
//		System.out.println(employeeRepository.findTopByOrderBySalaryAsc());
//		System.out.println(employeeRepository.findFirst2BySalary(70988));
//		System.out.println(employeeRepository.findBySalaryBetween(23, 345678876));
//		System.out.println(employeeRepository.findBy());
//		System.out.println(employeeRepository.findByDeptLike("F%"));
//		System.out.println(employeeRepository.findByNameLike("D%"));
//		System.out.println(employeeRepository.countByDept("Finance"));
//		System.out.println(employeeRepository.maxBySalary());
		
		
		
	List<Object[]> list= employeeRepository.findMaxSalaryByDept();
	list.forEach(e -> {
//		System.out.println(e[0]);
//		System.out.println(e[1]);
		System.out.println(Arrays.toString(e));// printing all at one go
		});
	
	
		
	}

}
