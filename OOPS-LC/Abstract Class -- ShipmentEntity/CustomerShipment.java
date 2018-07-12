
public class CustomerShipment extends ShipmentEntity{
	private Double referalFee;
    private Double shipmentCost;
	
    
    
    public CustomerShipment(){
    	super();
	}
	public CustomerShipment(String name, Double weight, Integer quantity, Double transferCost,
			Double maxShipmentCapacity, Double referalFee) {
		super(name,weight,quantity,transferCost,maxShipmentCapacity);
    	this.referalFee=referalFee;
	}

	public Double getReferalFee() {
		return referalFee;
	}

	public void setReferalFee(Double referalFee) {
		this.referalFee = referalFee;
	}

	public void calculateCost(){
		shipmentCost=(super.getTransferCost()*super.getWeight()*super.getQuantity())+this.getReferalFee();
    	System.out.println("Cost for the shipment is "+shipmentCost);
	}
	
	public void operatingCapacity(){
		if(this.shipmentCost<(super.getWeight()*super.getQuantity()*super.getMaxShipmentCapacity())){
    		System.out.println("The shipment is within the shipping capacity of the agent");
		}
		else{
			System.out.println("The shipment is not within the shipping capacity of the agent");
		}
	}
}