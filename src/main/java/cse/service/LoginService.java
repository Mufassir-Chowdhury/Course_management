package cse.service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
    The LoginService class provides utility methods for handling login-related operations.
*/
public class LoginService {
	/**
		Checks if the user is logged in based on the presence of a "role" cookie in the request.
		@param request the HttpServletRequest object
		@return true if the user is logged in, false otherwise
    */
	public static boolean checkLogin(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		for(Cookie i: cookies) {
			if(i.getName().equals("role") && i.getValue() != "") {
				return true;
			}
		}
		
		return false;
		
	}
	/**
		Retrieves the role of the logged-in user from the "role" cookie in the request.
		@param request the HttpServletRequest object
		@return the role of the logged-in user, or null if the role is not found
    */
	public static String getRole(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		for(Cookie i: cookies) {
			if(i.getName().equals("role")) {
				return i.getValue();
			}
		}
		
		return null;
		
	}
}
