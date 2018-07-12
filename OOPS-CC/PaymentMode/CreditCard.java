package com.encapsulation.cc;

public class CreditCard {
	
	private String cardNumber;
	private String cardName;
	
	public CreditCard(){
		
	}
	
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public CreditCard(String cardNumber, String cardName) {
		super();
		this.cardNumber = cardNumber;
		this.cardName = cardName;
	}
	
	public CreditCard createCreditCard(String cardNumber, String cardName){
		CreditCard cc=new CreditCard(cardNumber,cardName);
		
		return cc;
	}
	
	

}
