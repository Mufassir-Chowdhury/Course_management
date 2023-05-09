<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Crunchify.com JSP Servlet Example </title>
</head>
<body>
    <jsp:include page="navbar.jsp" />
    <div class="flex justify-between">
    	<a href="./CourseList">
	    	<div>
	    		Add Course
	    	</div>
    	</a>
    	<a  href="./ApproveStudent">
	    	<div>
	    		Approve Student
	    	</div>
    	</a>
    	<a href="./ApproveInstructor">
	    	<div>
	    		Approve Instructor
	    	</div>
    	</a>
    </div>
<div align='center'>
Email: <%= request.getParameter("email") %> <br>
Password: <%= request.getParameter("password") %> <br>
Role: <%= request.getParameter("role") %> <br>
Admin Page
</div>
</body>
</html>