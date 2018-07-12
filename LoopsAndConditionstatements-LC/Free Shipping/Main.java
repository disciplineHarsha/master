import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the shipment number :");
        int snum=sc.nextInt();
        int num=0;
        int sum=0;
        int flag=0;
        
        for(;snum>=0;){
            int digit=snum%10;
            sum=sum+digit;
            
            snum=snum/10;
        }
        
        for(int i=2;i<=sum/2;i++){
            
            if(sum%i==0){
                flag=1;
                break;
            }
                
        }
        
        if(flag==0){
            System.out.println("Eligible for free shipping");
        }
        else{
            System.out.println("Not Eligible for free shipping");
        }
        
        
	}

}

