import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int count=0;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the total number of months");
        int tmonths=sc.nextInt();
        if(tmonths<0){
            System.out.println("Invalid Input");
        }
        else{
            System.out.println("Enter the profit amount of shipment in each month");
            
            for(int i=0;i<tmonths;i++){
                
                double profits=sc.nextDouble();
                
                if(profits>100000){
                    count++;
                }
            }
            System.out.println("Profit value has exceeded Rs. 100000 for " +count+ " month(s).");
        }
	}

}

