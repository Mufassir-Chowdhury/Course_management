package cse.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cse.dao.TeacherDao;
import cse.testdao.PersonDao;
import cse.testmodels.ListTile;

/**
 * Servlet implementation class AddCourseController
 */
@WebServlet("/TeacherList")
public class TeacherList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TeacherDao dao = new TeacherDao();
		List<ListTile> personList = dao.getAllTeacher(); 
		request.setAttribute("list", personList);
		request.setAttribute("request", false);
		request.setAttribute("title", "Teacher List");
		request.setAttribute("button-text", "Approve Teachers");
		request.setAttribute("button-link", "./TeacherApprovalRequests");
		request.setAttribute("onClick", "./Teacher");

		RequestDispatcher view = request.getRequestDispatcher("listPage.jsp");
		view.forward(request, response);
	}

}
