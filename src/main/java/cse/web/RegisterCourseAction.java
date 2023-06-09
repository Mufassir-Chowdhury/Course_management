package cse.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cse.dao.CourseDao;
import cse.model.CourseModel;

/**
 * Servlet implementation class RegisterCourseAction
 */
@WebServlet("/RegisterCourseAction")
public class RegisterCourseAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CourseDao dao = new CourseDao();
		Cookie[] cookies = request.getCookies();
		String id = "";
		for(Cookie i: cookies) {
			if(i.getName().equals("id") && i.getValue() != "") {
				id = i.getValue();
			}
		}
		List<CourseModel> courses = dao.getAllCoursesNotTakenByAStudent(id);
		for(CourseModel course: courses) {
			String checkboxValue = request.getParameter(course.getCourse_code());
			
			if(checkboxValue != null && checkboxValue.equals(course.getCourse_code())) {
				dao.regCourse(id, course.getCourse_code());
				
			}
		}
//
//		RequestDispatcher view = request.getRequestDispatcher("studentDashboard.jsp");
//		response.sendRezdirect("login.jsp");
		response.sendRedirect("./Dashboard");
//		view.forward(request, response);
	}

}
