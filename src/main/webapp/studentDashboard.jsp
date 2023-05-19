<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="cse.model.StudentModel" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Crunchify.com JSP Servlet Example </title>
</head>
<body class="bg-gray-100">
    <jsp:include page="navbar.jsp" /> 
<div align='center'>
<%
	StudentModel std = (StudentModel) request.getAttribute("std");
	out.println(std.getName());
%>
Email: <%= request.getParameter("email") %> <br>
Password: <%= request.getParameter("password") %> <br>
Role: <%= request.getParameter("role") %> <br>
Student page
</div>
</body>
</html>