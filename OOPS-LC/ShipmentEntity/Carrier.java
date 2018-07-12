
public class Carrier extends ShipmentEntity {
    private String carrierCode;
	private   String iata;
	
	
	Carrier(){}
	
	public Carrier(String shipmentEntityName, String identificationNumber,String carrierCode,String iata) {
		super(shipmentEntityName, identificationNumber);
		this.carrierCode=carrierCode;
		this.iata=iata;
	}
	public String getCarrierCode() {
		return carrierCode;
	}
	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}
	public String getIata() {
		return iata;
	}
	public void setIata(String iata) {
		this.iata = iata;
	}
	
	@Override
	void display(){
		//System.out.format("%-15s %-25s %-15s %-15s\n","Name","Identification Number","Code Name","IATA");
        System.out.println(new Carrier(this.getShipmentEntityName(),this.getIdentificationNumber(),this.getCarrierCode(),this.getIata()));
	}
	
    public String toString() {

    	return String.format("%-15s %-25s %-15s %-15s\n", this.getShipmentEntityName(),
				this.getIdentificationNumber(), this.getCarrierCode(), this.getIata());
	}
	
	

}