<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!doctype html>
<%
	Cookie[] cookies = request.getCookies();
	String role = "";
	String email = "";
	for(Cookie i: cookies) {
		if(i.getName().equals("role") && i.getValue() != "") {
			role = i.getValue();
		} else if(i.getName().equals("email") && i.getValue() != "") {
			email = i.getValue();
		}
	}
	if(role.equals("student")){
		role = "Student";
	} else if(role.equals("teacher")){
		role = "Teacher";
	} else{
		role = "Admin";
	}
%>
<html>
	<head>
	  <meta charset="UTF-8">
	  <meta name="viewport" content="width=device-width, initial-scale=1.0">
	  <script src="https://cdn.tailwindcss.com"></script></head>
	<body>
		<nav class="bg-gradient-to-tr from-gray-500 to-gray-800">
		  <div class="mx-auto max-w-7xl px-8">
		    <div class="relative flex h-16 items-center justify-between">
		      <div class="flex flex-1 items-stretch ustify-start">
		        <div class="flex flex-shrink-0 items-center">
		          <img class="h-8 w-auto block" src="https://www.sust.edu/images/logo.png" alt="Your Company">
		        </div>
		        <div class="hidden sm:ml-6 sm:block">
		          <div class="flex space-x-4">
		            <a href="./Dashboard" class="text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium">Dashboard</a>
		            <a href=<% out.print("./" + role + "?id=" + email); %> class="text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium">Profile</a>
		            <a href="./" class="text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium">Logout</a>
		          </div>
		        </div>
		      </div>
		    </div>
		  </div>
		</nav>
	</body>
</html>
