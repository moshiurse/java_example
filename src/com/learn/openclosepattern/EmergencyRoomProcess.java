package com.learn.openclosepattern;


public class EmergencyRoomProcess {
	public static void main(String args[]){
		
		HospitalManagement erDirector = new HospitalManagement();
		JobHolder dr = new Doctor(03, "Asha", "Medicine", true);
		erDirector.callUpon(dr);
		
		JobHolder nr = new Nurse(03, "Asha", "Medicine", true);
		erDirector.callUpon(nr);
	}

}
