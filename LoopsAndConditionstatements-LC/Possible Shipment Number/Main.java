import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the range for shipment numbers :");
        int start=sc.nextInt();
        int end=sc.nextInt();
        System.out.println("Possible shipment numbers :");
          
            for(int i=start;i<=end;i++){
                boolean flag = true;
                
                while(i!=0){
                  
                   if((i%10)%3!=0){
                       flag=false;
                       break;
                   }
                   
                     i/=10;                   
                }
              
                if(true){
                
                    System.out.println(i);
                }                        
            }
            
            
            
        
	}
}