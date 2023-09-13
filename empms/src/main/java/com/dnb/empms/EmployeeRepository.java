package com.dnb.empms;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

//select * from employee where dept=""
 List<Employee> findByDept(String dept);// name, arguments, return type 
 //select * from employee where salary >? select * ---find   where----By
 List<Employee> findBySalaryGreaterThan(int salary);//having 1 placeholder
 //select * from employee where dept=? and salary<?
 List<Employee> findByDeptAndSalaryLessThan(String dept,int salary);//two placeholders

  //select top 1 * from employee order by salary desc;
 Optional<Employee> findTopByOrderBySalaryDesc();
 
 Employee findTopByOrderBySalaryAsc();
 
 List<Employee> findTop3ByOrderBySalaryDesc();
 
 List<Employee> findTop3ByOrderBySalaryAsc();
 
 Employee findFirstBySalary(int salary);
 
 List<Employee> findFirst2BySalary(int salary);
 
 
 List<Employee> findFirst2ByDeptOrderBySalaryDesc(String deptName);
 
 List<Employee> findBy();//equal to find all
 
 //List<Employee> findBySalaryBetween(int salaryMin, int salaryMax);
 
 List<Employee> findBySalaryBetween(int a, int b);
 
 
 //select * from table where ename like some pattern(like stream pattern e_)
 List<Employee> findByNameLike(String likeString);
 
 List<Employee> findByDeptLike(String likeString);
 
 long countByDept(String deptName);
 //long maxBySalary();    //for aggregate functions, max salary using aggregate functions

 @Query("SELECT e.dept, MAX(e.salary) from Employee e GROUP BY e.dept")
 List<Object[]> findMaxSalaryByDept(); 
}
