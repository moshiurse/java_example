package com.learn.java.oop.polymorphism;

/**
 * Created by Moshiur on 10/6/2018.
 */
public class FullTimeEmployee extends Employee{

public FullTimeEmployee(String name, int salary) {
	this.salary = salary;
	this.name = name;
}

public int salary;

	public void employeeDetails(){
		System.out.println("Full Time Employee! name : "+name + "Salary : "+ salary);
	}

}
