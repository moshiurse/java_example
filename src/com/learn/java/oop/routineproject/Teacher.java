package com.learn.java.oop.routineproject;

public class Teacher {
	
	
	private String tId;
	private String tInitial;
	private String tName;
	private String[] offday;
	
	public Teacher(String tId, String tInitial, String tName) {
		this.tId = tId;
		this.tInitial = tInitial;
		this.tName = tName;
	}
	
	
	public String gettId() {
		return tId;
	}
	public void settId(String tId) {
		this.tId = tId;
	}
	public String gettInitial() {
		return tInitial;
	}
	public void settInitial(String tInitial) {
		this.tInitial = tInitial;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}

	public String[] getOffday() {
		return offday;
	}

	public void setOffday(String[] offday) {
		this.offday = offday;
	}
	

	@Override
	public String toString() {
		return "Teacher [tId=" + tId + ", tInitial=" + tInitial + ", tName=" + tName + "]";
	}
	
	
		

}
