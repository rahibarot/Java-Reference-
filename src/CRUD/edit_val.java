package CRUD;

import java.sql.*;

import com.*;

public class edit_val {

		public getterSetter get_val_of_user(int id) {
			
			databaseConnection db= new databaseConnection();
			Connection connect= db.get_connection();
			
			PreparedStatement ps= null;
			
			ResultSet res= null;
			
			getterSetter beans= new getterSetter();
			
			try {
				String que="select * from user where id=? ";
				ps=connect.prepareStatement(que);
				ps.setInt(1, id);
				res= ps.executeQuery();
				
				while(res.next()) {
					beans.setId(res.getInt("id"));
					beans.setFname(res.getString("fname"));
					beans.setLname(res.getString("lname"));
					beans.setEmail(res.getString("Email"));
					beans.setPhone(res.getInt("phone"));
					
				}
			} catch (Exception e) {
				System.err.println(e);
				// TODO: handle exception
			}
			return beans;
		}
		
		public void edit_users(getterSetter beans) {
			databaseConnection db= new databaseConnection();
	        Connection connect = db.get_connection();
	        
	        PreparedStatement ps = null;
	        
	        try {
				String que= "update users set fname=?, lname=?, Email=?, phone=? where id=?";
				ps=connect.prepareStatement(que);
				ps.setString(1, beans.getFname());
				ps.setString(2, beans.getLname());
				ps.setString(3, beans.getEmail());
				ps.setInt(4, beans.getPhone());
				ps.executeUpdate();
				
				
			} catch (Exception e) {
				System.err.println(e);
				// TODO: handle exception
			}
	        
			
		}
}
