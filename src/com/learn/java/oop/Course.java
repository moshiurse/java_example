package com.learn.java.oop;

public class Course {
	
	private String cCode;
	private Teacher cTeacher;
	
	
	public Course(String cCode, Teacher cTeacher) {
		super();
		this.cCode = cCode;
		this.cTeacher = cTeacher;
	}
	
	public String getcCode() {
		return cCode;
	}
	public void setcCode(String cCode) {
		this.cCode = cCode;
	}
	public Teacher getcTeacher() {
		return cTeacher;
	}
	public void setcTeacher(Teacher cTeacher) {
		this.cTeacher = cTeacher;
	}

	public void addSchedule(String day, double time){
		System.out.println("Course : "+cCode+ " Day: "+ day+ " Time: "+time);
		
	}
	
	public void assignTeacher(String tInit, String name){
		System.out.println("Course Teacher : "+name+ " & Teacher Initial "+ tInit);
	}
		
	
	
	@Override
	public String toString() {
		return "Course [cCode=" + cCode + ", cTeacher=" + cTeacher + "]";
	}
	
	

}
