public class ContainerShip extends WaterCarrier {
    private Integer noOfContainers;
	static String ownedBy;
	//ContainerShips container=new ContainerShips(super.getCarrierType(), super.getCarrierName(),
		//		super.getCarrierCode(), super.getIataCode(), super.getCarrierAddress(), this.noOfContainers);
	
	
	/*WaterCarrier container=new ContainerShips(super.getCarrierName(), super.getCarrierCode(), super.getCarrierType(),
			super.getIataCode(), super.getCarrierAddress(), this.getNoOfContainers());*/
	@Override
	void displayShipDetails() {
		
		WaterCarrier container=new ContainerShip(super.getCarrierName(), super.getCarrierCode(), super.getCarrierType(),
				super.getIataCode(), super.getCarrierAddress(), this.getNoOfContainers());
		ownedBy=WaterCarrier.returnOwner(container);
		System.out.println(container);
	}

	public ContainerShip() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContainerShip(String carrierName, String carrierCode, String carrierType, String iataCode,
			String carrierAddress, Integer noOfContainers) {
		super(carrierName, carrierCode, carrierType, iataCode, carrierAddress);
		this.noOfContainers = noOfContainers;
		// TODO Auto-generated constructor stub
	}

	public Integer getNoOfContainers() {
		return noOfContainers;
	}

	public void setNoOfContainers(Integer noOfContainers) {
		this.noOfContainers = noOfContainers;
	}
	
	

	public String toString() {

		return String.format("%-20s%-15s%-15s%-15s%-15s%-25s %s", super.getCarrierType(), super.getCarrierName(),
				super.getCarrierCode(), super.getIataCode(), super.getCarrierAddress(), this.getNoOfContainers()+ " containers             ",ContainerShip.ownedBy);
	}

}