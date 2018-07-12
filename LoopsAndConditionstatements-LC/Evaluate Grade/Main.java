import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the total number of countries :");
        int totalCountries=sc.nextInt();
        
        System.out.println("Enter the total number of shipment per month :");
        int totalShipment=sc.nextInt();
        
        if(totalCountries>150 && totalShipment>1500){
            System.out.println("The company grade is : A");
        }
        else if (totalCountries>125 && totalShipment>1200){
            System.out.println("The company grade is : B");
        }
        else if (totalCountries>100 && totalShipment>1000){
            System.out.println("The company grade is : C");
        }
        else if (totalCountries>75 && totalShipment>700){
            System.out.println("The company grade is : D");
        }
        else if (totalCountries<=75 && totalCountries>=0 && totalShipment<=700 && totalShipment>=0 ){
            System.out.println("The company grade is : E");
        }
        else {
            System.out.println("Invalid Input");
            
        }
        
     
        
        
		
		
    }
    
}
