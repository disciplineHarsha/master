public class AgentShipment extends Shipment{
    private Double referalFee;

	public AgentShipment() {//understand this ??
    	super();
		// TODO Auto-generated constructor stub
	}	
 	
     
     public AgentShipment(String name, String source, String destination, Double price,Double referalFee) {
		super(name, source, destination, price);
		this.referalFee=referalFee;
		
	}

	public Double getReferalFee() {
		return referalFee;
	}

	public void setReferalFee(Double referalFee) {
		this.referalFee = referalFee;
	}
	
	@Override
	double calculateShipmentAmount(){
		
		
		return (this.getPrice()+this.getReferalFee());
	}
	
	
}
