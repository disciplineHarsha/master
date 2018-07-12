package com.encapsulation.cc1;


import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
//import sun.util.calendar.CalendarDate;

public class InvoiceBO {

	Double TotalAmount=0.0;
	Item item1=null;
   Item findItemById(Integer itemId,Item item[]){
	   for(int i=0;i<item.length;i++){
		   if(itemId == item[i].getId()){
			   item1=item[i];
		   }
		  
	   }
	   return item1;
   }    
    

  
  
 Double totalInvoiceAmount(Invoice invoice)
 {
  for(int i=0;i<invoice.getInvoiceLine().length;i++){
	  TotalAmount=TotalAmount+invoice.getInvoiceLine()[i].getAmount();
	  
  }
  
  return TotalAmount;
	 
 }
   
   
 void nextTwoRemainders(Invoice invoice){
      
      Date dt=invoice.getStartDate();
      
      SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
      
      Calendar cal = Calendar.getInstance();
      		cal.setTime(dt);;
    		  cal.add(cal.DATE,16);
    		  
    String date =sdf.format(cal.getTime());		  
    System.out.println("Due Date Remainder 1 : " +date);	
    
    
    Date dt1=invoice.getDueDate();
 
    Calendar cal1 = Calendar.getInstance();
		cal1.setTime(dt1);
	  cal1.add(cal.DATE, -15);
	  
	  String date1 =sdf.format(cal1.getTime());
	  
		  
	  System.out.println("Due Date Remainder 1 : " +date1);	

 }
 
 
 
}
