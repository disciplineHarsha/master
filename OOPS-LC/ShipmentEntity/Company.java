
public class Company extends ShipmentEntity{
    private String identifier;
    private String iata;
    private String fmc;
	
    
    Company(){
    	
    }
    public Company(String shipmentEntityName, String identificationNumber,String identifier,String iata, String fmc) {
		super(shipmentEntityName, identificationNumber);
		this.identifier=identifier;
		this.iata=iata;
		this.fmc=fmc;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getIata() {
		return iata;
	}

	public void setIata(String iata) {
		this.iata = iata;
	}

	public String getFmc() {
		return fmc;
	}

	public void setFmc(String fmc) {
		this.fmc = fmc;
	}  
	
	@Override
	void display(){
		 //System.out.format("%-15s %-25s %-15s %-15s %-15s\n","Name","Identification Number","Company Name","IATA","FMC");
        System.out.println(new Company(this.getShipmentEntityName(),this.getIdentificationNumber(),this.getIdentifier(),this.getIata(),this.getFmc()));
	}
    
    public String toString() {

    	return String.format("%-15s %-25s %-15s %-15s %-15s\n", this.getShipmentEntityName(),
				this.getIdentificationNumber(),this.getIdentifier(),this.getIata(), this.getFmc());
	}
    
    
    
}
