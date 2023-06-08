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
import cse.testmodels.ListTile;

/**
    The CourseList servlet class handles the retrieval and display of a list of courses.
    It extends the HttpServlet class to handle HTTP requests.
*/
@WebServlet("/CourseList")
public class CourseList extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	/**
		Handles the HTTP GET request to retrieve and display a list of courses.
		It fetches the list of courses from the database using the CourseDao class,
		sets the retrieved list as request attributes, and forwards the request to the
		listPage.jsp for rendering the course list.
		@param request the HttpServletRequest object containing the request parameters
		@param response the HttpServletResponse object for sending the response
		@throws ServletException if a servlet-specific error occurs
		@throws IOException if an I/O error occurs
    */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Retrieve the list of courses from the database
		CourseDao dao = new CourseDao();
		List<ListTile> courseList = dao.getAllCourse();
		request.setAttribute("list", courseList);

		// Meta-data for listPage page
		request.setAttribute("request", false);
		request.setAttribute("title", "Course List");
		request.setAttribute("button-text", "Add Course");
		request.setAttribute("button-link", "./AddCourseForm");
		request.setAttribute("onClick", "./Course");


		RequestDispatcher view = request.getRequestDispatcher("listPage.jsp");
		view.forward(request, response);
	}

}
