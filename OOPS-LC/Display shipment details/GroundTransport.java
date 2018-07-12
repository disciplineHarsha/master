
public class GroundTransport extends Shipment{
    private String capacity;

    public GroundTransport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GroundTransport(int id, String customerName, String arrivalPort, String departurePort, float weight,String capacity) {
		super(id, customerName, arrivalPort, departurePort, weight);
		this.capacity=capacity;
		
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
}
