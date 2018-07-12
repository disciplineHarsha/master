import java.text.*;
public class Commodity {
	    private String commodityId;
	private Float totalWeight;
	private Integer quantity;
	
	
	public Commodity(){
		
	}
	
	public Commodity(String commodityId,Float totalWeight,Integer quantity){
		this.commodityId=commodityId;
		this.totalWeight=totalWeight;
		this.quantity=quantity;
	}
	
	DecimalFormat df=new DecimalFormat();
	
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public Float getTotalWeight() {
		return totalWeight;
	}
	public void setTotalWeight(Float totalWeight) {
		this.totalWeight = totalWeight;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public String toString(){
		
		return String.format("%-15s%-15s%s", this.getCommodityId(),df.format(this.getTotalWeight()),this.getQuantity());
	}	
}
