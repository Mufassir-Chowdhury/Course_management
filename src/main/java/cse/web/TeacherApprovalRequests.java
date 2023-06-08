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
    The TeacherApprovalRequests servlet class is responsible for handling the retrieval and display of a list of teacher approval requests.
    It extends the HttpServlet class to handle HTTP requests.
*/
@WebServlet("/TeacherApprovalRequests")
public class TeacherApprovalRequests extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	/**
		Handles the HTTP GET request to retrieve and display a list of teacher approval requests.
		It fetches the list of teacher approval requests from the database using the PersonDao class,
		sets the retrieved list as a request attribute, and forwards the request to the
		listPage.jsp for rendering the list.
		@param request the HttpServletRequest object containing the request parameters
		@param response the HttpServletResponse object for sending the response
		@throws ServletException if a servlet-specific error occurs
		@throws IOException if an I/O error occurs

		@see TeacherDao
    */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Retrieve the list of teacher approval requests from the database
		PersonDao dao = new PersonDao();
		List<ListTile> personList = dao.getTeachers(); 
		request.setAttribute("list", personList);

		// Meta-data for listPage page
		request.setAttribute("request", true);
		request.setAttribute("title", "Teacher Approval List");
		request.setAttribute("button-text", "");
		request.setAttribute("button-link", "");
		request.setAttribute("onClick", "./TeacherRequest");


		RequestDispatcher view = request.getRequestDispatcher("listPage.jsp");
		view.forward(request, response);
	}


}
