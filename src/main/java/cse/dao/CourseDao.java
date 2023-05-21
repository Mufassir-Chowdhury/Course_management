package cse.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cse.model.CourseModel;
import cse.model.StudentModel;



public class CourseDao {
	private Connection con;
	public CourseDao() {
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
	
	
	public CourseModel getCourse(String course_code) {
			CourseModel crs = new CourseModel();
			String sql = "select * from courses where course_code = ?";
			
			try {
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
	
	
	public List<CourseModel> getAllCourse() {
		String sql = "select * from courses";
		List<CourseModel> courses = new ArrayList<>();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				CourseModel crs = new CourseModel();
				crs.setCourse_code(rs.getString("course_code"));
				crs.setCourse_name(rs.getString("course_name"));
				crs.setCredit(rs.getString("credit"));
				crs.setInstructor(rs.getString("instructor"));
				crs.setPrereq(rs.getString("prereq"));
				crs.setSemester(rs.getString("semester"));
				crs.setYear(rs.getString("year"));
				courses.add(crs);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return courses;
	}
	
	public List<StudentModel> getAllStudentOfACourse(String course_code) {
		String sql = "select * from students join takes using(id) where takes.course_code = '?'";
		
		List<StudentModel> students = new ArrayList<>();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, course_code);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				StudentModel std = new StudentModel();
				std.setId(rs.getString("id"));
				std.setUsername(rs.getString("username"));
				std.setName(rs.getString("name"));
				std.setDept(rs.getString("dept"));
				std.setSession(rs.getString("session"));
				std.setPhone(rs.getString("phone"));
				std.setEmail(rs.getString("email"));
				//String temp = rs.getString("id");
				//String temp1 = rs.getString("course_code");
				students.add(std);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return students;
	}
	
	
	public List<CourseModel> getAllCourseOfATeacher(int id) {
		String sql = "select * from courses as c, teaches as tc where c.instructor_id = tc.id and tc.id = '?'";
		List<CourseModel> courses = new ArrayList<>();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				CourseModel crs = new CourseModel();
				crs.setCourse_code(rs.getString("course_code"));
				crs.setCourse_name(rs.getString("course_name"));
				crs.setCredit(rs.getString("credit"));
				crs.setInstructor(rs.getString("instructor"));
				crs.setPrereq(rs.getString("prereq"));
				crs.setSemester(rs.getString("semester"));
				crs.setYear(rs.getString("year"));
//				String temp = rs.getString("id");
//				String temp = rs.getString("course_code");
				courses.add(crs);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return courses;
	}
	
	public List<CourseModel> getAllCourseOfAStudent(String id) {
		String sql = "select * from courses join takes using(course_code) join students using (id) where students.id = '?'";
		List<CourseModel> courses = new ArrayList<>();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, id);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				CourseModel crs = new CourseModel();
				crs.setCourse_code(rs.getString("course_code"));
				crs.setCourse_name(rs.getString("course_name"));
				crs.setCredit(rs.getString("credit"));
				crs.setInstructor(rs.getString("instructor"));
				crs.setPrereq(rs.getString("prereq"));
				crs.setSemester(rs.getString("semester"));
				crs.setYear(rs.getString("year"));
				courses.add(crs);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return courses;
	}
	
	
	public List<CourseModel> getAllCoursesNotTakenByAStudent(String id) {
		String sql = "select * from courses join takes using(course_code) where takes.id != '?'";
		List<CourseModel> courses = new ArrayList<>();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, id);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				CourseModel crs = new CourseModel();
				crs.setCourse_code(rs.getString("course_code"));
				crs.setCourse_name(rs.getString("course_name"));
				crs.setCredit(rs.getString("credit"));
				crs.setInstructor(rs.getString("instructor"));
				crs.setPrereq(rs.getString("prereq"));
				crs.setSemester(rs.getString("semester"));
				crs.setYear(rs.getString("year"));
				courses.add(crs);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return courses;
	}
}
