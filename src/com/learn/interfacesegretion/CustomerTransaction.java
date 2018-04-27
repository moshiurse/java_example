package com.learn.interfacesegretion;

import java.util.Date;
import java.util.List;

public class CustomerTransaction implements Accounting, reporting {
	
	private List<Product> products;
	private Customer customer;
	
	public CustomerTransaction(Customer customer, List<Product> products) {
		this.products = products;
		this.customer = customer;
	}
	
	/* (non-Javadoc)
	 * @see com.learn.interfacesegretion.reporting#getName()
	 */
	@Override
	public String getName(){
		return customer.getName();
	}
	
	/* (non-Javadoc)
	 * @see com.learn.interfacesegretion.reporting#getDate()
	 */
	@Override
	public Date getDate(){
		return new Date();
	}
	
	/* (non-Javadoc)
	 * @see com.learn.interfacesegretion.reporting#productBreakDown()
	 */
	@Override
	public String productBreakDown(){
		String reports = null;
		
		for(Product product: products){
			reports += product.getProductName();
		}
		return reports;
	}

	/* (non-Javadoc)
	 * @see com.learn.interfacesegretion.Accounting#prepareInvoice()
	 */
	@Override
	public String prepareInvoice(){
		return "prepare Invoice";
		
	}
	
	/* (non-Javadoc)
	 * @see com.learn.interfacesegretion.Accounting#chargeCustomer()
	 */
	@Override
	public String chargeCustomer(){
		return "Charge Customer";
		
	}


}
