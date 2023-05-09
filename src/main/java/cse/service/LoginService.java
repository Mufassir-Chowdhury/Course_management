package cse.service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class LoginService {
	public static boolean checkLogin(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		for(Cookie i: cookies) {
			if(i.getName().equals("role") && i.getValue() != "") {
				return true;
			}
		}
		
		return false;
		
	}
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
