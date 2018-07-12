public class Shipment implements Comparable<Shipment> {
    
    Long shipmentId;
    String bookingNumber;
    String departureDate;
    String arrivalDate;
    Integer totalWeight;
    
	public Shipment() {
		super();
	}
	

	public Shipment(Long shipmentId, String bookingNumber, String departureDate, String arrivalDate,
			Integer totalWeight) {
		super();
		this.shipmentId = shipmentId;
		this.bookingNumber = bookingNumber;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.totalWeight = totalWeight;
	}

	public Long getShipmentId() {
		return shipmentId;
	}
	
	public void setShipmentId(Long shipmentId) {
		this.shipmentId = shipmentId;
	}
	
	public String getBookingNumber() {
		return bookingNumber;
	}
	
	public void setBookingNumber(String bookingNumber) {
		this.bookingNumber = bookingNumber;
	}
	
	public String getDepartureDate() {
		return departureDate;
	}
	
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	
	public String getArrivalDate() {
		return arrivalDate;
	}
	
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	
	public Integer getTotalWeight() {
		return totalWeight;
	}
	
	public void setTotalWeight(Integer totalWeight) {
		this.totalWeight = totalWeight;
	}
	
	
	@Override
	public String toString() {
		return shipmentId + "," + bookingNumber + "," + departureDate + "," + arrivalDate + "," + totalWeight;
	}

	@Override
	public int compareTo(Shipment shipment) {
		Long compareShipmentId = shipment.getShipmentId();
		return this.shipmentId.compareTo(compareShipmentId);
	}
    	
}
    