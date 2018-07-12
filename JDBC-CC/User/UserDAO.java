package com.jdbc.cc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserDAO  {

      public List<User> getAllUserSortByLastLogin() throws Exception{
		 List<User> user=new ArrayList<User>();
		  String query="select b.username,b.last_login_time,a.org_name,a.street,a.city,a.state from user_details b,contact a where b.contact_id=a.id";
		 Connection conn= DbConnection.getConnection();
		 Statement stmt=conn.createStatement();
		 
		 ResultSet rs=stmt.executeQuery(query);
		 while(rs.next()){
			Contact c=new Contact(rs.getString("org_name"), rs.getString("street"), rs.getString("city"), rs.getString("state")) ;
			
			user.add(new User(rs.getString("username"),rs.getDate("last_login_time"),c));
			 
		 }
		 
		    rs.close();
              stmt.close();
		 Collections.sort(user);
		 return user;
		  
		  

       //fill your code
      
  }

}

