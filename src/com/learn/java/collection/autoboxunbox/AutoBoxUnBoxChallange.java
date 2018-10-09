package com.learn.java.collection.autoboxunbox;

/**
 * Created by Moshiur on 10/9/2018.
 */
public class AutoBoxUnBoxChallange {
	public static void main(String[] args){

		Bank bank = new Bank("Bangladesh Bank");

		Branch mymensingh = new Branch("Mymensingh");
		bank.addBranch(mymensingh.getName());

		bank.addCustomer(mymensingh.getName(), "Moshiur", 3000.0);
		bank.addCustomer(mymensingh.getName(), "Rajib", 2000.60);

		bank.addCustomerTransaction(mymensingh.getName(), "Moshiur", 165.67);
		bank.addCustomerTransaction(mymensingh.getName(), "Rajib", 155.00);

		Branch dhaka = new Branch("Dhaka");
		bank.addBranch(dhaka.getName());

		bank.addCustomer(dhaka.getName(), "Motiur", 3000.0);

		bank.addCustomerTransaction(dhaka.getName(), "Motiur", 300.76);

		bank.listCustomers(mymensingh.getName(), false);
		bank.listCustomers(mymensingh.getName(), true);
		bank.listCustomers(dhaka.getName(), false);
		bank.listCustomers(dhaka.getName(), true);

		if (!bank.addCustomer("Chittagong", "Motiur", 154.00)){
			System.out.println("Branch doesn't exists");
		}

		if (!bank.addBranch("Mymensingh")){
			System.out.println("Branch already exists");
		}

		if (!bank.addCustomerTransaction("Mymensingh", "Motiur", 154.00)){
			System.out.println("Customer doesn't exists in this Branch");
		}
	}
}
