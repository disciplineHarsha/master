public class Container extends Cargo {
	private String containerNumber;
	Container() {
    }
	
	//Cargo cargo=new Cargo();
	public Container(String containerNumber) {
		this.containerNumber = containerNumber;
	}
	/*
	public Container(String containerNumber,Float length,Float width,Float height,Double weight){
		this.containerNumber=containerNumber;
		cargo.setLength(length);
		cargo.setWidth(width);
		cargo.setHeight(height);
		cargo.setWeight(weight);
	}*/

	public String getContainerNumber() {
		return containerNumber;
	}

	public void setContainerNumber(String containerNumber) {
		this.containerNumber = containerNumber;
	}

	
	
	public void displayContainerDetails() {
		
		
	
			System.out.printf("%-20s %-15s %-15s %-15s %s\n", this.getContainerNumber(),
					this.getLength(), this.getWidth(), this.getHeight(),
					this.getWeight());
		
		
	}
}
