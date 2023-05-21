package cse.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cse.model.AdminModel;


public class AdminDao {
	private Connection con;
	public AdminDao() {
		String url = "jdbc:mysql://localhost:3306/course_management";
		String user = "root";
		String pw = "root";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pw);
			System.out.println(con);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public AdminModel getAdmin(String email) {
		String sql = "select * from admins where email = ?";
		AdminModel adm = new AdminModel();
		try {
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
