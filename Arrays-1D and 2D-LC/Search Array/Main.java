import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int nc=sc.nextInt();
        
       
        String[] customers=new String[nc];
        
        sc.nextLine();
        for(int i=0;i<customers.length;i++){
            customers[i]=sc.nextLine();
            
        }
        
        //sc.next();
        System.out.println("Enter the name you want to search");
        String name=sc.next();
        //System.out.println(name);
       
        boolean flag=false;
        
        for(int i=0;i<customers.length;i++){
             
        	 
            if(customers[i].equalsIgnoreCase(name)){
            	flag=true;
            	break;
            } 
            
           
            	
            
        }
        
      if(flag){
            System.out.println(name+" "+"found!");
        }
        else{
            System.out.println(name+" "+"not found");
        }
        
        
	}

}

