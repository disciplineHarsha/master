public class Role {
    private String name;
    private String description;
    private Privilege[] privilege;

    public Role(){
    	
	}    
    
    public Role createRole(String name,String description, Privilege[] privilege){
    	Role r=new Role(name,description,privilege);
		return r;
	}
    
    public Role(String name, String description, Privilege[] privilege) {
    	//super();
		this.name = name;
		this.description = description;
		this.privilege = privilege;
	}
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Privilege[] getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Privilege[] privilege) {
        this.privilege = privilege;
    }
    
    
    
}
