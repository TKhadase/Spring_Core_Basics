package com.tushar.beans;

import java.util.Random;

public class AccountFactory {

	public static BankAccount getAccount(String type) {
		
		if("S".equalsIgnoreCase(type)) 
			return new SavingAccount(70500.2, Long.valueOf( new Random().nextInt(100000)));
		
		 if("C".equalsIgnoreCase(type)) 
			return new CurrentAccount(20500.2, Long.valueOf( new Random().nextInt(100000)));
		 else
			 throw new IllegalArgumentException("Invalid Account type::"+type);
	
	}
	
}
