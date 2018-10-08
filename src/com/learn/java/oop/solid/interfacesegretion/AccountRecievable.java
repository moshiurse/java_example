package com.learn.java.oop.solid.interfacesegretion;

public class AccountRecievable {
	
	private Accounting transaction;
	
	public AccountRecievable(Accounting aTransaction){
		transaction = aTransaction;
	}
	
	public void postPayment(){
		transaction.chargeCustomer();
	}
	
	public void sendInvoice(){
		transaction.prepareInvoice();
	}

}
