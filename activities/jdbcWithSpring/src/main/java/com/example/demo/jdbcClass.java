package com.example.demo;

import java.sql.*;

public class jdbcClass {

	public void insertData(String name) {
		
		Connection conn = null;
		Statement stmt = null;
		

			try {
				
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");

				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			try {
				
				PreparedStatement ps = conn.prepareStatement("insert into users values(?)");
				System.out.println("Connecting to database...");

				ps.setString(1, name);
				ps.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}// end main
}// end ExampleJDBC
