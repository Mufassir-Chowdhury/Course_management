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
    The StudentProfile servlet class handles the retrieval and display of a student's profile.
    It extends the HttpServlet class to handle HTTP requests.
*/
@WebServlet("/Student")
public class StudentProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
		Handles the HTTP GET request to retrieve and display a student's profile.
		It fetches the student data from the database using the StudentDao class,
		sets the retrieved data as a request attribute, and forwards the request to the
		studentProfilePage.jsp for rendering the profile.
		@param request the HttpServletRequest object containing the request parameters
		@param response the HttpServletResponse object for sending the response
		@throws ServletException if a servlet-specific error occurs
		@throws IOException if an I/O error occurs

		@see StudentDao
    */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Retrieve the student's data based on the provided ID parameter
		StudentDao dao = new StudentDao();
		StudentModel person = dao.getStudent(request.getParameter("id"));
		request.setAttribute("person", person);

		RequestDispatcher view = request.getRequestDispatcher("studentProfilePage.jsp");
		view.forward(request, response);
	}


}
