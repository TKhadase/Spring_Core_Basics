package com.tushar.beans;

public class SavingAccount extends BankAccount {

	private double balance=0.0;
	private Long number=0L;
	
	public SavingAccount(double balance,  Long number) {
		this.balance = balance;
		this.number= number;
	}
	
	public SavingAccount() {
	}
	
	@Override
	public void getDetails() {
		System.out.println("SavingAccount :number :: "+number);
		System.out.println("SavingAccount :Balance :: "+balance);
	}

}
