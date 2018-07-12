import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class UserBO {
    
	
	public void saveAllUser(List<User> userList,String fileName) throws IOException{
		
		File output=new File(fileName);
		BufferedWriter write=new BufferedWriter(new FileWriter(output));
		//ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(output));
		
		for(int i=0;i<userList.size();i++){
			
			//out.writeObject(userList.get(i));
			
			
			write.write(userList.get(i).getId().toString()+","+userList.get(i).getFirstName()+","+userList.get(i).getLastName()+","+userList.get(i).getUsername()
						+","+userList.get(i).getPassword()+","+userList.get(i).getMobileNumber()+","+userList.get(i).getRole().getRoleId()+","+userList.get(i).getRole().getName());			
			
			
			
			write.newLine();			
		}
		
		System.out.println("User information saved successfully");
		write.flush();
		write.close();
		
	}

}
