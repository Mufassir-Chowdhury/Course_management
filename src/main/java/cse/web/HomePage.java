package cse.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
    The HomePage servlet class is responsible for handling the home page requests.
    It extends the HttpServlet class to handle HTTP requests.
*/
@WebServlet("/")
public class HomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
		Handles the HTTP GET request for the home page.
		It clears the "role" cookie, redirects the user to the login.jsp page.
		@param request the HttpServletRequest object containing the request parameters
		@param response the HttpServletResponse object for sending the response
		@throws ServletException if a servlet-specific error occurs
		@throws IOException if an I/O error occurs
    */ 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.addCookie(new Cookie("role", null));
		response.sendRedirect("login.jsp");
	}

	/**
		Handles the HTTP POST request for the home page.
		It delegates the request handling to the doGet method.
		@param request the HttpServletRequest object containing the request parameters
		@param response the HttpServletResponse object for sending the response
		@throws ServletException if a servlet-specific error occurs
		@throws IOException if an I/O error occurs
    */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
