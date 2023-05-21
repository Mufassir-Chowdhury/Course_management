package cse.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cse.model.AuthModel;


public class AuthDao {
	private Connection con;
	public AuthDao() {
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
	
	public AuthModel getAuth(String email) {
		String sql = "select * from auths where email = ?";
		AuthModel auth = new AuthModel();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				auth.setUsername(rs.getString("username"));
				auth.setEmail(rs.getString("email"));
				auth.setPassword(rs.getString("password"));
				auth.setRole(rs.getString("role"));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return auth;
	}
}
