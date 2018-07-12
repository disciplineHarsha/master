public class Company {
	private String identifier;
    private String iata;
	private String fmc;
	private Address address; 
	
	//Address ado= new Address();
	public Company(String identifier, String iata, String fmc, Address address){
		this.setIdentifier(identifier);
		this.setIata(iata);
		this.setFmc(fmc);
		this.setAddress(address);
	}
	
	/*public Company(String identifier, String iata, String fmc){
		this.setIdentifier(identifier);
		this.setIata(iata);
		this.setFmc(fmc);
		
	}*/
	
	
	
	public Company(){
		 
	 }

	

	public String getIdentifier() {
		return identifier;
				
				
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getIata() {
		return iata;
	}

	public void setIata(String iata) {
		this.iata = iata;
	}

	public String getFmc() {
 		return fmc;
	}

	public void setFmc(String fmc) {
		this.fmc = fmc;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address=address;
	}
	
	
	public Company createNewCompany(String identifier, String iata, String fmc,Address address){
		Company c=new Company(identifier, iata, fmc, address);
		//Company c=new Company(identifier,iata,fmc);
		return c;
	}
	
	
	
	
	@Override
	public String toString() {
		return String.format("%-15s %-15s %-15s %s", this.getIdentifier(),this.getIata(),this.getFmc(),this.getAddress());
	}
	
	

}
