package com.encapsulation.cc;

import java.io.*;
public class Main {
	public static void main(String args[])throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the payment details :");
		String paymentDetails[] = buf.readLine().split(",");
		PaymentBO paymentBo = new PaymentBO();
		
		Payment payment = new Payment(paymentDetails[0],Double.parseDouble(paymentDetails[1]),new PaymentMode(1,paymentDetails[2]));
		if(payment.getPaymentMode().getPaymentType().equals("Credit")){
			   System.out.println("Enter the credit card details");
			   System.out.println("Enter the card number :");
			   String cardNumber = buf.readLine();
			   System.out.println("Enter the card name :");
			   String cardName = buf.readLine();
			   if(paymentBo.validateCreditCard(new CreditCard(cardNumber,cardName)))
				   System.out.println("Valid credit card");
			   else
				   System.out.println("Invalid credit card");
		}
		else {
			   System.out.println("Enter the cheque details");
			   System.out.println("Enter the bank name :");
			   String bankName = buf.readLine();
			   System.out.println("Enter the cheque number :");
			   String chequeNumber = buf.readLine();
			   if(paymentBo.validateCheque(new Cheque(bankName, chequeNumber)))
				   System.out.println("Valid cheque");
			   else
				   System.out.println("Invalid cheque");
		}
	}
}
