
public class CompanyShipment extends ShipmentEntity{
	private Integer tax;
    //private Double totalAmount;

    public CompanyShipment() {
    	// TODO Auto-generated constructor stub
	}


    public CompanyShipment(String name, Double weight, Integer quantity, Double transferCost, Double maxShipmentCapacity,
			Integer tax) {
		super(name, weight, quantity, transferCost, maxShipmentCapacity);
    	this.tax=tax;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}
	
	public void calculateCost(){
        Double amount=(super.getTransferCost()*super.getWeight()*super.getQuantity());
		Double totalAmount=((amount*this.getTax())/100);
    	    
		
		System.out.println("Cost for the shipment is "+ ((super.getTransferCost()*super.getWeight()*super.getQuantity())+totalAmount));
	}
	
	public void operatingCapacity(){
        Double amount=(super.getTransferCost()*super.getWeight()*super.getQuantity());
      //  Double maxAmount=(super.getWeight()*super.getQuantity()*super.getMaxShipmentCapacity());
      Double maxAmount=super.getTransferCost()*super.getMaxShipmentCapacity();
        Double totalAmount=((amount*this.getTax())/100);
		if((amount+totalAmount)<(maxAmount)){
    		System.out.println("The shipment is within the shipping capacity of the company");
		}
		else{
			System.out.println("The shipment is not within the shipping capacity of the company");
		}
	}    
}
