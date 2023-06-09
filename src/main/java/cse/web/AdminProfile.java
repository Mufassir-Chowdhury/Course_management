package cse.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cse.dao.AdminDao;
import cse.model.AdminModel;

@WebServlet("/Admin")
public class AdminProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Retrieve the student's data based on the provided ID parameter
		AdminDao dao = new AdminDao();
		AdminModel person = dao.getAdmin(request.getParameter("id"));
		request.setAttribute("person", person);

		RequestDispatcher view = request.getRequestDispatcher("adminProfilePage.jsp");
		view.forward(request, response);
	}


}
