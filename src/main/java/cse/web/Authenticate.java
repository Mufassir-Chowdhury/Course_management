package cse.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cse.dao.StudentDao;
import cse.model.StudentModel;
import cse.service.LoginService;
import cse.testdao.CourseDao;
import cse.testmodels.ListTile;

/**
 * Servlet implementation class HelloJSP
 */
@WebServlet("/Dashboard")
public class Authenticate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Authenticate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String role;
		if(!LoginService.checkLogin(request)) {
			role = request.getParameter("role");
			response.addCookie(new Cookie("role", role));
		} else {
			role = LoginService.getRole(request);
		}
		if(role.toString().trim().equals("teacher")) {
			CourseDao dao = new CourseDao();
			List<ListTile> courseList = dao.getCourse();
			request.setAttribute("list", courseList);
			request.setAttribute("request", false);
			request.setAttribute("onClick", "./Course");
			RequestDispatcher view = request.getRequestDispatcher(role + "Dashboard.jsp");
			view.forward(request, response);
		} else if(role.toString().trim().equals("student")) {
			
			String email = (String) request.getParameter("email");
			//System.out.println(email);
			StudentDao std_dao = new StudentDao();
			StudentModel std = std_dao.getStudent(email);
			request.setAttribute("std", std);
			
			CourseDao dao = new CourseDao();
			List<ListTile> courseList = dao.getCourse();
			request.setAttribute("list", courseList);
			request.setAttribute("request", false);
			request.setAttribute("title", "Registered Course List");
			request.setAttribute("button-text", "Register Course");
			request.setAttribute("button-link", "./RegisterCourseForm");
			request.setAttribute("onClick", "./Course");


			RequestDispatcher view = request.getRequestDispatcher("studentDashboard.jsp");
			view.forward(request, response);
		} else {
			RequestDispatcher view = request.getRequestDispatcher(role + "Dashboard.jsp");
			view.forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
