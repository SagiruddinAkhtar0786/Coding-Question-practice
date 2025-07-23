package com.testing.acid.properties;
//package com.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("dfghjkl");
		
		Connection con=null;
		Statement st = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ACID","root","123456");
			con.setAutoCommit(false);
			st = con.createStatement();
			
			st.executeUpdate("Update ACCOUNTS set balance = balance - 100 WHERE ID=1");
			con.commit();
			
			System.out.println("transaction successfully");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}

