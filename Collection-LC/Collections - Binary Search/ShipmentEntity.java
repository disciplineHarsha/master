
public class ShipmentEntity implements Comparable<ShipmentEntity> {
    
    Integer id;
    String name;
    Integer bookingNumber;
    
      public ShipmentEntity() {
    	// TODO Auto-generated constructor stub
	}

    public ShipmentEntity(Integer id, String name, Integer bookingNumber) {
        this.id = id;
        this.name = name;
        this.bookingNumber = bookingNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(Integer bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    
    @Override
    public int compareTo(ShipmentEntity o) {
		
	/*	if(this.getBookingNumber()-o.getBookingNumber()<0){
			return -1;
		}
		else if(o.getBookingNumber()-this.getBookingNumber()>0){
			return 1;
		}
		else
		return 0;*/
        
        return this.getBookingNumber().compareTo(o.getBookingNumber());
	}
	
	public String toString(){
		
		return String.format("%-16d%-16s%-15d",this.getId(),this.getName(),this.getBookingNumber());
	}

    
    
    
    
}
