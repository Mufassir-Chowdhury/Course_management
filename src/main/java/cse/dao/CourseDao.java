package cse.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cse.model.CourseModel;



public class CourseDao {
	public CourseModel getCourse(String course_code) {
		String url = "jdbc:mysql://localhost:3306/course_management";
		String user = "root";
		String pw = "tasintasin";
		String sql = "select * from courses where course_code = ?";
		
		CourseModel crs = new CourseModel();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pw);
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, course_code);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				crs.setCourse_code(rs.getString("course_code"));
				crs.setCourse_name(rs.getString("course_name"));
				crs.setCredit(rs.getString("credit"));
				crs.setInstructor(rs.getString("instructor"));
				crs.setPrereq(rs.getString("prereq"));
				crs.setSemester(rs.getString("semester"));
				crs.setYear(rs.getString("year"));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return crs;
	}
}
