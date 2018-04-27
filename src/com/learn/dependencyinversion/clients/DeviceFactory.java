package com.learn.dependencyinversion.clients;

import com.learn.dependencyinversion.processes.GeneralManuFacturingProcess;
import com.learn.dependencyinversion.processes.SmartPhoneManuFacturingProcess;

public class DeviceFactory {

	public static void main(String[] args) {
		GeneralManuFacturingProcess manuFacturer = new SmartPhoneManuFacturingProcess("Apple");
		manuFacturer.launchProcess();

	}

}
