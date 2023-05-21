package cse.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
					crs.setInstructor_id(rs.getInt("instructor_id"));
					crs.setPrereq(rs.getString("prereq"));
					crs.setSemester(rs.getInt("semester"));
					crs.setYear(rs.getInt("year"));
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
				crs.setInstructor_id(rs.getInt("instructor"));
				crs.setPrereq(rs.getString("prereq"));
				crs.setSemester(rs.getInt("semester"));
				crs.setYear(rs.getInt("year"));
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
				crs.setInstructor_id(rs.getInt("instructor_id"));
				crs.setPrereq(rs.getString("prereq"));
				crs.setSemester(rs.getInt("semester"));
				crs.setYear(rs.getInt("year"));
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
				crs.setInstructor_id(rs.getInt("instructor_id"));
				crs.setPrereq(rs.getString("prereq"));
				crs.setSemester(rs.getInt("semester"));
				crs.setYear(rs.getInt("year"));
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
				crs.setInstructor_id(rs.getInt("instructor_id"));
				crs.setPrereq(rs.getString("prereq"));
				crs.setSemester(rs.getInt("semester"));
				crs.setYear(rs.getInt("year"));
				courses.add(crs);
			}
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return courses;
	}
	
	public void addCourse(CourseModel course){
		String sql = "insert into courses "
				   + "(course_code, course_name, credits, instructor_id, prereq, semester, year) values "
				   + "(?,?,?,?,?,?,?)";
		String sql2 = "insert into teaches(id, course_code) values (?, ?)";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, course.getCourse_code());
			pst.setString(2, course.getCourse_name());
			pst.setString(3, course.getCredit());
			pst.setInt(4, course.getInstructor_id());
			pst.setString(5, course.getPrereq());
			pst.setInt(6, course.getSemester());
			pst.setInt(7, course.getYear());
			pst.execute();
			
			PreparedStatement pst2 = con.prepareStatement(sql2);
			pst2.setInt(1, course.getInstructor_id());
			pst2.setString(2, course.getCourse_code());
			pst2.execute();
			
		} catch(Exception e) {
			System.out.print(e);
		}
	}
	
	public void regCourse(String student_id, String course_code){
		String sql = "insert into takes (id, course_code) values (?, ?)";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, student_id);
			pst.setString(2, course_code);
			pst.execute();
			
		} catch(Exception e) {
			System.out.print(e);
		}
	}
}
