package es.uco.pw.util;

import java.sql.*;

public class DBConnection {

	public static Connection createConnection(){
		
		Connection con = null;
		String url = "jdbc:mysql://oraclepr.uco.es:3306/a52hepof"; //MySQL URL followed by the database name
		String username = "a52hepof"; //MySQL username
		String password = "vn9rn7rz"; //MySQL password
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver"); //loading MySQL drivers. This differs for database servers 
			} 
			catch (ClassNotFoundException e){
				e.printStackTrace();
			}
		
			con = DriverManager.getConnection(url, username, password); //attempting to connect to MySQL database
			System.out.println("Printing connection object "+con);
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		return con; 
	}

	
}





