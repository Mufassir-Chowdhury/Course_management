<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Crunchify.com JSP Servlet Example </title>
</head>
<body class="">
    <jsp:include page="navbar.jsp" />
    <div class="flex justify-around py-8 text-white">
    	<a href="./CourseList">
	    	<div class="w-64 h-32 bg-gradient-to-tr from-gray-800 to-blue-500 flex place-content-center shadow-indigo-500/40 shadow-2xl">
	    		<button>
		    		Add Course
	    		</button>
	    	</div>
    	</a>
    	<a  href="./StudentList">
	    	<div class="w-64 h-32 bg-gradient-to-tr from-gray-800 to-blue-500 flex place-content-center shadow-indigo-500/40 shadow-2xl">
	    		<button>
		    		Approve Student
	    		</button>
	    	</div>
    	</a>
    	<a href="./TeacherList">
	    	<div class="w-64 h-32 bg-gradient-to-tr from-gray-800 to-blue-500 flex place-content-center shadow-indigo-500/40 shadow-2xl">
	    		<button>
		    		Approve Instructor
	    		</button>
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