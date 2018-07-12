public class BulkShip extends WaterCarrier {
    private Integer noOfCargoes;
	static String owner;
	public BulkShip() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BulkShip(String carrierName, String carrierCode, String carrierType, String iataCode,
			String carrierAddress,Integer noOfcargoes) {
		super(carrierName, carrierCode, carrierType, iataCode, carrierAddress);
		this.noOfCargoes=noOfcargoes;
		// TODO Auto-generated constructor stub
	}

	public Integer getNoOfCargoes() {
		return noOfCargoes;
	}

	public void setNoOfCargoes(Integer noOfCargoes) {
		this.noOfCargoes = noOfCargoes;
	}

	@Override
	void displayShipDetails() {
		WaterCarrier bulk=new BulkShip(super.getCarrierName(), super.getCarrierCode(), super.getCarrierType(),
				super.getIataCode(), super.getCarrierAddress(), this.getNoOfCargoes());
		owner=WaterCarrier.returnOwner(bulk);
		System.out.println(bulk);
		
	}
	

	public String toString() {

		return String.format("%-20s%-15s%-15s%-15s%-15s%-25s %s", super.getCarrierType(), super.getCarrierName(),
				super.getCarrierCode(), super.getIataCode(), super.getCarrierAddress(), this.getNoOfCargoes()+ " cargoes                ",BulkShip.owner);
	}

	
	
}
