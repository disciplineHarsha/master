import java.text.*;
public class Container {
    
    private String number;
	private Float containerWeight;
	private Commodity[] commodities;
	
	
	
	public Container(){}
	
	public Container(String number, Float containerWeight, Commodity[] commodities) {
		super();
		this.number = number;
		this.containerWeight = containerWeight;
		this.commodities = commodities;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Float getContainerWeight() {
		return containerWeight;
	}
	public void setContainerWeight(Float containerWeight) {
		this.containerWeight = containerWeight;
	}
	public Commodity[] getCommodities() {
		return commodities;
	}
	public void setCommodities(Commodity[] commodities) {
		this.commodities = commodities;
	}
	
	
	void displayDetails(){
		
		System.out.println("Commodity details are");
		
		System.out.format("%-15s%-15s%s\n", "Id","Weight","Quantity");
		
		for(int i=0;i<commodities.length;i++){
			System.out.println(commodities[i].toString());
		}
		
	}
	
}
