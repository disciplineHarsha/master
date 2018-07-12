public class ShipmentBO {
	void validate(Container container, Commodity[] commodity) throws ContainerOverloadedException {
    	float weight=0;
		
		for(int i=0;i<commodity.length;i++){
			
			weight=weight+(commodity[i].getTotalWeight());
			
		}
		
		if(weight<=container.getContainerWeight()){
			
		}
		else{
			throw new ContainerOverloadedException("Container is overloaded");
		}
		
		
	}
	
}
