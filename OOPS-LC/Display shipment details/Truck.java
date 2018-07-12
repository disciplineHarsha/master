public class Truck extends GroundTransport{
   private int sizeOfContainer;

    public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*public Truck(int id, String customerName, String arrivalPort, String departurePort, float weight,
			int sizeOfContainer, String capacity) {
		this.setId(id);
		this.setCustomerName(customerName);
		this.setArrivalPort(arrivalPort);
		this.setDeparturePort(departurePort);
		this.setWeight(weight);
		this.sizeOfContainer = sizeOfContainer;
		this.setCapacity(capacity);

	}*/
	public Truck(int id, String customerName, String arrivalPort, String departurePort, float weight,int sizeOfContainer, String capacity) {
		super(id, customerName, arrivalPort, departurePort, weight, capacity);
		this.sizeOfContainer=sizeOfContainer;
		
	}
	
	

	public int getSizeOfContainer() {
		return sizeOfContainer;
	}
	
	public void setSizeOfContainer(int sizeOfContainer) {
		this.sizeOfContainer = sizeOfContainer;
	}

	@Override
	void displayDetails() {

		System.out.println(new Truck(this.getId(), this.getCustomerName(), this.getArrivalPort(),
				this.getDeparturePort(), this.getWeight(), this.getSizeOfContainer(), this.getCapacity()));
	}

	

	public String toString() {

		return String.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s", this.getId(), this.getCustomerName(),
				this.getArrivalPort(), this.getDeparturePort(), this.getWeight(), this.getSizeOfContainer(),
				this.getCapacity());

	}
}