

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String args[]) throws IOException, InterruptedException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter number of payment:");
        int numberOfPayments = Integer.parseInt(reader.readLine());
        
        System.out.println("Enter all the payment details");
        CreditCardProcessingThread cc=new CreditCardProcessingThread();
        ChequeProcessingThread cheq=new ChequeProcessingThread();
        List<ChequeProcessingThread> cheqlist=new ArrayList<ChequeProcessingThread>();
        List<CreditCardProcessingThread> cclist=new ArrayList<CreditCardProcessingThread>();
        
        
        for(int i=0;i<numberOfPayments;i++) {
            String s=reader.readLine();
            if(s.contains("CHEQ")){
            	cheq.addCheque(s);
            	cheqlist.add(new ChequeProcessingThread(Integer.parseInt(s.split(",")[0]), Integer.parseInt(s.split(",")[1]), s.split(",")[2]));
            	
            	ChequeProcessingThread ch=new ChequeProcessingThread(cheq.getQueue());
            	Thread t1=new Thread(ch);
            	t1.start();
            	
            }
            else if(s.contains("CC")){
            	cc.addCreditCard(s);
            	cclist.add(new CreditCardProcessingThread(Integer.parseInt(s.split(",")[0]), Integer.parseInt(s.split(",")[1]), s.split(",")[2]));
            	CreditCardProcessingThread c=new CreditCardProcessingThread(cc.getQueue());
            	Thread t2=new Thread(c);
            	t2.start();
            }
        }
        
        /*ChequeProcessingThread ch=new ChequeProcessingThread(cheq.getQueue());
        CreditCardProcessingThread c=new CreditCardProcessingThread(cc.getQueue());
        Thread t1=new Thread(ch);
        Thread t2=new Thread(c);
        t1.start();
        t2.start();*/
        
        
        
        
        
       
        
	
    }
    
}

