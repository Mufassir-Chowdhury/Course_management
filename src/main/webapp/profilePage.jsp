<%@ page import="cse.testmodels.Person" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="https://cdn.tailwindcss.com?plugins=forms,typography,aspect-ratio,line-clamp"></script></head>
<title>Insert title here</title>
</head>
<body>
    <jsp:include page="navbar.jsp" />
<div class="pt-8 px-16">
  <div class="px-4 sm:px-0">
    <h3 class="text-base font-semibold leading-7 text-gray-900">Profile Information</h3>
    <p class="mt-1 max-w-2xl text-sm leading-6 text-gray-500">Personal details.</p>
  </div>
  <div class="mt-2 border-t border-gray-100">
  	<%       	
  		Person person = (Person) request.getAttribute("person");
	 %>
    <dl class="divide-y divide-gray-100">
      <div class="px-4 py-2 grid grid-cols-5 gap-4 px-0">
        <dt class="text-sm font-medium leading-6 text-gray-900">ID</dt>
        <dd class="text-sm leading-6 text-gray-700 col-span-2 mt-0"><% out.print(person.getId()); %></dd>
      </div>
      <div class="px-4 py-2 grid grid-cols-5 gap-4 px-0">
        <dt class="text-sm font-medium leading-6 text-gray-900">Name</dt>
        <dd class="text-sm leading-6 text-gray-700 col-span-2 mt-0"><% out.print(person.getName()); %></dd>
      </div>
      <div class="px-4 py-2 grid grid-cols-5 gap-4 px-0">
        <dt class="text-sm font-medium leading-6 text-gray-900">Department</dt>
        <dd class="text-sm leading-6 text-gray-700 col-span-2 mt-0"><% out.print(person.getDepartment()); %></dd>
      </div>
      	<% 
      		if(person.getCode() != null){
        %>
		      <div class="px-4 py-2 grid grid-cols-5 gap-4 px-0">
			      <dt class="text-sm font-medium leading-6 text-gray-900">Code</dt>
			      <dd class="text-sm leading-6 text-gray-700 col-span-2 mt-0"><% out.print(person.getCode()); %></dd>
			  </div>
		<%
      		} 
      		if(person.getDesignation() != null){
		%>
   				<div class="px-4 py-2 grid grid-cols-5 gap-4 px-0">
					<dt class="text-sm font-medium leading-6 text-gray-900">Designation</dt>
					<dd class="text-sm leading-6 text-gray-700 col-span-2 mt-0"><% out.print(person.getDesignation()); %></dd>
				</div>
        <%
      		} 
      		if(person.getSession() != null){
        %>
      			<div class="px-4 py-2 grid grid-cols-5 gap-4 px-0">
	      			<dt class="text-sm font-medium leading-6 text-gray-900">Session</dt>
	      			<dd class="text-sm leading-6 text-gray-700 col-span-2 mt-0"><% out.print(person.getSession()); %></dd>
      			</div>
      	<%
      		}
      		if(person.getCurrentSemester() != null){
      	%>
      			<div class="px-4 py-2 grid grid-cols-5 gap-4 px-0">
	      			<dt class="text-sm font-medium leading-6 text-gray-900">Current Semester</dt>
	      			<dd class="text-sm leading-6 text-gray-700 col-span-2 mt-0"><% out.print(person.getCurrentSemester()); %></dd>
      			</div>
        <%
      		}
      	%>
      
      <div class="px-4 py-2 grid grid-cols-5 gap-4 px-0">
        <dt class="text-sm font-medium leading-6 text-gray-900">Email</dt>
        <dd class="text-sm leading-6 text-gray-700 col-span-2 mt-0"><% out.print(person.getEmail()); %></dd>
      </div>
      <div class="px-4 py-2 grid grid-cols-5 gap-4 px-0">
        <dt class="text-sm font-medium leading-6 text-gray-900">Phone Number</dt>
        <dd class="text-sm leading-6 text-gray-700 col-span-2 mt-0"><% out.print(person.getPhone()); %></dd>
      </div>
      
    </dl>
  </div>
</div>

</body>
</html>