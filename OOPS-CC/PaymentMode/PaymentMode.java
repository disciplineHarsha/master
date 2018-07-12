package com.encapsulation.cc;

public class PaymentMode {
	private Integer id;
	private String paymentType;
	
	public PaymentMode(){
		
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	public PaymentMode(Integer id, String paymentType) {
		super();
		this.id = id;
		this.paymentType = paymentType;
	}
	
	
	
	
}
