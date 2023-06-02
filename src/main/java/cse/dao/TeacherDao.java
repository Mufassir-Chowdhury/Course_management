package cse.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cse.model.TeacherModel;
import cse.testmodels.ListTile;


public class TeacherDao {
	
	private Connection con;
	public TeacherDao() {
		String url = "jdbc:mysql://localhost:3306/course_management";
		String user = "root";
		String pw = "root";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pw);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public TeacherModel getTeacher(String email) {
		String sql = "select * from teachers where email = ?";
		
		TeacherModel tcr = new TeacherModel();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				tcr.setId(rs.getInt("id"));
				tcr.setUsername(rs.getString("username"));
				tcr.setName(rs.getString("name"));
				tcr.setCode(rs.getString("code"));			
				tcr.setDept(rs.getString("dept"));
				tcr.setDesignation(rs.getString("designation"));
				tcr.setPhone(rs.getString("phone"));
				tcr.setEmail(rs.getString("email"));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return tcr;
	}
	
	public List<ListTile> getAllTeacher() {
		String sql = "select * from teachers";
		List<ListTile> teachers = new ArrayList<>();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				teachers.add(new ListTile(
							rs.getString("name"),
							rs.getString("designation"),
							rs.getString("email"),
							rs.getString("dept"),
							rs.getString("email")
						));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return teachers;
	}
	public List<TeacherModel> getAllTeacherCodes() {
		String sql = "select code, id from teachers";
		List<TeacherModel> teachers = new ArrayList<>();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				TeacherModel model = new TeacherModel();
				model.setId(rs.getInt("id"));
				model.setCode(rs.getString("code"));
				teachers.add(model);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return teachers;
	}
	
}
