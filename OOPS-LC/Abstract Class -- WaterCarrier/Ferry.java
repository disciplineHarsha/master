public class Ferry extends WaterCarrier {
    private Integer maxLoad;
	static String ownedBy;
	
	
	@Override
	void displayShipDetails() {

		WaterCarrier ferries=new Ferry(super.getCarrierName(), super.getCarrierCode(), super.getCarrierType(),
				super.getIataCode(), super.getCarrierAddress(), this.getMaxLoad());
		ownedBy=WaterCarrier.returnOwner(ferries);
		System.out.println(ferries);
		
	}


	public Integer getMaxLoad() {
		return maxLoad;
	}


	public void setMaxLoad(Integer maxLoad) {
		this.maxLoad = maxLoad;
	}


	public Ferry() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Ferry(String carrierName, String carrierCode, String carrierType, String iataCode, String carrierAddress,Integer maxLoad) {
		super(carrierName, carrierCode, carrierType, iataCode, carrierAddress);
		this.maxLoad=maxLoad;
		// TODO Auto-generated constructor stub
	}
	
	
	public String toString() {

		return String.format("%-20s%-15s%-15s%-15s%-15s%-25s  %s", super.getCarrierType(), super.getCarrierName(),
				super.getCarrierCode(), super.getIataCode(), super.getCarrierAddress(), this.getMaxLoad()+ " kilograms",Ferry.ownedBy);
	}

	
	
	
	
	
	
	
	
	

}
