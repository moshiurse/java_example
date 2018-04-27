package com.learn.openclosepattern;


public class Nurse extends JobHolder{

	public Nurse(int id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("Nurse in Action....");
		
	}

	private void checkVitalSigns(){
		System.out.println("Checking vital signs");
	}
	
	private void drawBlood(){
		System.out.println("Drawing Blood");
	}
	
	private void cleanPatientArea(){
		System.out.println("Cleaning Patient Area");
	}
	
	@Override
	public void performDuties() {
		checkVitalSigns();
		drawBlood();
		cleanPatientArea();
		
		
	}

}
