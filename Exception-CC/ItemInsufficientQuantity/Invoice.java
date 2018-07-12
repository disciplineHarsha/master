package com.exception.cc1;


public class Invoice {
	int id;
	String createdBy;
	String customerName;
	InvoiceLine[] invoiceLine;
	
	
	
	public Invoice(int id, String createdBy, String customerName) {
		super();
		this.id = id;
		this.createdBy = createdBy;
		this.customerName = customerName;
	}
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	public InvoiceLine[] getInvoiceLine() {
		return invoiceLine;
	}

	public void setInvoiceLine(InvoiceLine[] invoiceLine) {
		this.invoiceLine = invoiceLine;
	}

}
