package com.learn.java.oop;

public class Routine {
	
	public static void main(String[] args){
		String[] day = {"Sat", "Sun"};
		//off day te class hobe na
		// din max 3 ta class
		//serially 3 ta cls hobe na
		
		Teacher teacher = new Teacher("12h", "AKS", "Asif Khan Shakir");
		teacher.setOffday(day);
		Course course = new Course("SWE221", teacher);
		System.out.println(course.toString());
		course.addSchedule("Sat", 8.30);
		course.addSchedule("Sun", 10.00);
		course.addSchedule("Mon", 8.30);
		course.assignTeacher("AKS", "Asif Khan shakir");
		
		
		
	}

}
