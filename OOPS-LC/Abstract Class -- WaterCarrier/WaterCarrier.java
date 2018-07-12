
abstract class WaterCarrier {
    protected String carrierName;
	protected String carrierCode;
	protected String carrierType;
	protected String iataCode;
	protected String carrierAddress;
	
	public WaterCarrier() {
		// TODO Auto-generated constructor stub
	}

	public WaterCarrier(String carrierName, String carrierCode, String carrierType, String iataCode,
			String carrierAddress) {
		super();
		this.carrierName = carrierName;
		this.carrierCode = carrierCode;
		this.carrierType = carrierType;
		this.iataCode = iataCode;
		this.carrierAddress = carrierAddress;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public String getCarrierCode() {
		return carrierCode;
	}

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	public String getCarrierType() {
		return carrierType;
	}

	public void setCarrierType(String carrierType) {
		this.carrierType = carrierType;
	}

	public String getIataCode() {
		return iataCode;
	}

	public void setIataCode(String iataCode) {
		this.iataCode = iataCode;
	}

	public String getCarrierAddress() {
		return carrierAddress;
	}

	public void setCarrierAddress(String carrierAddress) {
		this.carrierAddress = carrierAddress;
	}

	abstract void displayShipDetails();
	

	static WaterCarrier createShip(String carrierName, String carrierCode, String iataCode, String carrierAddress,
			String carrierType, Integer capacity) {
		WaterCarrier carrier=null;
		if (carrierType.equalsIgnoreCase("ContainerShip")) {
			
			ContainerShip container = new ContainerShip();
			container.setNoOfContainers(capacity);
			container.setCarrierAddress(carrierAddress);
			container.setCarrierCode(carrierCode);
			container.setCarrierName(carrierName);
			container.setCarrierType(carrierType);
			container.setIataCode(iataCode);

			carrier= new ContainerShip(container.getCarrierName(), container.getCarrierCode(), container.getCarrierType(),
					container.getIataCode(), container.getCarrierAddress(), container.getNoOfContainers());
		}
		else if(carrierType.equalsIgnoreCase("BulkShip")){
			BulkShip bulk=new BulkShip();
			bulk.setNoOfCargoes(capacity);
			bulk.setCarrierAddress(carrierAddress);
			bulk.setCarrierCode(carrierCode);
			bulk.setCarrierName(carrierName);
			bulk.setCarrierType(carrierType);
			bulk.setIataCode(iataCode);
			
			carrier= new BulkShip(bulk.getCarrierName(), bulk.getCarrierCode(), bulk.getCarrierType(),
					bulk.getIataCode(), bulk.getCarrierAddress(), bulk.getNoOfCargoes());
			
		}
		else {
           //if(carrierType.startsWith("Ferry"))
			Ferry ferries=new Ferry();
			ferries.setMaxLoad(capacity);
			ferries.setCarrierAddress(carrierAddress);
			ferries.setCarrierCode(carrierCode);
			ferries.setCarrierName(carrierName);
			ferries.setCarrierType(carrierType);
			ferries.setIataCode(iataCode);
			
			carrier=new Ferry(ferries.getCarrierName(), ferries.getCarrierCode(), ferries.getCarrierType(),
					ferries.getIataCode(), ferries.getCarrierAddress(), ferries.getMaxLoad());
			
		}		
		return carrier ;

	}

	static String returnOwner(WaterCarrier waterCarrier) {
		String OwnedBy="";

		
		if((waterCarrier.getCarrierType().equalsIgnoreCase("ContainerShip"))||(waterCarrier.getCarrierType().equalsIgnoreCase("BulkShip"))){
			OwnedBy="Company";
		}
		else {
           // if(waterCarrier.getCarrierType().startsWith("Ferry"))
			OwnedBy="Agent";
		}
		
		
		return OwnedBy;

	}
}
