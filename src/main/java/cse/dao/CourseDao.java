package cse.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cse.model.CourseModel;
import cse.model.StudentModel;
import cse.testmodels.ListTile;



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
					crs.setCredit(rs.getString("credits"));
					crs.setInstructor_id(rs.getInt("instructor_id"));
					crs.setPrereq(rs.getString("prereq"));
					crs.setSemester(rs.getInt("semester"));
					crs.setYear(rs.getInt("year"));
					crs.setDept(rs.getString("department"));
				}
			}catch(Exception e) {
				System.out.println(e);
			}
			return crs;	
	}
	
	
	public List<ListTile> getAllCourse() {
		String sql = "select * from courses";
		List<ListTile> courses = new ArrayList<>();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				courses.add(new ListTile(
							rs.getString("course_name"),
							rs.getString("course_code"),
							"Credits: " + rs.getString("credits"),
							rs.getInt("semester") + " - " + rs.getInt("year"),
							rs.getString("course_code")
						));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return courses;
	}
	
	public List<ListTile> getAllStudentOfACourse(String course_code) {
		String sql = "select * from students join takes using(id) where takes.course_code = ?";
		
		List<ListTile> students = new ArrayList<>();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, course_code);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				students.add(new ListTile(
							rs.getString("name"),
							String.valueOf(rs.getInt("id")),
							rs.getString("email"),
							rs.getString("dept"),
							rs.getString("email")
						));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return students;
	}
	
	
	public List<ListTile> getAllCourseOfATeacher(int id) {
		String sql = "select * from courses as c, teaches as tc where c.instructor_id = tc.id and tc.id = ?";
		List<ListTile> courses = new ArrayList<>();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				courses.add(new ListTile(
							rs.getString("course_name"),
							rs.getString("course_code"),
							"Credits: " + rs.getString("credits"),
							rs.getInt("semester") + " - " + rs.getInt("year"),
							rs.getString("course_code")
						));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return courses;
	}
	
	public List<ListTile> getAllCourseOfAStudent(int id) {
		String sql = "select * from courses join takes using(course_code) join students using (id) where students.id = ?";
		List<ListTile> courses = new ArrayList<>();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				courses.add(new ListTile(
							rs.getString("course_name"),
							rs.getString("course_code"),
							"Credits: " + rs.getString("credits"),
							rs.getInt("semester") + " - " + rs.getInt("year"),
							rs.getString("course_code")
						));
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
				   + "(course_code, course_name, credits, instructor_id, prereq, semester, department, year) values "
				   + "(?,?,?,?,?,?,?, ?)";
		String sql2 = "insert into teaches(id, course_code) values (?, ?)";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, course.getCourse_code());
			pst.setString(2, course.getCourse_name());
			pst.setString(3, course.getCredit());
			pst.setInt(4, course.getInstructor_id());
			pst.setString(5, course.getPrereq());
			pst.setInt(6, course.getSemester());
			pst.setString(7, course.getDept());
			pst.setInt(8, course.getYear());
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
