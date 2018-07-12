//import java.io.Reader.*;
import java.io.BufferedReader;
import java.text.DecimalFormat;
import java.io.InputStreamReader;



public class Main {
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the agent details");
        
        System.out.println("Enter the agent name :");
        String name = br.readLine();
        
        System.out.println("Enter the identification number :");
        String id =br.readLine();
        
        System.out.println("Enter the accountNumber :");
        String accountnumber =br.readLine();
        
        System.out.println("Enter the creditLimit :");
        String creditlimit=br.readLine();
        double value = Double.parseDouble(creditlimit);
        
        System.out.println("Agent details are");
        System.out.println("Name : "+name);
        System.out.println("Identification Number : "+id);
        System.out.println("Account Number : "+accountnumber);
        
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Credit Limit : "+ df.format(value));
        
       
        
        
		
	}
}

