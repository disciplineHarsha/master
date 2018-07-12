import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
		
	List<User> ls=new ArrayList<User>();
        Class.forName("com.mysql.jdbc.Driver");
		ls=new UserDAO().getAllUsers();
		
		System.out.format("%-10s %-20s %-25s %-10s %-10s \n","User","Role","Street","City","State");
		for(int i=0;i<ls.size();i++){
			System.out.println(ls.get(i));
		}
		
		
		
		

	}

}
