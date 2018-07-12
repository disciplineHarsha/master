import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Main {
	public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
       RoleDAO rdo=new RoleDAO();
    	System.out.println("Role Details:");
		List<Role> ar=rdo.getAllRoles();
    	
		Collections.sort(ar);
		
		for(int i=0;i<ar.size();i++){
			System.out.println(ar.get(i).getName());
		}
		
       
       
    }

}
