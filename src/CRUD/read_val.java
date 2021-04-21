package CRUD;

import java.sql.*;
import java.util.*;

import com.*;
public class read_val {

	public static void main(String[] args) {
		read_val read= new read_val();
		
		read.get_vals();
	}
	
	public List<getterSetter> get_vals(){
		databaseConnection db = new databaseConnection();
		Connection connect = db.get_connection();
		
		PreparedStatement ps= null;
		ResultSet res= null;
		
		List<getterSetter> list= new ArrayList<getterSetter>();
		
		try {
			String que= "select * from user";
			ps=connect.prepareStatement(que);
			res=ps.executeQuery();
			
			while(res.next()) {
				getterSetter beans= new getterSetter();
				System.out.println(res.getInt("id"));
				System.out.println(res.getString("fname"));
				System.out.println(res.getString("Email"));
				System.out.println(res.getInt("Phone"));
				
				beans.setId(res.getInt("id"));
				beans.setFname(res.getString("fname"));
				beans.setLname(res.getString("lname"));
				beans.setEmail(res.getString("Email"));
				beans.setPhone(res.getInt("phone"));
				
				list.add(beans);
			}
		} catch (Exception e) {
			System.err.println(e);
			// TODO: handle exception
		}
		return list;
		
	}
}
