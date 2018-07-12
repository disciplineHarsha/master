import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RoleDAO {

   public RoleDAO(){
    	
	}

    public ArrayList<Role> getAllRoles() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
    	ArrayList<Role> ar=new ArrayList<Role>();
       Class.forName("com.mysql.jdbc.Driver");
    	Statement stmt=DbConnection.getConnection().createStatement();
    	ResultSet rs=stmt.executeQuery("select id,name from role");
    	
    	
    		while(rs.next()){
                Integer id=Integer.parseInt(rs.getString("id"));
                String name=rs.getString("name");
                
                ar.add(new Role(id,name));
    			
    			
    		}
            rs.close();
            stmt.close();
    	
    	return ar;
    	
    	
    	
    }

}
