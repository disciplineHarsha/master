package com.exception.cc1;

public class InvoiceBO {
	
	public InvoiceBO(){}
	
	public Item getItemById(Item[] itemArray,int id){
			
		for(int i=0;i<itemArray.length;i++){
			if(itemArray[i].getId()==id){
				return itemArray[i];
			}
		}
		
		return null;
		
	}
	
	public void processInvoice(Invoice invoice) throws ItemInsufficientQuantity {
		
		for(int i=0;i<invoice.getInvoiceLine().length;i++){
			if(invoice.getInvoiceLine()[i].getItem()!=null){
				if(invoice.getInvoiceLine()[i].getQuantity()<=invoice.getInvoiceLine()[i].getItem().getQuantity()){
					int quantity =invoice.getInvoiceLine()[i].getItem().getQuantity()-invoice.getInvoiceLine()[i].getQuantity();
					invoice.getInvoiceLine()[i].getItem().setQuantity(quantity);
					
					
				}
				else {
					throw new ItemInsufficientQuantity("Item Insufficient");
					
				}
			}
		}
		
		
	}
}