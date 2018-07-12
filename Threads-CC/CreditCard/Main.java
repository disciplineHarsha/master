package com.multithread.cc;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<WalletPayment> wlist=new ArrayList<WalletPayment>();
        List<OnlineBankingPayment> olist=new ArrayList<OnlineBankingPayment>();
        List<CreditCardPayment> clist=new ArrayList<CreditCardPayment>();
        
        
        System.out.println("Enter the number of payments:");
        int numberOfPayments = Integer.parseInt(reader.readLine());
        
        System.out.println("Enter the payment details (Invoice ID, ACC Number, Payment Amount, Payment Type)");
        List<String> input = new ArrayList<String>();
        for(int i=0;i<numberOfPayments;i++) {
            input.add(reader.readLine());
        }        

        Iterator<String> ite=input.iterator();
        while(ite.hasNext()){
        	String s=ite.next();
        	
        	if(s.split(",")[3].trim().equalsIgnoreCase("WA")){
        		wlist.add(new WalletPayment(Long.parseLong(s.split(",")[0]), s.split(",")[1], Double.parseDouble(s.split(",")[2])));
        		Thread t1=new Thread(new WalletPayment(Long.parseLong(s.split(",")[0]), s.split(",")[1], Double.parseDouble(s.split(",")[2])));
        		if(!t1.isAlive()){
        			t1.start();
        			t1.join();
        		}
        		else{
        			
        		}
        		
        	}
        	else if(s.contains("OLB")){
        		olist.add(new OnlineBankingPayment(Long.parseLong(s.split(",")[0]), s.split(",")[1], Double.parseDouble(s.split(",")[2])));
        		Thread t2=new Thread(new OnlineBankingPayment(Long.parseLong(s.split(",")[0]), s.split(",")[1], Double.parseDouble(s.split(",")[2])));
        		t2.start();
        		t2.join();
        		
        	}
        	else if(s.contains("CC")){
        		clist.add(new CreditCardPayment(Long.parseLong(s.split(",")[0]), s.split(",")[1], Double.parseDouble(s.split(",")[2])));
        		Thread t3=new Thread(new CreditCardPayment(Long.parseLong(s.split(",")[0]), s.split(",")[1], Double.parseDouble(s.split(",")[2])));
        		t3.start();
        		t3.join();
        	}
        	
        }
        
     //   WalletPayment wls=new WalletPayment(wlist);
     //   OnlineBankingPayment ols=new OnlineBankingPayment(olist);
      //  CreditCardPayment cls=new CreditCardPayment(clist);
        

  
       
        


    }
}
