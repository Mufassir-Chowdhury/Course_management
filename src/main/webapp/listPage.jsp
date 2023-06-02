<%@page import="java.util.List" %>
<%@page import="cse.testmodels.Course" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<% 
	String title = (String) request.getAttribute("title");
	String buttonText = (String) request.getAttribute("button-text");
	String buttonLink = (String) request.getAttribute("button-link");
%>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<title><% out.print(title); %></title>
</head>
<body class="bg-gray-100 flex flex-col justify-between h-screen">
	<div class="flex-none">
		<jsp:include page="navbar.jsp" />
	</div>
	<div class="pt-8 px-16 grow">
		<div class="px-4 sm:px-0 w-full justify-between flex">
			<h3 class="text-base font-semibold leading-7 text-gray-900"><% out.print(title); %></h3>
			<a href=<% out.print(buttonLink); %>>
				<button class="p-2 bg-white shadow-indigo-500/40 shadow-lg"><% out.print(buttonText); %></button>
			</a>
		</div>
		<jsp:include page="listShow.jsp" />

	</div>
	<div class="flex-none">
	    <jsp:include page="footer.jsp" />
	</div>

</body>
</html>