
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
    	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    	
    	User us=new User();
    	
    	System.out.println("Enter the total number of users");
    	int n=Integer.parseInt(br.readLine());
    	
    	User[] userObject=new User[n];
        System.out.println("Enter user details");    	
    	for(int i=0;i<n;i++){
    		 
             
    		String userDetails=br.readLine();
            
    		String[] splitUserDetails =userDetails.split(",");
    		
    		us.setUserName(splitUserDetails[0]);
            us.setFirstName(splitUserDetails[1]);
    		us.setLastName(splitUserDetails[2]);
    		us.setContact(splitUserDetails[3]);
    		
    		userObject[i]=us.createUser(us.getUserName(), us.getFirstName(), us.getLastName(), us.getContact());
    	}
    	
    	System.out.println("1)Search user by user name");
    	System.out.println("2)Search user by first name and last name");
    	System.out.println("Enter your option");
    	int option=Integer.parseInt(br.readLine());
    	
    	if(option==1){
    		System.out.println("Enter the user name to search");
    		String name=br.readLine();
    		User searchedUd=us.findUser(userObject, name);
    		
    		if(searchedUd!=null){
        		System.out.println("User details :");
	    		System.out.println("Username :" + searchedUd.getUserName());
	    		System.out.println("FirstName :"+searchedUd.getFirstName());
	    		System.out.println("LastName :"+searchedUd.getLastName());
	    		System.out.println("Contact :"+searchedUd.getContact());
    		}else{
    			System.out.println("User not found");
    		}
    		
    	}
    	
    	else if(option==2){
    		System.out.println("Enter the first name to search");
    		String firstName=br.readLine();
            System.out.println("Enter the last name to search");
    		String lastName=br.readLine();
    		
    		User searchedUd= us.findUser(userObject, firstName, lastName);
    		
    		if(searchedUd!=null){
        		System.out.println("User details :");
	    		System.out.println("Username :" + searchedUd.getUserName());
	    		System.out.println("FirstName :"+searchedUd.getFirstName());
	    		System.out.println("LastName :"+searchedUd.getLastName());
	    		System.out.println("Contact :"+searchedUd.getContact());
    		}
    		else{
    			System.out.println("User not found");
    		}
    		
    		
    	}
        else {
        	System.out.println("Invalid Option");
    	}
    	
    	
          
    }
    
}
