import java.util.Scanner;
import java.io.*;

public class Main {
	public static void main(String args[]) throws Exception{
		try{
            Scanner sc=new Scanner(System.in);
            int index=0;
            boolean flag=true;
            
            System.out.println("Enter the number of cargo");
        	int ncargos=sc.nextInt();
            
            
            int[] id=new int[ncargos];
            System.out.println("Enter the cargo id");
            for(int i=0;i<id.length;i++){
                id[i]=sc.nextInt();
            }
            
            
            System.out.println("Enter the number of shipment");
            int nshipment=sc.nextInt();
            
            String[] sname=new String[nshipment];
            
            System.out.println("Enter the shipment name");
            
                for(int i=0;i<sname.length;i++){
                    sname[i]=sc.next();
                }
           
            
            System.out.println("Enter the cargo id");
            int searchCargoId=sc.nextInt();
            
            for(int i=0;i<id.length;i++){
                	if(searchCargoId==id[i]){
    	        		index=i;
    	        		break;
    	        	}
    	        }
    	        
    	        
    	        for(int i=0;i<sname.length;i++){
    	           if(index==i){
    	        	 System.out.println(sname[i]);
    	             break;  
    	            }
    	           else{
    	        	   flag=false;
    	           }
    	                  
    	            
    	        }
    	        
    	        if(flag==false){
    	        	System.out.println("yet to be shipped");
    	        }           
        
		}
        catch(Exception e){
            
        }
        
    
	}
}

