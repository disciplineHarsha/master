package com.encapsulation.cc1;


public class InvoiceLine {
    
   Item item;
   Integer quantity;
   Double amount; 
   
    InvoiceLine(){}
InvoiceLine(Item item,Integer quantity,Double amount){
   this.item = item;
   this.quantity = quantity;
   this.amount = amount;    
}


void setItem(Item item){
    this.item = item;
}
Item getItem(){
    return item;
}


void setQuantity(Integer quantity){
    this.quantity = quantity;
}
Integer getQuantity(){
    return quantity;
}


void setAmount(Double amount){
    this.amount = amount;
}
Double getAmount(){
    return amount;
}

public InvoiceLine createInvoiceLine(Item item,Integer quantity,Double amount){
	InvoiceLine inlObject= new InvoiceLine(item,quantity,amount);
	
	return inlObject;
}


  
}
