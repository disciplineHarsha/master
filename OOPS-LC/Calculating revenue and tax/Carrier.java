public class Carrier implements ICarrier, MenuDrivenEntity {
	private String id;
	private Double expense;
	private String modeOfTransport;
	private String[] listOfPorts;
	public Carrier(){}
	public Carrier(String values) {
		String[] val=values.split(",");
    	String[] ports=new String[val.length-3];
		int z=0;
		
		this.id=val[0];
		this.expense=Double.parseDouble(val[1]);
		this.modeOfTransport=val[2];
		for(int i=3;i<val.length;i++){
			ports[z]=val[i];
			z++;
		}
		this.listOfPorts=ports;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Double getExpense() {
		return expense;
	}
	public void setExpense(Double expense) {
		this.expense = expense;
	}
	public String getModeOfTransport() {
		return modeOfTransport;
	}
	public void setModeOfTransport(String modeOfTransport) {
		this.modeOfTransport = modeOfTransport;
	}
	@Override
	public void listPorts() {
		System.out.println("List of ports :");
    	for(String ports:listOfPorts){
			//if(ports!=null){
				System.out.println(ports);
			//}
		}
	}
	@Override
	public void noOfPort() {
		int count=0;
    	
		for(int i=0;i<listOfPorts.length;i++){
			if(listOfPorts[i]!=null){
				count++;
			}
		}
		
		System.out.println("Number of ports :"+count);
	}
	public void displayMenu() {
		System.out.println("Carrier menu\n1.List the ports\n2.Calculate number of ports");
	}
	@Override
	public void choiceAction(int choice) {
		switch(choice){
    	case 1:
			this.listPorts();
			break;
		case 2:
			this.noOfPort();
		
		}
	}
}