package com.learn.java.oop.solid.dependencyinversion.clients;

import com.learn.java.oop.solid.dependencyinversion.processes.GeneralManuFacturingProcess;
import com.learn.java.oop.solid.dependencyinversion.processes.SmartPhoneManuFacturingProcess;

public class DeviceFactory {

	public static void main(String[] args) {
		GeneralManuFacturingProcess manuFacturer = new SmartPhoneManuFacturingProcess("Apple");
		manuFacturer.launchProcess();

	}

}
