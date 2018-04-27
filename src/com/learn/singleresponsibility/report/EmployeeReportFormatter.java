package com.learn.singleresponsibility.report;

import com.learn.singleresponsibility.domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter{

	public EmployeeReportFormatter(Employee employee, FormatType formatType) {
		super(employee, formatType);
		// TODO Auto-generated constructor stub
	}
	
	public String getFormattedEmployee(){
		
		return getFormattedValue();
	}
}
