
public class Customer extends ShipmentEntity {
    
	private Integer id;
	private String name;
	
	
	Customer(){
		super();
	}
	
	
	Customer(String shipmentEntityName,String identificationNumber,Integer id,String name){
		super(shipmentEntityName,identificationNumber);
		this.id=id;
		this.name=name;
	}
	
	public Integer getId(){
		
		return this.id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	
	@Override
	void display(){
        //System.out.format("%-15s %-25s %-15s %-15s\n","Name","Identification Number","Customer Id","Customer Name");
		System.out.println(new Customer(this.getShipmentEntityName(),this.getIdentificationNumber(),this.getId(),this.getName()));
		
	}
	
	public String toString() {

		return String.format("%-15s %-25s %-15s %-15s", this.getShipmentEntityName(),
				this.getIdentificationNumber(),this.getId(), this.getName());
	}

}
