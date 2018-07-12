import java.util.Scanner;
import java.io.*;


public class Main {
	public static void main(String args[])throws Exception{
		Scanner sc=new Scanner(System.in);
            
        System.out.println("Enter the User Details :");
        System.out.println("Enter the id :");
        int id=sc.nextInt();
        
        System.out.println("Enter the name :");
        String name=sc.next();
        
        System.out.println("Enter the username :");
        String uname=sc.next();
        
        System.out.println("Enter the password :");
        String pwd=sc.next();
        
        System.out.println("Enter the mobilenumber :");
        String no=sc.next();
        
        System.out.println("Enter the rating :");
        double rate=sc.nextDouble();
        
        
        System.out.println("User details are :");
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Username : "+uname);
        System.out.println("Mobile Number : "+no);
        System.out.println("Rating : "+rate);
	
	}
}

