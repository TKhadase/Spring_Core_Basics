package com.tushar;


import com.tushar.beans.AccountFactory;
import com.tushar.beans.BankAccount;

public class TestApp 
{
    public static void main( String[] args )
    {
        System.out.println( "-----Application Started--------" );
        
        BankAccount account1 = AccountFactory.getAccount("S");
        account1.getDetails();
        BankAccount account2 = AccountFactory.getAccount("C");
        account2.getDetails();
        System.out.println( "-----Application Completed--------" );
    }
}
