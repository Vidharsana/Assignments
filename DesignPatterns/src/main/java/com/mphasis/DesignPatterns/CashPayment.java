package com.mphasis.DesignPatterns;

public class CashPayment implements Payment{

	@Override
	public void pay(double amount) {
		System.out.println("payment done for the amount : "+amount);
		
	}

}
