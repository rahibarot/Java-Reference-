package CRUD;

import java.sql.*;

import com.*;

public class delete_val {

		public void delete_val(int id) {
			databaseConnection db = new databaseConnection();
			Connection connect = db.get_connection();
			
			PreparedStatement ps= null;
			
			try {
				String que= "delete from user where id=?";
				ps = connect.prepareStatement(que);
				ps.setInt(1, id);
				ps.executeUpdate();
			} catch (Exception e) {
				
				System.err.println(e);
				// TODO: handle exception
			}
		}
}
