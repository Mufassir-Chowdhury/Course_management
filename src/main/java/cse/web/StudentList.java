package cse.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cse.testdao.PersonDao;
import cse.testmodels.ListTile;

/**
 * Servlet implementation class AddCourseController
 */
@WebServlet("/StudentList")
public class StudentList extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PersonDao dao = new PersonDao();
		List<ListTile> personList = dao.getStudents(); 
		request.setAttribute("list", personList);
		request.setAttribute("request", false);
		request.setAttribute("title", "Student List");
		request.setAttribute("button-text", "Approve Student");
		request.setAttribute("button-link", "./StudentApprovalRequests");
		request.setAttribute("onClick", "./Student");


		RequestDispatcher view = request.getRequestDispatcher("listPage.jsp");
		view.forward(request, response);
	}

}
