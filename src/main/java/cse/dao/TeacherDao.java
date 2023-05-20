package cse.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cse.model.TeacherModel;


public class TeacherDao {
	public TeacherModel getTeacher(String email) {
		String url = "jdbc:mysql://localhost:3306/course_management";
		String user = "root";
		String pw = "tasintasin";
		String sql = "select * from teachers where email = ?";
		
		TeacherModel tcr = new TeacherModel();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pw);
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			
			
			if(rs.next()) {
				tcr.setId(rs.getInt("id"));
				tcr.setUsername(rs.getString("username"));
				tcr.setName(rs.getString("name"));
				tcr.setCode(rs.getString("code"));			
				tcr.setDept(rs.getString("dept"));
				tcr.setDesignation(rs.getString("desgination"));
				tcr.setPhone(rs.getString("phone"));
				tcr.setEmail(rs.getString("email"));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return tcr;
	}
}
