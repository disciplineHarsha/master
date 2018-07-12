package com.exception.cc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		
		Cheque cheque=new Cheque();
		PaymentBO bo=new PaymentBO();
		
		System.out.println("Enter the cheque details\nEnter the bank name :");
		cheque.setBankName(br.readLine());
		
		System.out.println("Enter the cheque number :");
		cheque.setChequeNumber(br.readLine());
		
		try{
		System.out.println("Enter the cheque date :");
		Date date=(sdf.parse(br.readLine()));
		String strDate=sdf.format(date);
				
		
		
		cheque.setChequeDate(date);
		//System.out.println(cheque.getChequeDate().getDate());
		}
		catch(ParseException f){
			
		}
		Cheque chequeObj=new Cheque(cheque.getBankName(),cheque.getChequeNumber(),cheque.getChequeDate());
		
		try{
			if(bo.processPayment(chequeObj)){
				System.out.println("Cheque is sent to clearing house");
			}
		}
		catch(InvalidDateException e){
			System.out.println("InvalidDateException: "+e.getMessage());
		}

	}

}
