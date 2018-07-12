package com.collection.cc;

public class ShipmentEntity implements Comparable<ShipmentEntity> {
    
    private Integer id;
    private String name;
    private String accountNumber;
    private String identificationNumber;

   
    public ShipmentEntity(Integer id, String name, String accountNumber, String identificationNumber) {
		super();
		this.id = id;
		this.name = name;
		this.accountNumber = accountNumber;
		this.identificationNumber = identificationNumber;
	}



	public ShipmentEntity() {
		// TODO Auto-generated constructor stub
	}

	

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

	@Override
	public int compareTo(ShipmentEntity shipmentEntity) {
		
		return this.getAccountNumber().compareTo(shipmentEntity.getAccountNumber());
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}



	public String getIdentificationNumber() {
		return identificationNumber;
	}



	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}



	public String toString(){
		
		return String.format("%-15s %-15s %-15s %s",this.getId(),this.getName(),this.getAccountNumber(),this.getIdentificationNumber());
	}

  
    
}
