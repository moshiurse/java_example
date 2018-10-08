package com.learn.java.oop.solid.singleresponsibility.clients;

import com.learn.java.oop.solid.singleresponsibility.dao.EmployeeDAO;
import com.learn.java.oop.solid.singleresponsibility.domain.Employee;
import com.learn.java.oop.solid.singleresponsibility.report.EmployeeReportFormatter;
import com.learn.java.oop.solid.singleresponsibility.report.FormatType;

public class ClientModule {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(01, "Moshiur", "SWE", true);
		ClientModule.hireEmployee(employee1);
		printReportEmployee(employee1);

	}
	
	public static void hireEmployee(Employee employee){
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.saveEmployee(employee);
	}
	
	public static void terminateEmployee(Employee employee){
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.deleteEmployee(employee);
	}
	
	public static void printReportEmployee(Employee employee){
		EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, FormatType.CSV);
		System.out.println(formatter.getFormattedEmployee());
	}

}
