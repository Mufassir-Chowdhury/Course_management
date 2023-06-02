package cse.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cse.dao.StudentDao;
import cse.model.StudentModel;
import cse.testdao.PersonDao;
import cse.testmodels.Person;

/**
 * Servlet implementation class StudentProfile
 */
@WebServlet("/Student")
public class StudentProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentDao dao = new StudentDao();
		StudentModel person = dao.getStudent(request.getParameter("id"));
		request.setAttribute("person", person);
		RequestDispatcher view = request.getRequestDispatcher("studentProfilePage.jsp");
		view.forward(request, response);
	}


}
