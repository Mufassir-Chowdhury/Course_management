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
 * Servlet implementation class AddCourseController
 */
@WebServlet("/CourseList")
public class CourseList extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CourseDao dao = new CourseDao();
		List<ListTile> courseList = dao.getAllCourse();
		request.setAttribute("list", courseList);
		request.setAttribute("request", false);
		request.setAttribute("title", "Course List");
		request.setAttribute("button-text", "Add Course");
		request.setAttribute("button-link", "./AddCourseForm");
		request.setAttribute("onClick", "./Course");


		RequestDispatcher view = request.getRequestDispatcher("listPage.jsp");
		view.forward(request, response);
	}

}
