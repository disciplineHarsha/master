
public class User {
    private String userName;
    private String firstName;
    private String lastName;
    private String contact;

    public User(String userName, String firstName, String lastName, String contact) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contact = contact;
    }

    User() {}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    public User createUser(String userName, String firstName, String lastName, String contact){
    	User uo=new User(userName,firstName,lastName,contact);
    	
    	return uo;
    }
    
    User ud=null;
    
    User findUser(User userArray[],String userName){
    	
    	for(int i=0;i<userArray.length;i++){
    		if(userArray[i].getUserName().equalsIgnoreCase(userName)){
    		
    			ud= userArray[i];
    		
    		}   		
    		
    	}
    	 	
    	return ud;
    }
    
    User findUser(User userArray[],String firstName,String lastName){
    	for(int i=0;i<userArray.length;i++){
    		if((userArray[i].getFirstName().equalsIgnoreCase(firstName)) &&(userArray[i].getLastName().equalsIgnoreCase(lastName))){
    		
    			ud= userArray[i];
    		
    		} 		
    		
    	}
    	 	
    	return ud;
    }
    	
    	
    	
    
    
}
