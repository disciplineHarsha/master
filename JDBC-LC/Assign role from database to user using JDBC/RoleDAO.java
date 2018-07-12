import java.sql.*;
import java.util.*;
public class RoleDAO {
    
  public List<Role> getAllRoles() throws Exception {
                                Class.forName("com.mysql.jdbc.Driver");
                                String QUERY = "select * from role order by name";
                                PreparedStatement preparedStmt = DbConnection.getConnection().prepareStatement(QUERY);

                                ResultSet rs = preparedStmt.executeQuery();
                                List<Role> roles = new ArrayList<>();
                                while (rs.next()) {
                                                roles.add(new Role(rs.getInt("id"), rs.getString("name"), rs.getString("description")));
                                }
                                return roles;
                }
    
}
