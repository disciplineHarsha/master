public class AirTransport extends Shipment{
   private String airwaysName;

    public AirTransport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AirTransport(int id, String customerName, String arrivalPort, String departurePort, float weight,
			String airwaysName) {
		super(id, customerName, arrivalPort, departurePort, weight);
		this.airwaysName = airwaysName;

	}

	public String getAirwaysName() {
		return airwaysName;
	}

	public void setAirwaysName(String airwaysName) {
		this.airwaysName = airwaysName;
	}

	@Override
	void displayDetails() {

		System.out.println(new AirTransport(this.getId(), this.getCustomerName(), this.getArrivalPort(),
				this.getDeparturePort(), this.getWeight(), this.getAirwaysName()));
	}

	@Override
	public String toString() {

		return String.format("%-15s %-15s %-15s %-15s%-15s%-15s", this.getId(), this.getCustomerName(),
				this.getArrivalPort(), this.getDeparturePort(), this.getWeight(), this.getAirwaysName());
	}
}
