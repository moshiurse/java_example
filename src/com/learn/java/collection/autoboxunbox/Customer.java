package com.learn.java.collection.autoboxunbox;

import java.util.ArrayList;

/**
 * Created by Moshiur on 10/9/2018.
 */
public class Customer {
	private String name;
	private ArrayList<Double> transactions;

public Customer(String name, double initialAmount) {
	this.name = name;
	this.transactions = new ArrayList<Double>();
	addTransaction(initialAmount);
}

public void addTransaction(double amount){
	this.transactions.add(amount);
}

public String getName() {
	return name;
}

public ArrayList<Double> getTransactions() {
	return transactions;
}

}
