import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserDAO {

       public ArrayList<User> getAllUsers() throws Exception {
	   
             ArrayList<User> ls = new ArrayList<User>();
		//Class.forName("com.mysql.jdbc.Driver");
            Statement stmt=DbConnection.getConnection().createStatement();
    		String query = "select u.role_id as rid,u.contact_id as cid,u.id as id,u.name, r.name as role, c.street, c.city, c.state from user u, role r,contact c where  u.role_id=r.id and u.contact_id=c.id";
    		 ResultSet rs = stmt.executeQuery(query);
    
    		while (rs.next()) {
    			Role r = new Role(Integer.parseInt(rs.getString("rid")), rs.getString("role"));
    			Contact c = new Contact(Integer.parseInt(rs.getString("cid")), rs.getString("street"), rs.getString("city"),
    					rs.getString("state"));
    			
    			ls.add(new User(Integer.parseInt(rs.getString("id")), rs.getString("name"),r,c));
               
    	
        }
        
           rs.close();   
           stmt.close();
            
           Collections.sort(ls);
     
    		return ls;
    	    }

}
