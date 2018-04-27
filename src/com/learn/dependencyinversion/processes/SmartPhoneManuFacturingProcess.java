package com.learn.dependencyinversion.processes;

public class SmartPhoneManuFacturingProcess extends GeneralManuFacturingProcess{

	public SmartPhoneManuFacturingProcess(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void assebleDevice() {
		System.out.println("Smartphone assembled");
		
	}

	@Override
	protected void testDevice() {
		System.out.println("Smartphone tested");
		
	}

	@Override
	protected void packageDevice() {
		System.out.println("Smartphone packaged");
		
	}

	@Override
	protected void storeDevice() {
		System.out.println("Smartphone stored");
		
	}

}
