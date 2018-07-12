
public class Rail extends GroundTransport{
     private int numberOfContainer;
    
	public Rail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*public Rail(int id, String customerName, String arrivalPort, String departurePort, float weight,
			int numberOfContainer, String capacity) {
		this.setId(id);
		this.setCustomerName(customerName);
		this.setArrivalPort(arrivalPort);
		this.setDeparturePort(departurePort);
		this.setWeight(weight);
		this.numberOfContainer = numberOfContainer;
		this.setCapacity(capacity);

	}*/
	
	public Rail(int id, String customerName, String arrivalPort, String departurePort, float weight,int numberOfContainer, String capacity){
		super(id, customerName, arrivalPort, departurePort, weight, capacity);
		this.numberOfContainer=numberOfContainer;
		
	}

	public int getNumberOfContainer() {
		return numberOfContainer;
	}

	public void setNumberOfContainer(int numberOfContainer) {
		this.numberOfContainer = numberOfContainer;
	}


	void displayDetails() {

		System.out.println(new Rail(this.getId(), this.getCustomerName(), this.getArrivalPort(),
				this.getDeparturePort(), this.getWeight(), this.getNumberOfContainer(), this.getCapacity()));
	}

	public String toString() {

		return String.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s", this.getId(), this.getCustomerName(),
				this.getArrivalPort(), this.getDeparturePort(), this.getWeight(), this.getNumberOfContainer(),
				this.getCapacity());

    }
    
}
