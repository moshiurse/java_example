package com.learn.java.oop.solid.singleresponsibility.report;

import com.learn.java.oop.solid.singleresponsibility.domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter{

	public EmployeeReportFormatter(Employee employee, FormatType formatType) {
		super(employee, formatType);
		// TODO Auto-generated constructor stub
	}
	
	public String getFormattedEmployee(){
		
		return getFormattedValue();
	}
}
