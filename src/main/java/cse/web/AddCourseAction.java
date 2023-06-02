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
 * Servlet implementation class AddCourseAction
 */
@WebServlet("/AddCourseAction")
public class AddCourseAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCourseAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
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
	}

}
