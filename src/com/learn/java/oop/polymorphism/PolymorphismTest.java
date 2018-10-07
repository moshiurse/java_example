package com.learn.java.oop.polymorphism;

/**
 * Created by Moshiur on 10/6/2018.
 */
public class PolymorphismTest {
	public static void main(String[] args){
//Employee
		Employee employee = new Employee();
		employee.doWork();

		FullTimeEmployee fullTime = new FullTimeEmployee("Moshiur| ", 30000);
		fullTime.employeeDetails();

		PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Dipta| ", 500, 40);
		partTimeEmployee.employeeDetails();
	}
}
