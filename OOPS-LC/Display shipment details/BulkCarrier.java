public class BulkCarrier extends WaterTransport{
    private String companyName;

    public BulkCarrier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BulkCarrier(int id, String customerName, String arrivalPort, String departurePort, float weight,
			String companyName, String capacity) {
		super(id, customerName, arrivalPort, departurePort, weight, capacity);
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	void displayDetails() {

		System.out.println(new BulkCarrier(this.getId(), this.getCustomerName(), this.getArrivalPort(),
				this.getDeparturePort(), this.getWeight(), this.getCompanyName(), this.getCapacity()));
	}
	
	public String toString(){
		
		return String.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s", this.getId(), this.getCustomerName(), this.getArrivalPort(),
				this.getDeparturePort(), this.getWeight(), this.getCompanyName(), this.getCapacity());
	}
}
