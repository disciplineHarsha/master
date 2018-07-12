import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		/*
		 * String fName = "input.txt"; File f = new File(fName);
		 */
		User uo=new User(); 
		File file1 = new File("input.txt");
		BufferedReader b = new BufferedReader(new FileReader(file1));
		ArrayList<User> user = new ArrayList<User>();
		int j = 0;
	  
		
		
		int index = 0;
		String line = null;
		try{
		while ((line = b.readLine()) != null) {
			Long id = Long.parseLong(line.substring(0, 5));
			uo.setId(id);
			String firstName = line.substring(5, 15);
			uo.setFirstName(firstName);
			String lastName = line.substring(15, 25);
			uo.setLastName(lastName);
			
			//String userName = line.substring(25, 35);
			uo.setUsername(line.substring(25, 35));
			//String password = line.substring(35, 43);
			uo.setPassword(line.substring(35, 43));
			//String mobileNumber = line.substring(43, 53);
			uo.setMobileNumber(line.substring(43, 53));

			User u = new User(uo.getId(), uo.getFirstName(), uo.getLastName(), uo.getUsername(), uo.getPassword(), uo.getMobileNumber());
			user.add(u);

		}

		System.out.format("%-10s %-15s %-15s %-15s %-15s %s\n", "id", "First Name", "Last Name", "Username", "Password",
				"Mobile Number");
		for (int i = 0; i < user.size(); i++) {
			System.out.println(user.get(i).toString());

		}
		
	}
	catch(Exception e){
		System.out.println(e);
	}
	}
	

}