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
    <dl class="divide-y divide-gray-100">
      <div class="px-4 py-2 grid grid-cols-5 gap-4 px-0">
        <dt class="text-sm font-medium leading-6 text-gray-900">ID</dt>
        <dd class="text-sm leading-6 text-gray-700 col-span-2 mt-0">2019331073</dd>
      </div>
      <div class="px-4 py-2 grid grid-cols-5 gap-4 px-0">
        <dt class="text-sm font-medium leading-6 text-gray-900">Name</dt>
        <dd class="text-sm leading-6 text-gray-700 col-span-2 mt-0">Mufassir Ahmad Chowdhury</dd>
      </div>
      <div class="px-4 py-2 grid grid-cols-5 gap-4 px-0">
        <dt class="text-sm font-medium leading-6 text-gray-900">Department</dt>
        <dd class="text-sm leading-6 text-gray-700 col-span-2 mt-0">SUST</dd>
      </div>
      	<% 
      	Cookie ck[]=request.getCookies();  
      		if(ck[1].getValue().toString().trim().charAt(0) == 't'){
			      out.print("<div class=\"px-4 py-2 grid grid-cols-5 gap-4 px-0\">");
			      out.print("<dt class=\"text-sm font-medium leading-6 text-gray-900\">Code</dt>");
			      out.print("<dd class=\"text-sm leading-6 text-gray-700 col-span-2 mt-0\">MAC</dd>");
				  out.print("</div>");
      			out.print("<div class=\"px-4 py-2 grid grid-cols-5 gap-4 px-0\">");
				out.print("<dt class=\"text-sm font-medium leading-6 text-gray-900\">Designation</dt>");
				out.print("<dd class=\"text-sm leading-6 text-gray-700 col-span-2 mt-0\">VC</dd>");
				out.print("</div>");
      		} else if(ck[1].getValue().toString().trim().charAt(0) == 's'){
      			out.print("<div class=\"px-4 py-2 grid grid-cols-5 gap-4 px-0\">");
      			out.print("<dt class=\"text-sm font-medium leading-6 text-gray-900\">Session</dt>");
      			out.print("<dd class=\"text-sm leading-6 text-gray-700 col-span-2 mt-0\">2019</dd>");
      			out.print("</div>");
      			
      			out.print("<div class=\"px-4 py-2 grid grid-cols-5 gap-4 px-0\">");
      			out.print("<dt class=\"text-sm font-medium leading-6 text-gray-900\">Current Semester</dt>");
      			out.print("<dd class=\"text-sm leading-6 text-gray-700 col-span-2 mt-0\">10</dd>");
      			out.print("</div>");
      		}
      	%>
      
      <div class="px-4 py-2 grid grid-cols-5 gap-4 px-0">
        <dt class="text-sm font-medium leading-6 text-gray-900">Email</dt>
        <dd class="text-sm leading-6 text-gray-700 col-span-2 mt-0">mac22214u@gmail.com</dd>
      </div>
      <div class="px-4 py-2 grid grid-cols-5 gap-4 px-0">
        <dt class="text-sm font-medium leading-6 text-gray-900">Phone Number</dt>
        <dd class="text-sm leading-6 text-gray-700 col-span-2 mt-0">01771144308</dd>
      </div>
      
    </dl>
  </div>
</div>

</body>
</html>