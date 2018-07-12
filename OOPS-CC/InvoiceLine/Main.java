package com.encapsulation.cc1;

import java.awt.event.ItemEvent;
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {

	public static void main(String args[]) throws IOException, ParseException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		Item item[] = new Item[10];
		

		System.out.println("Item details");

		item[0] = new Item(111, "Laptop", 28000.00);
		item[1] = new Item(112, "Headset", 900.00);
		item[2] = new Item(113, "Watch", 3000.00);
		item[3] = new Item(114, "Fan", 5000.00);
		item[4] = new Item(211, "Keyboard", 4000.00);
		item[5] = new Item(212, "Mouse", 300.00);
		item[6] = new Item(311, "Mike", 2000.00);
		item[7] = new Item(313, "PC", 25000.00);
		item[8] = new Item(314, "Inverter", 11000.00);
		item[9] = new Item(315, "TV", 30000.00);

		InvoiceBO invoiceBO = new InvoiceBO();
		System.out.format("%-15s %-15s %-15s\n", "Item id", "Item name", "Item price");

		for (int i = 0; i < 9; i++) {

			System.out.format("%-15s %-15s %-15s\n", item[i].getId(), item[i].getName(), item[i].getPrice());
		}

		Invoice inv = new Invoice();
		System.out.println("Enter invoice details");
				
		String invdetails=br.readLine();
		
		String[] invSplitValues=invdetails.split(",");
		inv.setId(Integer.parseInt(invSplitValues[0]));
		inv.setRaisedBy(invSplitValues[1]);
		inv.setcCustomerName(invSplitValues[2]);
		Date start = new SimpleDateFormat("dd-MM-yyyy").parse(invSplitValues[3]);
		inv.setStartDate(start);
		Date due = new SimpleDateFormat("dd-MM-yyyy").parse(invSplitValues[4]);
		inv.setDueDate(due);
		
		Invoice invObject = new Invoice(inv.getId(), inv.getRaisedBy(), inv.getCustomerName(), inv.getStartDate(),
				inv.getDueDate());

		InvoiceLine inl = new InvoiceLine();

		System.out.println("Enter number of invoice line");
		int n = Integer.parseInt(br.readLine());

		InvoiceLine[] invoiceLine = new InvoiceLine[n];
		Item finalItem=null;

		for (int i = 0; i < invoiceLine.length; i++) {
			System.out.println("Enter the invoice line " + (i + 1) + " details");
			
			String s = br.readLine();

			String[] temp = s.split(",");

			inl.setQuantity(Integer.parseInt(temp[1]));                                                                  
																															/*	for (int j = 0; i < item.length; j++) {
																															if ((item[j].getId()).equals(temp[0])) {
																																inl.setItem(item[j]);
																																inl.setAmount(item[j].getPrice() * Integer.parseInt(temp[1]));
																															}
																															
																													}*/
			finalItem=invoiceBO.findItemById(Integer.parseInt(temp[0]), item);
			inl.setItem(finalItem);
			inl.setAmount(finalItem.getPrice()*inl.getQuantity());

			invoiceLine[i] = inl.createInvoiceLine(inl.getItem(), inl.getQuantity(), inl.getAmount());

		}

		inv.setInvoiceLine(invoiceLine);
		System.out.format("%-15s %-15s  %-15s %-15s %-15s\n","Invoice Id","Item Name","Quantity","Price","Total Amount");
		
		for(int j=0;j<n;j++){
			System.out.format("%-15s %-15s  %-15s %-15s %-15s\n",invObject.getId(),invoiceLine[j].getItem(),invoiceLine[j].getQuantity(),item[j].getPrice(),invoiceLine[j].getAmount());
			
		}
		
	
		
		System.out.println("Total Amount    "+invoiceBO.totalInvoiceAmount(inv));
		
		invoiceBO.nextTwoRemainders(inv);

	}
}
