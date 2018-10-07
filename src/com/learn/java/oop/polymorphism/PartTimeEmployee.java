package com.learn.java.oop.polymorphism;

/**
 * Created by Moshiur on 10/6/2018.
 */
public class PartTimeEmployee extends Employee{

	private int ratePerHour;
	private double workingHour;

public PartTimeEmployee(String name, int ratePerHour, double workingHour) {
	this.name = name;
	this.ratePerHour = ratePerHour;
	this.workingHour = workingHour;
}

public void employeeDetails(){
	double salary = ratePerHour * workingHour;
	System.out.println("Full Time Employee! name : "+name + "Salary : "+ salary);
}

}
