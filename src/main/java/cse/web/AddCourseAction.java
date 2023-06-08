package cse.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cse.dao.CourseDao;
import cse.model.CourseModel;

/**
    The AddCourseAction servlet class handles the action of adding a new course.
    It extends the HttpServlet class to handle HTTP requests.
*/
@WebServlet("/AddCourseAction")
public class AddCourseAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
		Handles the HTTP POST request for adding a new course.
		It retrieves the course details from the request parameters and adds the course to the database using the CourseDao.
		@param request the HttpServletRequest object containing the request parameters
		@param response the HttpServletResponse object for sending the response
		@throws ServletException if a servlet-specific error occurs
		@throws IOException if an I/O error occurs
    */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CourseDao dao = new CourseDao();
		CourseModel model = new CourseModel();
		model.setCourse_code(request.getParameter("course_code"));
		model.setCourse_name(request.getParameter("course_name"));
		model.setCredit(request.getParameter("credit"));
		model.setDept(request.getParameter("department"));
		model.setInstructor_id(Integer.valueOf(request.getParameter("id")));
		model.setPrereq(request.getParameter("prerequisites"));
		model.setSemester(Integer.valueOf(request.getParameter("semester")));
		model.setYear(Integer.valueOf(request.getParameter("year")));
		dao.addCourse(model);
		
		response.sendRedirect("adminDashboard.jsp");

	}

}
