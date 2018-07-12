import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of ports :");
        int numberOfPorts=sc.nextInt();
        
        System.out.println("Enter port details :");
        
        String[] id=new String[numberOfPorts];//creating an array
        
        for(int i=0;i<numberOfPorts;i++){//Storing the input in an array
            	id[i]=sc.next();
        }
        
        System.out.println("One mode of transportation :");
        
        System.out.format("%-5s%s\n","Id","Name");
        
        for(int i=0;i<id.length;i++){
	    	   int count=0;
	           String[] pd=id[i].split("\\|",-3);
		           
	            	 
		       	for(int j=2;j<=4;j++){
		            	
		       		String split=pd[j];
		               	
		            if(split.contains("1")){
		               		count++;
		            }
	            }
		            
		        if(count==1){
		        	for(int k=0;k<=1;k++){
	                    	
		        		System.out.printf("%-5s%s\n",pd[k]);
	            			
	            	}
	            		System.out.println();
		        }
		        
		        if(count==0){
		        	
		           	System.out.println("No such transportation available");
		                      		
		        }
		        		        
		         
                      
        }
       
       System.out.println("More than one mode of transportation :");
       
       System.out.format("%-5s%s\n","Id","Name");
       
       for(int i=0;i<id.length;i++){
		   	   int count=0;
		       String[] pd=id[i].split("\\|");
	           
           	 
	           for(int j=2;j<=4;j++){
	            	String split=pd[j];
	               	
	            	if(split.contains("1")){
	            		count++;
	               	}
	           }
	           
	           if(count>1){
	           		for(int k=0;k<=1;k++){
	                  System.out.print(pd[k] + "  ");
	           		}
	           		System.out.println();
		       } 
	           if(count==0){
		        	
		           	System.out.println("No such transportation available");
		                      		
		        }
		        	
	           
       }
        
        
        
        
	}
}

