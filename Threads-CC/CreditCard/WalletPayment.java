package com.multithread.cc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WalletPayment implements Runnable
{

    private Long invoiceNumber;
    private String mobileNumber;
    private Double amount;
 //   private List<WalletPayment> wl;
    
    public Long getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(Long invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
//
//	public WalletPayment(List<WalletPayment> wl) {
//        this.wl=wl;
//    }
//	
	
	public WalletPayment(Long invoiceNumber,String mobileNumber,Double amount) {
        this.invoiceNumber = invoiceNumber;
        this.mobileNumber = mobileNumber;
        this.amount = amount;
    }
	private List<WalletPayment> ol=new ArrayList<WalletPayment>();
    
    public void run() {
    	
    	try {
		//	Thread.sleep(200);
			
	    		String  w=this.getMobileNumber();
	    		Pattern p=Pattern.compile("\\d*5{3}");
	    		
	    		Matcher m=p.matcher(w);
	    		
	    		
	    		if(m.find()){
	    			System.out.println("Oops! Payment processing failed using the wallet mobile number "+w);
	    		}
	    		else {
	    			
	    			System.out.println("Payment processing completed using Wallet payment");
	    		}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }

       



        
    
    
}

