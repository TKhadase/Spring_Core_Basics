package com.tushar.beans;

public class CurrentAccount extends BankAccount {

	private double balance=0.0;
	private Long number=0L;
	
	public CurrentAccount(double balance,  Long number) {
		this.balance = balance;
		this.number= number;
	}
	
	
	public CurrentAccount() {
	}
	
	@Override
	public void getDetails() {
		System.out.println("CurrentAccount :number :: "+number);
		System.out.println("CurrentAccount :Balance :: "+balance);
	}


}
