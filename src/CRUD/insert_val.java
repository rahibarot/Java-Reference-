package CRUD;

import java.sql.*;

import com.*;
public class insert_val {

	public void inset_val(int id, String fname, String lname, String Email, int phone) {
		
		databaseConnection db = new databaseConnection();
		Connection connect = db.get_connection();
		
		PreparedStatement ps= null;
		
		try { 
			String que="insert into user(id,fname,lname,Email,phone) values(?,?,?,?)";
			ps=connect.prepareStatement(que);
			ps.setInt(1, id); //this is a unique id: last four digit of phone and birthdate
			ps.setString(2, fname);
			ps.setString(3, lname);
			ps.setString(4, Email);
			ps.setInt(5, phone);
		}catch (Exception e) {
			System.err.println(e);
		}
		
	}
}
