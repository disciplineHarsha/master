public class Privilege {
    String name;

    public Privilege() {
    }

    public Privilege(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public static Privilege createPrivilege(String name){
    	Privilege p=new Privilege(name);
		
		return p;
	}
}
