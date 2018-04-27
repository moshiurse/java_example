package com.learn.dependencyinversion.processes;

public abstract class GeneralManuFacturingProcess {
	
	String processName;
	
	public GeneralManuFacturingProcess(String name){
		processName = name;
	}
	
	protected abstract void assebleDevice();
	protected abstract void testDevice();
	protected abstract void packageDevice();
	protected abstract void storeDevice();
	
	public void launchProcess(){
		assebleDevice();
		testDevice();
		packageDevice();
		storeDevice();
		
	}
	
	
}
