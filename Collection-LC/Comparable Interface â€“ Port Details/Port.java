import java.util.Comparator;

//public class Port implements Comparator<Port>{
public class Port implements Comparable<Port>{
    private Integer id;
	private String name;
	private String country;
	
	public Port(){}
	
	public Port(Integer id,String name,String country){
		this.id=id;
		this.name=name;
		this.country=country;
	}
	
	public void setId(Integer id){
		this.id=id;
	}
	
	public Integer getId(){
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	/*@Override
	public int compare(Port o1, Port o2) {
				
		return o1.getCountry().compareToIgnoreCase(o2.getCountry());
	}*/
	
	
	public String toString(){
		
		return String.format("%-16d%-16s%-15s",this.getId(),this.getName(),this.getCountry());
	}

	@Override
	public int compareTo(Port o) {
		
        return this.getCountry().compareTo(o.getCountry());
		
	}
	
	
	
	
	
	
	
	
	


}
