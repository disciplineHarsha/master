import java.io.*;
import java.util.Scanner;
public class Main {
 public static void main(String[] args){    
    Scanner sc= new Scanner(System.in);
    
   Port po=new Port();
   //Port po=new Port(0, "null", "null");
    	
		
	    System.out.println("Enter the number of ports");
	    int np=sc.nextInt();
	    
	    Port[] p=new Port[np];
	    
	    for(int i=0;i<np;i++){
	        System.out.println("Enter the port"+(i+1)+" details");
	        po.setId(sc.nextInt());
	        sc.nextLine();
	        po.setName(sc.nextLine());
	        	          
	        System.out.println("Is the port from same country[Y/N]");
	        String sameCountry=sc.next();
	        
	        if(sameCountry.equalsIgnoreCase("N")){
	        	System.out.println("Enter the country");
	        	sc.nextLine();
	        	po.setCountry(sc.nextLine());
	        	p[i]=Port.CreateNewPort(po.getId(), po.getName(), po.getCountry());
	        	
	        }else{
	        	
                //po.setCountry("India");
	        	//p[i]=Port.CreateNewPort(po.getId(), po.getName(),po.getCountry());
                p[i]=Port.CreateNewPort(po.getId(), po.getName());
	        }
	              
	        
	    }
	    
	    System.out.println("The port details are");
	    System.out.format("%-15s %-15s %-15s\n", "Id", "Name", "Country");
	    
	    for(int i=0;i<p.length;i++){
	    	System.out.println(p[i]);
	    }
	    
	    sc.close();
    
    
   
    }    
}
