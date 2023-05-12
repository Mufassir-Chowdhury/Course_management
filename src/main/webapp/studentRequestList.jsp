<%@ page import="cse.testmodels.Person" %>
<%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script
	src="https://cdn.tailwindcss.com?plugins=forms,typography,aspect-ratio,line-clamp"></script>
</head>
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="navbar.jsp" />
	<div class="pt-8 px-16">
		<div class="px-4 sm:px-0 w-full justify-between flex">
			<h3 class="text-base font-semibold leading-7 text-gray-900">Students
				Request List</h3>
		</div>
		<div class="mt-2 border-t border-gray-100">
			<ul role="list" class="divide-y divide-gray-100">
			<% 
				List<Person> personList = (List<Person>) request.getAttribute("personList");
				for(Person person: personList){
					
			%>
					<li class="flex justify-between gap-x-6 py-5">
						<div class="flex gap-x-4">
							<div class="min-w-0 flex-auto">
								<p class="text-sm font-semibold leading-6 text-gray-900"><% out.print(person.getName()); %></p>
								<p class="mt-1 truncate text-xs leading-5 text-gray-500"><% 
									if(person.getDesignation() != null){
										out.print(person.getDesignation());
									} else {
										out.print(person.getId());
									}
									%></p>
							</div>
						</div>
						<div class="hidden sm:flex sm:items-end">
							<div class="flex flex-col text-right">
								<p class="text-sm leading-6 text-gray-900"><% out.print(person.getEmail()); %></p>
								<p class="mt-1 text-xs leading-5 text-gray-500"><% out.print(person.getDepartment()); %></p>
							</div>
							<div class="pl-8 text-green-600">
								<button>Approve</button>
							</div>
							<div class="px-4 text-red-600">
								<button>Remove</button>
							</div>
						</div>
					</li>
			<%
				}
			%>
				
			</ul>
		</div>
	</div>

</body>
</html>