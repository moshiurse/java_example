package com.learn.java.oop.solid.singleresponsibility.dao;

import com.learn.java.oop.solid.singleresponsibility.domain.Employee;

public class EmployeeDAO {
	
	public void saveEmployee(Employee employee){
		System.out.println("Saved employee "+employee);
	}
	
	public void deleteEmployee(Employee employee){
		System.out.println("Deleted employee "+employee);
	}

}
