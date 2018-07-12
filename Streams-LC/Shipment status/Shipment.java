import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Shipment {
    
    private Long id;
    private String bookingNumber;
    private Date departureDate;
    private Date arrivalDate;
    private Integer totalWeight;
    private String status;
    
    public Shipment(){
    	
    }
    
        
    
	public Shipment(Long id, String bookingNumber, Date departureDate, Date arrivalDate, Integer totalWeight,
			String status) {
		super();
		this.id = id;
		this.bookingNumber = bookingNumber;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.totalWeight = totalWeight;
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBookingNumber() {
		return bookingNumber;
	}
	public void setBookingNumber(String bookingNumber) {
		this.bookingNumber = bookingNumber;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public Integer getTotalWeight() {
		return totalWeight;
	}
	public void setTotalWeight(Integer totalWeight) {
		this.totalWeight = totalWeight;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    
    public String toString(){
	    	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	    	
	    	String arrivalDate=sdf.format(this.getArrivalDate());
	    	String departureDate=sdf.format(this.getDepartureDate());
	    	
	    	    	
			return this.getId().toString()+","+this.getBookingNumber()+","+departureDate+","+
					arrivalDate+","+this.getTotalWeight().toString()+","+this.getStatus();
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

}
