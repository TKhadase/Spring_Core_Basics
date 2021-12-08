package com.tushar.beans;

import java.util.Date;

public class MessageGenerator {

	private Date date;
	
	public void setDate(Date date) {
		this.date=date;
	}
	
	public String generateMessgae() {
		String msg="";
		int hours =date.getHours();
		if(hours<12) {
			 msg="Good Morning";
		}
		else if(hours<16) {
			 msg="Good Afternoon";
		}
		else if(hours<20) {
			 msg="Good Evening";
		}
		else   {
			 msg="Good Night";
		}
		return msg;
	}
	
}
