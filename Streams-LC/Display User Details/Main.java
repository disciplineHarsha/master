import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=0;
		System.out.println("Enter the number of Users");
		n=Integer.parseInt(br.readLine());
		Long roleId=(long) 100;
		User u=new User();
		Role role=new Role();
		List<User> list=new ArrayList<User>();
		UserBO ubo=new UserBO();
		
		
		System.out.println("Enter the user details:");
		try{
		for(int i=0;i<n;i++){
			System.out.println("Enter the User ID");
			u.setId(Long.parseLong(br.readLine()));
			System.out.println("Enter the first name");
			u.setFirstName(br.readLine());
			System.out.println("Enter the Last name");
			u.setLastName(br.readLine());
			System.out.println("Enter the username");
			u.setUsername(br.readLine());
			System.out.println("Enter the password");
			u.setPassword(br.readLine());
			System.out.println("Enter the mobile number");
			u.setMobileNumber(br.readLine());
			
			System.out.println("Enter the role name");
			role.setName(br.readLine());
			role.setRoleId(roleId);
			Role roleObject=new Role(role.getRoleId(),role.getName());
			roleId++;
			
			list.add(new User(u.getId(),u.getFirstName(),u.getLastName(),u.getUsername(),u.getPassword(),u.getMobileNumber(),roleObject));
		}
		
		ubo.saveAllUser(list, "output.txt");
		}
        catch(Exception e){
            
        }
		

	}

}
