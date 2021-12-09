package com.tushar;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.tushar.beans.GooglePay;
import com.tushar.beans.Payment;
import com.tushar.beans.Paytm;
import com.tushar.beans.PhonePay;
import com.tushar.beans.TransferBalance;

public class TestApp 
{
    public static void main( String[] args )
    {
        System.out.println( "-----Application Started--------" );
        DefaultListableBeanFactory  factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions("com/tushar/cfg/ApplicationContext.xml");
        TransferBalance balanceTransfer = factory.getBean("transferBalance",TransferBalance.class);
        Payment paymentMode =null; 
        System.out.println( "Payment Modes::\n1)GooglePay \n2)PhonePay \n2)Paytm" );
        System.out.println( "Enter Payment Mode number::" );
        Scanner sc = new Scanner(System.in);
        int modeNum = sc.nextInt();
        if(1==modeNum)
        paymentMode=  factory.getBean("GPay",GooglePay.class);
        else if(2==modeNum)
        paymentMode=  factory.getBean("PPay",PhonePay.class);
        else if(3==modeNum)
        paymentMode=  factory.getBean("paytm",Paytm.class);
        else {
        System.out.println( "Invalid Payment Mode. Try again" );
        System.exit(0);
        }
        balanceTransfer.setPayment(paymentMode);
        
        int amt=500;
        long acc1=1234L;
        double acc1Bal=602;
        long acc2=5467L;
        double acc2Bal=0;
        balanceTransfer.transferBalance(amt, acc1, acc2, acc1Bal, acc2Bal);
        System.out.println( "-----Application Completed--------" );
    }
}
