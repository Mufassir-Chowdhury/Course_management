package cse.filters;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cse.service.LoginService;

/**
    CheckLogin Filter to ensure user authentication.
    This filter intercepts requests to specific URLs and servlets and checks if the user is logged in.
    If the user is not logged in, they are redirected to the homepage.
*/

@WebFilter(
		dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD, 
				DispatcherType.INCLUDE
		}
					, 
		urlPatterns = { 
				"/CheckLogin", 
				"/AddCourseForm", 
				"/ApproveInstructor", 
				"/ApproveStudent", 
				"/CourseList", 
				"/Course", 
				"/Profile", 
				"/Teacher", 
				"/Student", 
				"/RegisterCourseForm", 
				"/StudentApprovalRequests", 
				"/StudentList", 
				"/TeacherApprovalRequests", 
				"/TeacherList" }, 
		servletNames = { 
				"AddCourseForm", 
				"ApproveInstructorController", 
				"ApproveStudentController"
		})
public class CheckLogin extends HttpFilter implements Filter {
    /**
		Performs the filtering operation to check if the user is logged in.
		If the user is not logged in, they are redirected to the homepage.
		@param request the servlet request
		@param response the servlet response
		@param chain the filter chain
		@throws IOException if an I/O error occurs during the filter process
		@throws ServletException if a servlet error occurs during the filter process
    */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		((HttpServletResponse) response).setHeader("Cache-control", "no-cache, no-store, must-revalidate");

		// pass the request along the filter chain
		if(!LoginService.checkLogin((HttpServletRequest) request)) {
			HttpServletResponse servletResponse = (HttpServletResponse) response;
			servletResponse.sendRedirect("./");
		} else {
			chain.doFilter(request, response);			
		}
	}

}
