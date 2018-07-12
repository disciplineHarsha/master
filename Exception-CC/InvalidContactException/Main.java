package com.exception.cc2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
public class Main {
	public static void main(String arg[])throws IOException 
	{
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  Contact c=new Contact();
	  System.out.println("CONTACT DETAILS");
	  System.out.println("Enter the name:");
	  String name=br.readLine();
	  
	  System.out.println("Enter the street name :");
	  String street=br.readLine();
	  System.out.println("Enter the address :");
	  String address=br.readLine();
	  
	  System.out.println("Enter the city :");
	  String city=br.readLine();
	  
	  System.out.println("Enter the state :");
	  String state=br.readLine();
	  
	  System.out.println("Enter the phone number :");
	  String no=br.readLine();
	  
	  System.out.println("Enter the email id :");
	  String email=br.readLine();
	  
	  
	  
	  
	}

}