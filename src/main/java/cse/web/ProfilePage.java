package cse.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cse.testdao.PersonDao;
import cse.testmodels.Person;

/**
 * Servlet implementation class ProfilePage
 */
@WebServlet({ "/Profile" })
public class ProfilePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PersonDao dao = new PersonDao();
		Person person = dao.getPerson();
		request.setAttribute("person", person);
		RequestDispatcher view = request.getRequestDispatcher("profilePage.jsp");
		view.forward(request, response);
	}


}
