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
 * Servlet Filter implementation class CheckLogin
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
     * @see HttpFilter#HttpFilter()
     */
    public CheckLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		if(!LoginService.checkLogin((HttpServletRequest) request)) {
			HttpServletResponse servletResponse = (HttpServletResponse) response;
			servletResponse.sendRedirect("./");
		} else {
			chain.doFilter(request, response);			
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
