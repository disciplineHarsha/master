import java.util.Scanner;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		String str1="100";
        String str2="101";
        String str3="110";
        String str4="011";
        String str5="001";
        String str6="010";
        String str7="111";
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the shipment code :");
        String code=sc.next();
        
        if(code.equals(str1)){
            System.out.println("Airway");
        }
        else if (code.equals(str2)){
            System.out.println("Airway and Roadway");
        }
        else if (code.equals(str3)){
            System.out.println("Airway and Waterway");
        }
        else if(code.equals(str4)){
            System.out.println("Waterway and Roadway");
        }
        else if(code.equals(str5)){
            System.out.println("Roadway");
        }
        else if(code.equals(str6)){
            System.out.println("Waterway");
        }
        else if(code.equals(str7)){
            System.out.println("All ways");
        }
        else{
            System.out.println("Invalid Input");
        }
        
            
	}
}