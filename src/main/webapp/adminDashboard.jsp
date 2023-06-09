<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="javax.servlet.http.HttpServletResponse" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Dashboard</title>
</head>
<% response.setHeader("Cache-control", "no-cache, no-store, must-revalidate"); %>
<body class="flex flex-col justify-between h-screen">
	<div class="flex-none">
    	<jsp:include page="navbar.jsp" />
    </div>
    <div class="grow">
	    <div class="flex justify-around py-8 text-white">
	    	<a href="./CourseList">
		    	<div class="w-64 h-32 bg-gradient-to-tr from-gray-500 to-gray-800 flex place-content-center shadow-indigo-500/40 shadow-2xl">
		    		<button>
			    		Courses
		    		</button>
		    	</div>
	    	</a>
	    	<a  href="./StudentList">
		    	<div class="w-64 h-32 bg-gradient-to-tr from-gray-500 to-gray-800 flex place-content-center shadow-indigo-500/40 shadow-2xl">
		    		<button>
			    		Students
		    		</button>
		    	</div>
	    	</a>
	    	<a href="./TeacherList">
		    	<div class="w-64 h-32 bg-gradient-to-tr from-gray-500 to-gray-800 flex place-content-center shadow-indigo-500/40 shadow-2xl">
		    		<button>
			    		Teachers
		    		</button>
		    	</div>
	    	</a>
	    </div>
    
    </div>
   <!-- 
<div align='center'>
Email: <%= request.getParameter("email") %> <br>
Password: <%= request.getParameter("password") %> <br>
Role: <%= request.getParameter("role") %> <br>
Admin Page
</div>
    -->
    <div class="flex-none">
	    <jsp:include page="footer.jsp" />
    </div>
	
</body>
</html>