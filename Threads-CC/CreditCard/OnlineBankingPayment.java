package com.multithread.cc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OnlineBankingPayment implements Runnable
{

   private  Long invoiceNumber;
    private String accountNumber;
   private  Double amount;
    
    public Long getInvoiceNumber() {
	return invoiceNumber;
}

public void setInvoiceNumber(Long invoiceNumber) {
	this.invoiceNumber = invoiceNumber;
}

public String getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}

public Double getAmount() {
	return amount;
}

public void setAmount(Double amount) {
	this.amount = amount;
}

	private List<OnlineBankingPayment> ol=new ArrayList<OnlineBankingPayment>();
    
    
    public OnlineBankingPayment(Long invoiceNumber,String accountNumber,Double amount) {
        this.invoiceNumber = invoiceNumber;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
    
	public OnlineBankingPayment(List<OnlineBankingPayment> ol) {
        this.ol=ol;
    }
	
    public void run() {
    	Iterator<OnlineBankingPayment> ite=ol.iterator();
    	try {
			//Thread.sleep(200);
		//	while(ite.hasNext()){
				String w=this.getAccountNumber();
	    		Pattern p=Pattern.compile("\\d*5{3}\\d");
	    		Matcher m=p.matcher(w);
	    		
	    		
	    		if(m.find()){
	    			System.out.println("Oops! Payment processing failed using the online banking account number "+w);
	    			
	    		}
	    		else {
	    			System.out.println("Payment processing completed using Online banking");
	    		}
		//	}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



        
    }
    
}

