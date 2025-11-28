package com.mphasis.DesignPatterns;

public class NetBanking implements Payment{

private CashPayment cash=new CashPayment();
	
//	@Override
	public void pay(double amount) {
		System.out.println("net banking payment processing");
		System.out.println("user validated and authenticated");
		System.out.println("otp verification done");
		System.out.println("payment successfull");
		cash.pay(amount);
}
}