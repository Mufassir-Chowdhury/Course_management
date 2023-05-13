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
<script
	src="https://cdn.tailwindcss.com?plugins=forms,typography,aspect-ratio,line-clamp"></script>
</head>
<title><% out.print(title); %></title>
</head>
<body>
	<jsp:include page="navbar.jsp" />
	<div class="pt-8 px-16">
		<div class="px-4 sm:px-0 w-full justify-between flex">
			<h3 class="text-base font-semibold leading-7 text-gray-900"><% out.print(title); %></h3>
			<a href=<% out.print(buttonLink); %>>
				<button><% out.print(buttonText); %></button>
			</a>
		</div>
		<jsp:include page="listShow.jsp" />

	</div>

</body>
</html>