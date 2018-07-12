import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;

public class DbConnection {

    public static Connection getConnection() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        ResourceBundle rb = ResourceBundle.getBundle("mysql");
        
		String url = rb.getString("db.url");
		String username = rb.getString("db.username");
		String password = rb.getString("db.password");
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection(url, username, password);
    	return conn;
        
        
        
	    // fill the code
    }
}
