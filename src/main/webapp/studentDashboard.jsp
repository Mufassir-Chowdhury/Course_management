<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="cse.model.StudentModel" %>
<%@ page import="cse.dao.StudentDao" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Crunchify.com JSP Servlet Example </title>
</head>
<body class="bg-gray-100 flex flex-col justify-between h-screen">
    <jsp:include page="navbar.jsp" />
	<div class="pt-8 px-16">
		<div class="px-4 sm:px-0 w-full justify-between flex">
			<h3 class="text-base font-semibold leading-7 text-gray-900">Course List</h3>
		</div>
		<jsp:include page="listShow.jsp" />

	</div>
<div align='center'>
<%
	StudentModel model = (StudentModel) request.getAttribute("std");
	out.print(model.getName());
%>
Email: <%= request.getParameter("email") %> <br>
Password: <%= request.getParameter("password") %> <br>
Role: <%= request.getParameter("role") %> <br>
Student page
</div>
	    <jsp:include page="footer.jsp" />

</body>
</html>