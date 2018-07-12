package com.string.cc1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;



public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of customer details");
		int no=Integer.parseInt(br.readLine());
		System.out.println("Enter the number of customer details");
		String[] customer=new String[no];
		
		for(int i=0;i<customer.length;i++){
			customer[i]=br.readLine();
			
		}		
		
			String[] split=customer[0].split(",");
			double  highest=Double.parseDouble(split[1]);//assuming the highest number
			String dat="";
			
				for(int j=0;j<customer.length;j++){
					String[] s=customer[j].split(",");
					
					if(highest<Double.parseDouble(s[1])){//comparing the number with the assumed highest number
						highest=Double.parseDouble(s[1]);//if condition satisified  than reassign the highest variable.
						
					}
					
				}
				
				for(int i=0;i<customer.length;i++){
					String[] sp=customer[i].split(",");
					
					if(highest==Double.parseDouble(sp[1])){
						dat=sp[2];//now taking the date based on the highest number
						
					}
					
				}
				
				Date date=new SimpleDateFormat("dd-MM-yyyy").parse(dat);//using the simple date format parse the date
				
				Calendar cl = Calendar. getInstance();//create the instance of the calender 			
				cl.setTime(date);//set the formated date to Calender
				
				System.out.println(cl.get(Calendar.WEEK_OF_MONTH));//using the calender object use get method s
				System.out.println(cl.get(Calendar.WEEK_OF_YEAR) ); 	
		

	}

}
