package com.learn.java.oop.solid.openclosepattern;

abstract public class JobHolder {

	private int id;
	private String name;
	private String department;
	private boolean working;
	
	public JobHolder(int id, String name, String department, boolean working) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.working = working;
	}
	
	public abstract void performDuties();

	@Override
	public String toString() {
		return "JobHolder [id=" + id + ", name=" + name + ", department=" + department + ", working=" + working + "]";
	}
	
}
