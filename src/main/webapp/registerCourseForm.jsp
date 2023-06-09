<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="cse.model.CourseModel" %>
<%@ page import="cse.testmodels.ListTile" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script
	src="https://cdn.tailwindcss.com?plugins=forms,typography,aspect-ratio,line-clamp"></script>
</head>
<title>Course Registration Form</title>
</head>
<% 
	List<CourseModel> courses = (List<CourseModel>) request.getAttribute("courses");
	List<ListTile> registered = (List<ListTile>) request.getAttribute("registered");
%>
<body class="flex flex-col justify-between h-screen">
	<div class="flex-none">
		<jsp:include page="navbar.jsp" />
	</div>
	<div class="pt-8 px-16 grow">
		<div class="mt-2 flex place-content-center">
			<form class="w-2/3" action="RegisterCourseAction" method="post">
				<div class="space-y-12">

					<div class="px-4 sm:px-0 w-full justify-between flex">
						<h3 class="text-base font-semibold leading-7 text-gray-900">Course
							Registration Form</h3>
					</div>
					<div>
						Year - 2023
					</div>

					<div class="border-b border-gray-900/10 pb-12">
						<div class="mt-10 grid gap-x-6 gap-y-8 grid-cols-12">
							<!-- 
							<div class="sm:col-span-7">
								<label for="year"
									class="block text-sm font-medium leading-6 text-gray-900">USN</label>
								<div class="mt-2">
									<select id="year" name="year"
										class="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
										<option value="2018">2018</option>
										<option value="2019">2019</option>
										<option value="2020">2020</option>
										<option value="2021">2021</option>
									</select>
								</div>
							</div>
							<div class="sm:col-span-7">
								<label for="semester"
									class="block text-sm font-medium leading-6 text-gray-900">Semester</label>
								<div class="mt-2">
									<select id="semester" name="semester"
										class="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
										<option value="1">1-1</option>
										<option value="2">1-2</option>
										<option value="3">2-1</option>
										<option value="4">2-2</option>
										<option value="1">3-1</option>
										<option value="1">3-2</option>
										<option value="1">4-1</option>
										<option value="1">4-2</option>
									</select>
								</div>
							</div>
							-->
							<fieldset class="sm:col-span-6">
								<legend class="text-sm font-semibold leading-6 text-gray-900">Courses</legend>
								<div class="mt-6 space-y-6">
									<% for(CourseModel course: courses){ %>
									<div class="flex items-center gap-x-3">
										<input id=<% out.print(course.getCourse_code()); %> value=<% out.print(course.getCourse_code()); %> name=<% out.print(course.getCourse_code()); %>
											type="checkbox"
											class="h-4 w-4 border-gray-300 text-indigo-600 focus:ring-indigo-600">
										<label for=<% out.print(course.getCourse_code()); %>
											class="block text-sm font-medium leading-6 text-gray-900"><% out.print(course.getCourse_name()); %></label>
									</div>
									<% } %>
								</div>
							</fieldset>
							<fieldset class="sm:col-span-6">
								<legend class="text-sm font-semibold leading-6 text-gray-900">Your Courses</legend>
								<div class="mt-6 space-y-6">
									<% for(ListTile course: registered){ %>
									<div class="flex items-center gap-x-3">
										<input id="push-everything" name="push-notifications"
											type="checkbox"
											class="h-4 w-4 border-gray-300 text-indigo-600 focus:ring-indigo-600">
										<label for="push-everything"
											class="block text-sm font-medium leading-6 text-gray-900"><% out.print(course.getLeadingTitle()); %></label>
									</div>
									<% } %>
								</div>
							</fieldset>
						</div>
					</div>


				</div>

				<div class="mt-6 flex items-center justify-end gap-x-6">
					<button type="button"
						class="text-sm font-semibold leading-6 text-gray-900">Cancel</button>
					<button type="submit"
						class="rounded-md bg-indigo-600 px-3 py-2 text-sm font-semibold text-white shadow-sm hover:bg-indigo-500 focus-visible:outline focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-indigo-600">Save</button>
				</div>
			</form>

		</div>
	</div>
	<div class="flex-none">
	    <jsp:include page="footer.jsp" />
	</div>

</body>
</html>