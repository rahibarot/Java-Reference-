package com;

import java.sql.*;
public class databaseConnection {
	public static void main(String[] args) {
		databaseConnection db= new databaseConnection();
		
		System.out.println();
	}
	
	public Connection get_connection() {
		Connection connect = null;
		String ConnectionURL = "jdbc:mysql://localhost:3306/users";
		String user= "root";
		String pass= "root";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(ConnectionURL,user, pass);
		
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		return connect;
	}
}
