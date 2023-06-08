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
import cse.model.TeacherModel;

/**
    The AddCourseForm servlet class handles the display of the course creation form.
    It extends the HttpServlet class to handle HTTP requests.
*/
@WebServlet("/AddCourseForm")
public class AddCourseForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
		Handles the HTTP GET request for displaying the course creation form.
		It retrieves the list of teacher codes from the database and sets it as a request attribute for access in the JSP.
		@param request the HttpServletRequest object containing the request parameters
		@param response the HttpServletResponse object for sending the response
		@throws ServletException if a servlet-specific error occurs
		@throws IOException if an I/O error occurs
    */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TeacherDao dao = new TeacherDao();
		List<TeacherModel> list = dao.getAllTeacherCodes();
		request.setAttribute("list", list);
		RequestDispatcher view = request.getRequestDispatcher("courseForm.jsp");
		view.forward(request, response);
	}


}
