package com.learn.java.oop.solid.liskovsubstitution;

public class SubstituteTeacher extends SchoolStuff{

	
	private void makeAnouncement(){
		System.out.println("Make Anouncement");
	}
	
	private void takeAttendence(){
		System.out.println("Take Attendence");
	}
	
	private void collectPaper(){
		System.out.println("Collect Paper");
	}
	
	public void performOtherWorks(){
		makeAnouncement();
		takeAttendence();
		collectPaper();
		
		
	}
	
}
