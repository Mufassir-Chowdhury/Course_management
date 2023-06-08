package cse.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cse.dao.CourseDao;
import cse.model.CourseModel;
import cse.testdao.PersonDao;
import cse.testmodels.ListTile;

/**
    The CoursePage servlet class handles the retrieval and display of a course page.
    It extends the HttpServlet class to handle HTTP requests.
*/
@WebServlet("/Course")
public class CoursePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
		Handles the HTTP GET request to retrieve and display a course page.
		It fetches the course data from the database using the CourseDao class,
		sets the retrieved data as request attributes, and forwards the request to the
		coursePage.jsp for rendering the course page.
		@param request the HttpServletRequest object containing the request parameters
		@param response the HttpServletResponse object for sending the response
		@throws ServletException if a servlet-specific error occurs
		@throws IOException if an I/O error occurs
    */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Retrieve the course data based on the provided ID parameter
		CourseDao dao = new CourseDao();
		CourseModel course = dao.getCourse(request.getParameter("id"));
		request.setAttribute("course", course);
		
		// Retrieve the list of students enrolled in the course
		List<ListTile> personList = dao.getAllStudentOfACourse(course.getCourse_code()); 
		request.setAttribute("list", personList);
		request.setAttribute("request", false);
		request.setAttribute("onClick", "./Student");
		
		RequestDispatcher view = request.getRequestDispatcher("coursePage.jsp");
		view.forward(request, response);
	}
}
