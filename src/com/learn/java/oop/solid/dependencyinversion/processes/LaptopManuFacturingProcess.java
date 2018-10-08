package com.learn.java.oop.solid.dependencyinversion.processes;

public class LaptopManuFacturingProcess extends GeneralManuFacturingProcess{

	public LaptopManuFacturingProcess(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void assebleDevice() {
		System.out.println("Laptop assembled");
		
	}

	@Override
	protected void testDevice() {
		System.out.println("Laptop tested");
		
	}

	@Override
	protected void packageDevice() {
		System.out.println("Laptop packaged");
		
	}

	@Override
	protected void storeDevice() {
		System.out.println("Laptop stored");
		
	}

}
