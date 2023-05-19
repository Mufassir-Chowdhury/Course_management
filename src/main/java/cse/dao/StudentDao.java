package cse.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cse.model.StudentModel;

public class StudentDao {
	public StudentModel getStudent(String email) {
		String url = "jdbc:mysql://localhost:3306/course_management";
		String user = "root";
		String pw = "tasintasin";
		String sql = "select * from students where email = ?";
		
		StudentModel std = new StudentModel();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pw);
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				std.setId(rs.getString("id"));
				std.setUsername(rs.getString("username"));
				std.setName(rs.getString("name"));
				std.setDept(rs.getString("dept"));
				std.setSession(rs.getString("session"));
				std.setEmail(rs.getString("email"));
				std.setPassword(rs.getString("password"));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.print(std);
		return std;
	}
	
}
