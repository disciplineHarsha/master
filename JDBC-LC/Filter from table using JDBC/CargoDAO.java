import java.util.*;
import java.sql.*;
public class CargoDAO {
    
    List<Cargo> filterCargoByWeight(Float weight) throws Exception
    {
    // In this method, filter the cargo details by weight from the database,
// and it returns the filtered cargo details object.
Class.forName("com.mysql.jdbc.Driver");
Statement stmt = DbConnection.getConnection().createStatement();
String QUERY = "select * from cargodetail where weight > " + weight;
// execute query and value returned in rs.next()..iterate and tak
// values.
List<Cargo> cargoList = new ArrayList<>();
ResultSet rs = stmt.executeQuery(QUERY);
while (rs.next()) {
Integer id = Integer.parseInt(rs.getString("id"));
String name = rs.getString("name");
Float width = Float.parseFloat(rs.getString("width"));
Float height = Float.parseFloat(rs.getString("height"));
Float weight1 = Float.parseFloat(rs.getString("weight"));
cargoList.add(new Cargo(id, name, width, height, weight1));
}
        rs.close();
    stmt.close();
 
return cargoList;

}
       
    }