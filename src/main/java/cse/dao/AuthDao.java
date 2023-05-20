package cse.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cse.model.AuthModel;


public class AuthDao {
	public AuthModel getAuth(String email) {
		String url = "jdbc:mysql://localhost:3306/course_management";
		String user = "root";
		String pw = "tasintasin";
		String sql = "select * from auths where email = ?";
		
		AuthModel auth = new AuthModel();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pw);
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
