import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
            int nc=sc.nextInt();
	        double num=0.0;
	        String swap=" ";
	        
	        String[] flightNames=new String[nc];//creating an array of size based on nc
	        double[] srate=new double[nc];
	        
	       for(int i=0;i<nc;i++){//inserting values to string array
	            flightNames[i]=sc.next();
	            
	        }
	        
	        
	        for(int i=0;i<nc;i++){
                srate[i]=sc.nextDouble();
            }
	        
	      
	     for(int j=0;j<nc;j++) { 
	        for(int i=0;i<nc-1;i++){//sorting
	            
	            if((srate[j]<srate[i])){
	                num=srate[i];
	                srate[i]=srate[j];
	                srate[j]=num;
	                swap=flightNames[i];
	                flightNames[i]=flightNames[j];
	                flightNames[j]=swap;
	                
	            }
	            
	        }
	        
	     }  
            System.out.println("Details are :");
	        
	        for(int i=0;i<nc;i++){
	            System.out.println(flightNames[i]+" - "+srate[i]);
	        }
	       
	        
	                
        
        
	}
}

