
public class Role implements Comparable<Role>{

    private Integer id;
    private String name;

    public Role(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public int compareTo(Role o) {
		
			
		
		return this.name.compareToIgnoreCase(o.getName());
	}
    
    
}
