
import java.text.NumberFormat;
import java.util.Locale;
import java.text.DecimalFormat;

public class Shipment {
	private int id;
    private String shipperName;
	private String modeOfTransportation;
	private Float totalWeight;
	private String arrivalPort;
    private String departurePort;
    private static int  nextShipmentId=1000;
    
    
    
    Shipment(int id,String shipperName,String modeOfTransportation,float totalWeight,String arrivalPort,String departurePort){
    	this.setId(id);
    	this.setShipperName(shipperName);
		this.setModeOfTransportation(modeOfTransportation);
		this.setTotalWeight(totalWeight);
		this.setArrivalPort(arrivalPort);
		this.setDeparturePort(departurePort);
    }
    
    public Shipment(){
    	
	}
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id=id;
    }
    
    public String getShipperName(){
        return shipperName;
    }
    
    public void setShipperName(String shipperName){
        this.shipperName=shipperName;
    }
    
    public String getModeOfTransportation() {
    	return modeOfTransportation;
	}

	public void setModeOfTransportation(String modeOfTransportation) {
		this.modeOfTransportation = modeOfTransportation;
	}

	
    public Float getTotalWeight() {
            //NumberFormat formatter = NumberFormat.getInstance(Locale.US);
        	//formatter.setMaximumFractionDigits(2);
    		//Float formatedFloat = new Float(formatter.format(totalWeight));
            
            NumberFormat nf = new DecimalFormat("#.##");
            return new Float(nf.format(totalWeight));
    		//return  formatedFloat;
    		//return totalWeight;
    	}
	

	public void setTotalWeight(float totalWeight) {
		this.totalWeight = totalWeight;
	}

	public String getArrivalPort() {
		return arrivalPort;
	}

	public void setArrivalPort(String arrivalPort) {
		this.arrivalPort = arrivalPort;
	}

	public String getDeparturePort() {
		return departurePort;
	}

	public void setDeparturePort(String departurePort) {
		this.departurePort = departurePort;
	}
    
    public static Shipment createNewShipment(String shipperName,String modeOfTransportation,Float totalWeight,String arrivalPort,String departurePort){
    	nextShipmentId++;
    	
    	
    	Shipment s=new Shipment(nextShipmentId,shipperName,modeOfTransportation,totalWeight,arrivalPort,departurePort);
    	
    	return s;
    }
    
    @Override
    public String toString(){
    	
    //return String.format("%-15d%-15s%-25s%-15s%-20s%s",this.id,this.shipperName,this.modeOfTransportation,this.totalWeight+"Kg",this.arrivalPort,this.departurePort);	
    return String.format("%-15s%-15s%-25s%-15s%-20s%s", this.getId(), this.getShipperName(),
    			this.getModeOfTransportation(), (this.getTotalWeight()).toString().replaceAll("\\.?0*$", "")+ "Kg", this.getArrivalPort(),
				this.getDeparturePort());
    }
    	
}
