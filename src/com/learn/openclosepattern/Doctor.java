package com.learn.openclosepattern;


public class Doctor extends JobHolder{

	public Doctor(int id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("Doctor in Action....");
		
	}
	
	private void prescriveMedicine(){
		System.out.println("Prescrive Medicine");
	}
	
	private void diagnosePatient(){
		System.out.println("Diagnose Patient");
	}


	@Override
	public void performDuties() {
		prescriveMedicine();
		diagnosePatient();
		
	}

}
