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

import cse.dao.AuthDao;
import cse.dao.StudentDao;
import cse.model.AuthModel;
import cse.model.StudentModel;
import cse.service.LoginService;
import cse.dao.CourseDao;
import cse.testmodels.ListTile;

/**
    The Authenticate servlet class handles the authentication and dashboard functionality.
    It extends the HttpServlet class to handle HTTP requests.
*/
@WebServlet("/Dashboard")
public class Authenticate extends HttpServlet {
	private static final long serialVersionUID = 1L;
    String role;
    int id;

	/**
		Handles the HTTP GET request for the dashboard functionality.
		It sets the role and id cookies, retrieves and displays the dashboard based on the user's role.
		@param request the HttpServletRequest object containing the request parameters
		@param response the HttpServletResponse object for sending the response
		@throws ServletException if a servlet-specific error occurs
		@throws IOException if an I/O error occurs
    */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.addCookie(new Cookie("role", role));
		response.addCookie(new Cookie("id", String.valueOf(id)));
		response.addCookie(new Cookie("email", request.getParameter("email")));
		if(role.equals("teacher")) {
			CourseDao dao = new CourseDao();
			List<ListTile> courseList = dao.getAllCourseOfATeacher(id);
			request.setAttribute("list", courseList);
			request.setAttribute("request", false);
			request.setAttribute("onClick", "./Course");
			RequestDispatcher view = request.getRequestDispatcher(role + "Dashboard.jsp");
			view.forward(request, response);
		} else if(role.equals("student")) {
			
			String email = (String) request.getParameter("email");
			System.out.println(email);
			StudentDao std_dao = new StudentDao();
			StudentModel std = std_dao.getStudent(email);
			request.setAttribute("std", std);
			
			CourseDao dao = new CourseDao();
			List<ListTile> courseList = dao.getAllCourseOfAStudent(String.valueOf(id));
			request.setAttribute("list", courseList);
			request.setAttribute("request", false);
			request.setAttribute("title", "Registered Course List");
			request.setAttribute("button-text", "Register Course");
			request.setAttribute("button-link", "./RegisterCourseForm");
			request.setAttribute("onClick", "./Course");

			RequestDispatcher view = request.getRequestDispatcher("studentDashboard.jsp");

			view.forward(request, response);
		} else {
			RequestDispatcher view = request.getRequestDispatcher(role + "Dashboard.jsp");
			view.forward(request, response);
		}

	}

	/**
		Handles the HTTP POST request for the authentication functionality.
		It verifies the user's credentials, sets the role and id variables, and delegates the request handling to the doGet method.
		@param request the HttpServletRequest object containing the request parameters
		@param response the HttpServletResponse object for sending the response
		@throws ServletException if a servlet-specific error occurs
		@throws IOException if an I/O error occurs
    */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.addCookie(new Cookie("role", role));
		response.addCookie(new Cookie("id", String.valueOf(id)));
		response.addCookie(new Cookie("email", request.getParameter("email")));
		AuthDao dao = new AuthDao();
		AuthModel model = dao.getAuth(request.getParameter("email"));
		if(model.getRole() == null) {
			request.setAttribute("error", "Wrong email or password");
			RequestDispatcher view = request.getRequestDispatcher("login.jsp");
			view.forward(request, response);
		}
		role = model.getRole();
		id = model.getId();
		doGet(request, response);
	}

}
