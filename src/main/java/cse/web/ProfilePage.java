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
    The ProfilePage servlet class handles the retrieval and display of a user's profile page.
    It extends the HttpServlet class to handle HTTP requests.
*/
@WebServlet({ "/Profile" })
public class ProfilePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
		Handles the HTTP GET request to retrieve and display a user's profile page.
		It fetches the user's profile data from the database using the PersonDao class,
		sets the retrieved data as a request attribute, and forwards the request to the
		profilePage.jsp for rendering the profile page.
		@param request the HttpServletRequest object containing the request parameters
		@param response the HttpServletResponse object for sending the response
		@throws ServletException if a servlet-specific error occurs
		@throws IOException if an I/O error occurs

		
		@see PersonDao
    */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Retrieve the user's profile data from the database
		PersonDao dao = new PersonDao();
		Person person = dao.getPerson();
		request.setAttribute("person", person);

		RequestDispatcher view = request.getRequestDispatcher("profilePage.jsp");
		view.forward(request, response);
	}


}
