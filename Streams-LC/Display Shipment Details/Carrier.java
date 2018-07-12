import java.util.List;

public class Carrier implements Comparable<Carrier> {
    
	Long carrierId;
	String name;
	String code;
	List<Shipment> shipmentList;
	
	public Carrier() {
		super();
	}

	public Carrier(Long carrierId, String name, String code, List<Shipment> shipmentList) {
		super();
		this.carrierId = carrierId;
		this.name = name;
		this.code = code;
		this.shipmentList = shipmentList;
	}

	public Long getCarrierId() {
		return carrierId;
	}
	
	public void setCarrierId(Long carrierId) {
		this.carrierId = carrierId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public List<Shipment> getShipmentList() {
		return shipmentList;
	}
	
	public void setShipmentList(List<Shipment> shipmentList) {
		this.shipmentList = shipmentList;
	}

	@Override
	public String toString() {
		return carrierId + "," + name + "," + code;
	}

	@Override
	public int compareTo(Carrier carrier) {
		Long compareId = carrier.getCarrierId();
		return this.carrierId.compareTo(compareId);
	}
	
	
}
