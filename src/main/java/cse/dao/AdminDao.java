package cse.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cse.model.AdminModel;


public class AdminDao {
	public AdminModel getAdmin(String email) {
		String url = "jdbc:mysql://localhost:3306/course_management";
		String user = "root";
		String pw = "root";
		String sql = "select * from admins where email = ?";
		
		AdminModel adm = new AdminModel();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pw);
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
					
			if(rs.next()) {
				adm.setId(rs.getInt("id"));
				adm.setUsername(rs.getString("username"));
				adm.setName(rs.getString("name"));
				adm.setEmail(rs.getString("email"));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return adm;
	}
}
