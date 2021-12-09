package com.tushar.beans;

public class PhonePay implements Payment {
	
	int charges=2;
	int success =1;
	int fail =0;
	int insufficientAcc1Bal =3;
	boolean bFlag=false;
	
	@Override
	public int doPayment(double amt, long acc1, long acc2, double acc1Bal, double acc2Bal) {
		System.out.println("PhonePay.doPayment()");
		
		if(acc1Bal-(amt+charges) >=0)
		{
			System.out.println("Account1 Balance::"+acc1Bal);	
			System.out.println("Account2 Balance::"+acc2Bal);
			acc2Bal =acc2Bal+amt;
			acc1Bal =acc1Bal-(amt+charges);
			System.out.println("Updated Account1 Balance::"+acc1Bal);
			System.out.println("Updated Account2 Balance::"+acc2Bal);
			bFlag=true;
		if(bFlag){
			return  success;	
		}
		else {
			return  fail;
		}
	}//	if(acc1Bal-(amt+charges) >0)
		else 
			return  insufficientAcc1Bal;
	}
	
}
