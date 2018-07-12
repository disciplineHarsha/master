package com.jdbc.cc;

import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("List of all user details based on last login time");
		System.out.format("%-15s %-15s %-15s %-25s %-15s %-15s\n","Name","LastLogin Time","Organization","Street","City",
				"State");
		
		UserDAO udao=new UserDAO();
		List<User> user=udao.getAllUserSortByLastLogin();
		
		for(User u:user){
			System.out.println(u);
		}

	}

}

