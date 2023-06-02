<%@ page import="cse.model.CourseModel" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Crunchify.com JSP Servlet Example </title>
</head>
<body class="bg-gray-100 flex flex-col justify-between h-screen">
	<% 
		CourseModel course = (CourseModel) request.getAttribute("course");
	%>
	<div class="flex-none">
	    <jsp:include page="navbar.jsp" />
	</div>
	<div class="grow pt-8 px-16">
		<div class="px-4 sm:px-0 w-full justify-between flex">
			<h3 class="text-base font-semibold leading-7 text-gray-900"><% out.print(course.getCourse_name()); %></h3>
		
		</div>
		<div>
			Course Code: <% out.print(course.getCourse_code()); %><br>
			Credit: <% out.print(course.getCredit()); %><br>
			Department: <% out.print(course.getDept()); %><br>
		</div>
		<br>
		<br>
		<h3 class="text-base font-semibold leading-7 text-gray-900">Registered Students</h3>

		<jsp:include page="listShow.jsp" />
	</div>
	<div class="flex-none">
		    <jsp:include page="footer.jsp" />
	</div>
	
</body>
</html>