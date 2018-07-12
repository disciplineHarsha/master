package com.exception.cc1;

import java.awt.ItemSelectable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException, ItemInsufficientQuantity {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*Invoice details*/
		Invoice invoice = new Invoice(1,"Raj","Stella");
		InvoiceLine invoiceLine=new InvoiceLine();
		InvoiceBO iBO=new InvoiceBO();
		Item item=null;
		
		/*Item details*/
		Item[] itemArray = new Item[10];
		itemArray[0] = new Item(1,"Laptop",40000,4);
		itemArray[1] = new Item(2,"Computer",35000,10);
		itemArray[2] = new Item(3,"Mouse",250,250);
		itemArray[3] = new Item(4,"Key Board",2000,50);
		itemArray[4] = new Item(5,"CPU",15000,10);
		itemArray[5] = new Item(6,"Speaker",15000,2);
		itemArray[6] = new Item(7,"FM Radio",1500,5);
		itemArray[7] = new Item(8,"Cell Phone",6999,10);
		itemArray[8] = new Item(9,"Dell Laptop Charger",3500,20);
		itemArray[9] = new Item(10,"Camera",50000,10);
		
		/*Printing the item details available in ware house*/
		System.out.println("The available item details before purchase");
		int i;
		 System.out.format("%-15s %-25s %-15s\n","Id","Name","Available Quantity");
		for(i=0;i<itemArray.length;i++){
			System.out.format("%-15s %-25s %-15s\n",itemArray[i].getId(),itemArray[i].getName(),itemArray[i].getQuantity());
		}
		
		System.out.println("Enter the number of items you want to purchase :");
		int n=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the item details [itemId,quantity]");
		String[] s=new String[n];
		InvoiceLine[] invoiceLineArray=new InvoiceLine[n];
		
		for(int j=0;j<n;j++){
			System.out.println("Enter the item details "+(j+1)+":");
			s[j]=br.readLine();
			
		}
		
		for(int j=0;j<s.length;j++){
			String[] itemDetails=s[j].split(",");
			invoiceLine.setQuantity(Integer.parseInt(itemDetails[1]));
			item=iBO.getItemById(itemArray, Integer.parseInt(itemDetails[0]));
			if(item!=null){
				invoiceLineArray[j]=new InvoiceLine(item,invoice,invoiceLine.getQuantity());
			}
		}
		
		invoice.setInvoiceLine(invoiceLineArray);
		
		try{
			iBO.processInvoice(invoice);
			System.out.println("The available item details after purchase");
			System.out.format("%-15s %-25s %-15s\n","Id","Name","Available Quantity");
			for(i=0;i<itemArray.length;i++){
				System.out.println(itemArray[i]);
			}
		}
		catch(ItemInsufficientQuantity e){
			System.out.println("Exception occurred: ItemInsufficientQuantity: Item "+e.getMessage());
		}
	
	}

}

