public class MyOwnInteger implements Comparable{
    private Integer number;
	
	
	public MyOwnInteger(Integer number) {
		super();
		this.number = number;
	}	
	
	
	public MyOwnInteger() {
		// TODO Auto-generated constructor stub
	}


	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

    
    @Override
	public int compareTo(Object o) {
		MyOwnInteger num=(MyOwnInteger)o;//downcasting 
		
		
		if(num.getNumber()>0 && this.number>0){
			return num.getNumber()-this.number;
		}
		else
		
		return this.number-num.getNumber();
	}
	




	
	
	  public String toString(){
		     return Integer.toString(this.getNumber());
		   }
	
	
	
	
	
	
	
	

}
