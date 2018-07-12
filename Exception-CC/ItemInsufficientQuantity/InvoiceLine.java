package com.exception.cc1;

public class InvoiceLine {
	Item item;
 Invoice invoice;
 int quantity;
    
	public InvoiceLine(){}
 
 public InvoiceLine(Item item, Invoice invoice, int quantity) {
		super();
		this.item = item;
		this.invoice = invoice;
		this.quantity = quantity;
	}
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
    
    
}
