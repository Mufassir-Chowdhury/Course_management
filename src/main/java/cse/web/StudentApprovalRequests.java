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
 * Servlet implementation class StudentApprovalRequests
 */
@WebServlet("/StudentApprovalRequests")
public class StudentApprovalRequests extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PersonDao dao = new PersonDao();
		List<ListTile> personList = dao.getStudents(); 
		request.setAttribute("list", personList);
		request.setAttribute("request", true);
		request.setAttribute("title", "Student Approval List");
		request.setAttribute("button-text", "");
		request.setAttribute("button-link", "");
		request.setAttribute("onClick", "./StudentRequest");

		RequestDispatcher view = request.getRequestDispatcher("listPage.jsp");
		view.forward(request, response);
	}

}
