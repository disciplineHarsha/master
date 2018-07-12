public class Address {
   private String state;
     private String country;
	 
	 public Address(String state, String country){
		 this.setState(state);
		 this.setCountry(country);
	 }
	 
	 public Address(){
		 
	 }
	 public String getState(){
		 return state;
	 }
	 
	 public void setState(String state){
		 this.state=state;
	 }
	 	
	 public String getCountry(){
		 
		 return country;
	 }
	 
	 public void setCountry(String country){
		 this.country=country;
	 }
	 
	 public static Address createAddress(String state, String country){
		 Address ad=new Address(state, country);
		 
		 return ad;
	 }
	 
	 public String toString(){
		 
		 return String.format("%-15s %s\n", this.getState(),this.getCountry());
	 }
	

}
