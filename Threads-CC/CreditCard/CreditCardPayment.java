package com.multithread.cc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardPayment extends Thread{
    
    private Long invoiceNumber;
    private String cardNumber;
    private Double amount;
    private List<CreditCardPayment> cl=new ArrayList<CreditCardPayment>();
    
    public Long getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(Long invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public CreditCardPayment(Long invoiceNumber,String cardNumber,Double amount) {
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
        this.cardNumber = cardNumber;
    }
	
	
    
    public CreditCardPayment(List<CreditCardPayment> cl) {
		super();
		this.cl = cl;
	}

	public void run() {
		Iterator<CreditCardPayment> ite=cl.iterator();
    	try {
			Thread.sleep(200);
		//	while(ite.hasNext()){
				String w=this.getCardNumber();
	    		Pattern p=Pattern.compile("\\d*5{3}");
	    		Matcher m=p.matcher(w);
	    		
	    		
	    		if(m.find()){
	    			System.out.println("Oops! Payment processing failed using the credit card number "+w);
	    			
	    		}
	    		else {
	    			System.out.println("Payment processing completed using Credit Card");
	    		}
			//}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
       
        
        
    }
}

