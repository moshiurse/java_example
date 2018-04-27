package com.learn.interfacesegretion;

public class ReportGenerator {
	
	private reporting reporting;
	
	public void generateReport(){
		System.out.println(reporting.getName()+ " "+ reporting.getDate()+ " "+reporting.productBreakDown());
	}

}
