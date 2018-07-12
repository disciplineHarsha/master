public class CompanyShipment extends Shipment{
    
    private Double luxuryTax;
    private Double corporateTax;
    private Double totalAmount;
    
	public CompanyShipment() {
	//	super();
		// TODO Auto-generated constructor stub
	}
	public CompanyShipment(String name, String source, String destination, Double price,double luxuryTax,double corporateTax) {
		super(name, source, destination, price);
		this.luxuryTax=luxuryTax;
		this.corporateTax=corporateTax;
	}
    
    
    
    
    public double getLuxuryTax() {
        return luxuryTax;
    }

    public void setLuxuryTax(double luxuryTax) {
        this.luxuryTax = luxuryTax;
    }

    public Double getCorporateTax() {
        return corporateTax;
    }

    public void setCorporateTax(double corporateTax) {
        this.corporateTax = corporateTax;
    }
    
    @Override
    double calculateShipmentAmount()
    {
        double luxuryAmount =((this.getPrice()*this.getLuxuryTax())/100);
    		double coroprateAmount=((this.getPrice()*this.getCorporateTax())/100);
			totalAmount =luxuryAmount+coroprateAmount;
			
			return this.getPrice()+this.totalAmount;
    }
    
}
