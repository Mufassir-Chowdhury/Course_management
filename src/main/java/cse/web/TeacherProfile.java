package cse.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cse.dao.TeacherDao;
import cse.model.TeacherModel;

/**
    The TeacherProfile servlet class is responsible for handling the retrieval and display of a teacher's profile.
    It extends the HttpServlet class to handle HTTP requests.
    This class was developed by [Mufassir Ahmad Chowdhury]
*/
@WebServlet("/Teacher")
public class TeacherProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
		Handles the HTTP GET request to retrieve and display a teacher's profile.
		It fetches the teacher data from the database using the TeacherDao class,
		sets the retrieved data as a request attribute, and forwards the request to the
		teacherProfilePage.jsp for rendering the profile.
		@param request the HttpServletRequest object containing the request parameters
		@param response the HttpServletResponse object for sending the response
		@throws ServletException if a servlet-specific error occurs
		@throws IOException if an I/O error occurs

		@see TeacherDao
    */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Retrieve the teacher's data based on the provided ID parameter
		TeacherDao dao = new TeacherDao();
		TeacherModel person = dao.getTeacher(request.getParameter("id"));
		request.setAttribute("person", person);

		RequestDispatcher view = request.getRequestDispatcher("teacherProfilePage.jsp");
		view.forward(request, response);
	}

}
