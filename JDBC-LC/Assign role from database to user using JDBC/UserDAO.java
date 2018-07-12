import java.sql.*;
import java.util.List;
public class UserDAO {
    
      public void createUser(User user) throws Exception {
                                // David,david365,david@365,+1 716-824-1572

                                String QUERY = "INSERT INTO user (`name`, `username`, `password`, `mobile number`, `role`) VALUES (?,?,?,?,?)";
                                PreparedStatement preparedStmt = DbConnection.getConnection().prepareStatement(QUERY);
                                preparedStmt.setString(1, user.getName());
                                preparedStmt.setString(2, user.getUserName());
                                preparedStmt.setString(3, user.getPassword());
                                preparedStmt.setString(4, user.getMobileNumber());
                                preparedStmt.setString(5, user.getRole().getRoleName());
                                preparedStmt.executeUpdate();
                }
 
                

                public void displayDetails() throws Exception {
                                System.out.println("User details:");
                                System.out.format("%-15s %-15s %-15s %-15s %-15s %s\n", "User id", "Name", "User name", "Password",
                                                                "Mobile number", "Role");
                                String QUERY = "select * from user order by id";
                                PreparedStatement preparedStmt = DbConnection.getConnection().prepareStatement(QUERY);

                                ResultSet rs = preparedStmt.executeQuery();
                while (rs.next()) {
                                                System.out.format("%-15s %-15s %-15s %-15s %-15s %s\n", rs.getInt(1), rs.getString(2), rs.getString(3),
                                                                                rs.getString(4), rs.getString(5),rs.getString(6));
                                }
                }
    
}
