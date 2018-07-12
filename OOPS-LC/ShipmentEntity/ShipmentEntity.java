public class ShipmentEntity {//super class
    protected String shipmentEntityName;
	protected String identificationNumber;
	
	ShipmentEntity(){
		
	}
	
	
	ShipmentEntity(String shipmentEntityName,String identificationNumber){
		this.setShipmentEntityName(shipmentEntityName);
		this.setIdentificationNumber(identificationNumber);
	}
	
	
	
	
	
	public String getShipmentEntityName(){
		
		return this.shipmentEntityName;
	}
	
	public void setShipmentEntityName(String shipmentEntityName){
		this.shipmentEntityName=shipmentEntityName;
	}
	
	
	public String getIdentificationNumber(){
		
		return this.identificationNumber;
	}
	
	public void setIdentificationNumber(String identificationNumber){
		this.identificationNumber=identificationNumber;
	}
	
	void display() {
		
	}
	
	
	
	
	
}

