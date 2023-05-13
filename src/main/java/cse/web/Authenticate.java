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
		}
			
		RequestDispatcher view = request.getRequestDispatcher(role + "Dashboard.jsp");
		view.forward(request, response);
		System.out.println(role);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
