import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of months :");
        int months=sc.nextInt();
        int sum=0;
        if(months>0){
                        
            System.out.println("Enter the profit of each month in shipment");
                
            for(int i=0;i<months;i++){
                int profit =sc.nextInt();
                sum+=profit;
            }
            
            System.out.println("Total profit : "+sum);
        }
        else{
            System.out.println("Invalid Input");
        }
        
        
	}

}

