package com.revature.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws SQLException{
		
		
		//Creating a Connection. 		
		String url = "jdbc:mysql://localhost:3306/todo";
		String username="root";
		String password = "Sivaragul@2712";				
		
		Connection conn = DriverManager.getConnection(url,username,password);
		return conn;
		
	}

}
