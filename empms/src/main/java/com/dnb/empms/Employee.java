package com.dnb.empms;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	  @GeneratedValue
	  private Long id;
	
	  private String name;
	  
	  private String dept;
	  private int salary;
	  
	  
}
