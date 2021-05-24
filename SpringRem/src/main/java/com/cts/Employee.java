package com.cts;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class Employee {
	
	private  int id;
	
	@NotBlank(message = "please enter name")
	private String name;
	
	@Min(value = 20000,message = "salary should be greater than 20000")
	private int salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	

}
