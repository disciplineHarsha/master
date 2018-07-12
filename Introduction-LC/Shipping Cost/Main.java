//import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the shipping cost of Item 1");
        int citem1=sc.nextInt();
        
        System.out.println("Enter the shipping cost of Item 2");
        int citem2=sc.nextInt();
        
        System.out.println("Enter the shipping cost of Item 3");
        int citem3=sc.nextInt();
        
        System.out.println("Total shipping cost of items is " + (citem1+citem2+citem3));
        
        
		
	}
}

