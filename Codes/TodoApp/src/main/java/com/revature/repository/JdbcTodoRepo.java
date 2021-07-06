package com.revature.repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.db.ConnectionFactory;
import com.revature.model.Entity;


public   class JdbcTodoRepo implements TodoRepo {
	public void save() {
		
		Connection conn = null;
		
		try {
			//entity TODO= new entity("Iten-2",true);
			//Load the Driver		
			conn = ConnectionFactory.getConnection();
			
			String query = "insert into todo(TODO,Completed) values(?,?) ";
			
			PreparedStatement ps = conn.prepareStatement(query);
			
			
	//		ps.setString(1,TODO.getTODO());
	//		ps.setBoolean(2,TODO.isCompleted());
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(" Enter a Item:");
			String TODO = br.readLine();
			
			System.out.println(" Enter a Status:");
			Boolean Completed = Boolean.parseBoolean(br.readLine());
			
			ps.setString(1, TODO);
			ps.setBoolean(2, Completed);
			
			ps.executeUpdate();
	//		if (rowCount == 2) {
	//			System.out.println("Todo saved.");
	//		}
			System.out.println("Saved...");
			conn.close();
		}catch (SQLException | IOException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void save(Entity entity) {
		// TODO Auto-generated method stub
		System.out.print("Not saved");
		
	}

}
