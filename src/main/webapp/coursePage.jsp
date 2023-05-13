<%@ page import="cse.testmodels.Course" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Crunchify.com JSP Servlet Example </title>
</head>
<body class="bg-gray-100">
	<% 
		Course course = (Course) request.getAttribute("course");
	%>
    <jsp:include page="navbar.jsp" />
	<div class="pt-8 px-16">
		<div class="px-4 sm:px-0 w-full justify-between flex">
			<h3 class="text-base font-semibold leading-7 text-gray-900"><% out.print(course.getName()); %></h3>
		
		</div>
		<div>
			Course Code: <% out.print(course.getCode()); %><br>
			Credit: <% out.print(course.getCredit()); %><br>
			Department: <% out.print(course.getDepartment()); %><br>
		</div>
		<br>
		<br>
		<h3 class="text-base font-semibold leading-7 text-gray-900">Registered Students</h3>

		<jsp:include page="listShow.jsp" />
	</div>
	
</body>
</html>