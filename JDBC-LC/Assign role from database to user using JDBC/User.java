public class User {
    
    private String name;
    private String userName;
    private String password;
    private String mobileNumber;
    private Role role;
    private int id;
    public int getId() {
                return id;
                }

                public void setId(int id) {
                                this.id = id;
                }

    
    
    

    public User(String name, String userName, String password,String mobileNumber, Role role) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.mobileNumber = mobileNumber;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    
    
     @Override
                public String toString() {
                                return String.format("%-15s %-15s %-15s %-15s %-15s %-15s %s\n", this.getId(), this.getName(), this.getUserName(),
                                                                this.getUserName(), this.getPassword(),this.getMobileNumber(), this.getRole());
                }

            
            
            
            
    
    
    
}
