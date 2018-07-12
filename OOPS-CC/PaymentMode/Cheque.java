package com.encapsulation.cc;

public class Cheque {
	private String bankName;
	private String chequeNumber;
	
	public Cheque(){
		
	}
	
	public Cheque(String bankName, String chequeNumber) {
		super();
		this.bankName = bankName;
		this.chequeNumber = chequeNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getChequeNumber() {
		return chequeNumber;
	}
	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}
	
	public Cheque createCheque(String bankName,String chequeNumber){
		Cheque ch=new Cheque(bankName, chequeNumber);
		
		return ch;
		
	}


	
	

}
