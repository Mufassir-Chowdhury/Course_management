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
 * Servlet implementation class Course
 */
@WebServlet("/Course")
public class CoursePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CourseDao dao = new CourseDao();
		CourseModel course = dao.getCourse(request.getParameter("id"));
		request.setAttribute("course", course);
		
		List<ListTile> personList = dao.getAllStudentOfACourse(course.getCourse_code()); 
		request.setAttribute("list", personList);
		request.setAttribute("request", false);
		request.setAttribute("onClick", "./Student");
		
		RequestDispatcher view = request.getRequestDispatcher("coursePage.jsp");
		view.forward(request, response);
	}
}
