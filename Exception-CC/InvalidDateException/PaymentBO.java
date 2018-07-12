package com.exception.cc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PaymentBO {
	
	public boolean processPayment(Cheque cheque) throws ParseException, InvalidDateException{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Boolean flag=false;
		Date fixedDate=sdf.parse("15/05/2017");
		
		if((cheque.getChequeDate()).compareTo(fixedDate)>=0){
			System.out.println(cheque.getChequeDate());
			System.out.println(fixedDate);
			flag=true;
		}
		else{
			throw new InvalidDateException("Cheque is valid only for three months");
		}
		
		return flag;
		
	}

}
	