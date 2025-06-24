package com.testing.acid.properties;

//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Atomicity {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement st = null;
		try {
            // Establish connection to the database
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ACID", "root", "123456");
			// disabel autoCommit mode for manual transaction management
			
			System.out.println("Conected successfully"); 
			con.setAutoCommit(false);
			
			//create statement
			st = con.createStatement();
			
			// execute multiple SQL statement
			st.executeUpdate("UPDATE accounts SET balance = balance - 100 WHERE id = 1");
            st.executeUpdate("UPDATE accounts SET balance = balance + 100 WHERE id = 2");
			
            
            // commit transaction (if both statements succeed)
            con.commit();
            System.out.println("transaction commmited successfully");
		}catch(SQLException  e) {
			//rollback transaction in canse of any error
			try {
				if(con != null) {
					con.rollback();
					System.out.println("Transaction roll back due to error : "+e.getMessage());
				}
			}catch(SQLException ex) {
				ex.printStackTrace();
			}finally {
	            // Clean up resources
	            try {
	                if (st != null) st.close();
	                if (con != null) con.close();
	            } catch (SQLException ex) {
	                ex.printStackTrace();
	            }
	        }

			
		}

	}

}
