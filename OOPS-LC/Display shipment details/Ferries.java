public class Ferries extends WaterTransport{
    private String agentName;
    
	public Ferries() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ferries(int id, String customerName, String arrivalPort, String departurePort, float weight,
			String agentName, String capacity) {
		super(id, customerName, arrivalPort, departurePort, weight, capacity);
		this.agentName = agentName;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	
	@Override
	void displayDetails() {

		System.out.println(new BulkCarrier(this.getId(), this.getCustomerName(), this.getArrivalPort(),
				this.getDeparturePort(), this.getWeight(), this.getAgentName(), this.getCapacity()));
	}
	
	public String toString(){
		
		return String.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s", this.getId(), this.getCustomerName(), this.getArrivalPort(),
				this.getDeparturePort(), this.getWeight(), this.getAgentName(), this.getCapacity());
	}
	
}
