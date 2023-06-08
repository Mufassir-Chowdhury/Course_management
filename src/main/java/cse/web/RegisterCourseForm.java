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
import cse.testmodels.ListTile;

/**
    The RegisterCourseForm servlet class is responsible for handling the retrieval and display of the course registration form.
    It extends the HttpServlet class to handle HTTP requests.
*/
@WebServlet("/RegisterCourseForm")
public class RegisterCourseForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
		Handles the HTTP GET request to retrieve and display the course registration form.
		It forwards the request to the registerCourseForm.jsp for rendering the form.
		@param request the HttpServletRequest object containing the request parameters
		@param response the HttpServletResponse object for sending the response
		@throws ServletException if a servlet-specific error occurs
		@throws IOException if an I/O error occurs
    */ 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CourseDao dao = new CourseDao();
		Cookie[] cookies = request.getCookies();
		String id = "";
		for(Cookie i: cookies) {
			if(i.getName().equals("id") && i.getValue() != "") {
				id = i.getValue();
			}
		}
		
		List<CourseModel> courses = dao.getAllCoursesNotTakenByAStudent(id);
		List<ListTile> registered = dao.getAllCourseOfAStudent(id);
		request.setAttribute("courses", courses);
		request.setAttribute("registered", registered);
		RequestDispatcher view = request.getRequestDispatcher("registerCourseForm.jsp");
		view.forward(request, response);
	}

}
