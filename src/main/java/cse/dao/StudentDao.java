package cse.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cse.model.CourseModel;
import cse.model.StudentModel;

public class StudentDao {
	private Connection con;
	public StudentDao() {
		String url = "jdbc:mysql://localhost:3306/course_management";
		String user = "root";
		String pw = "tasintasin";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pw);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public StudentModel getStudent(String email) {
		String sql = "select * from students where email = ?";
		StudentModel std = new StudentModel();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				std.setId(rs.getString("id"));
				std.setUsername(rs.getString("username"));
				std.setName(rs.getString("name"));
				std.setDept(rs.getString("dept"));
				std.setSession(rs.getString("session"));
				std.setPhone(rs.getString("phone"));
				std.setEmail(rs.getString("email"));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}

		return std;
	}
	
	
	public List<StudentModel> getAllStudent() {
		String sql = "select * from students";
		List<StudentModel> students = new ArrayList<>();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				StudentModel std = new StudentModel();
				std.setId(rs.getString("id"));
				std.setUsername(rs.getString("username"));
				std.setName(rs.getString("name"));
				std.setDept(rs.getString("dept"));
				std.setSession(rs.getString("session"));
				std.setPhone(rs.getString("phone"));
				std.setEmail(rs.getString("email"));
				students.add(std);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return students;
	}
	
}
