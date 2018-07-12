import java.util.Scanner;
import java.io.*;


public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of shipments per month :");
        int ns=sc.nextInt();
        
        if(ns>20){
            System.out.println("Valuable customer");
        }
        else if(ns<0){
            System.out.println("Invalid Input");
        }
        else {
            System.out.println("Not a valuable customer");
        }
        
	}
}