package com.tushar.beans;

public class TransferBalance {

	private Payment payment;

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	public void transferBalance(double amt, long acc1, long acc2,double acc1Bal, double acc2Bal) {
		int code = payment.doPayment( amt,  acc1,  acc2, acc1Bal,  acc2Bal);
		if(0==code ) {
			System.out.println("Balance Transfer Failed");
		}
		else if(1==code) {
			System.out.println("Balance Transfer Success");
		}
		else if(3==code) {
			System.out.println("Insufficient Balance.  Balance Transfer Failed");
		}else
			System.out.println("Internal Error. Balance Transfer Failed");
		
	}
	
	
}
