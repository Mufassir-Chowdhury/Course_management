<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="cse.model.TeacherModel" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	  <script src="https://cdn.tailwindcss.com?plugins=forms"></script></head>

</head>
<title>Course Form</title>
</head>
<% 
	List<TeacherModel> teachers = (List<TeacherModel>) request.getAttribute("list");
%>
<body class="flex flex-col justify-between h-screen">
	<div class="flex-none">
		<jsp:include page="navbar.jsp" />
	</div>
	<div class="pt-8 px-16 grow">
		<div class="mt-2 flex place-content-center">
			<form class="w-2/3" action="AddCourseAction" method="post">
				<div class="space-y-12">
					
					<div class="px-4 sm:px-0 w-full justify-between flex">
						<h3 class="text-base font-semibold leading-7 text-gray-900">Course
							Form</h3>
					</div>

					<div class="border-b border-gray-900/10 pb-12">
						<div class="mt-10 grid gap-x-6 gap-y-8 grid-cols-12">
							<div class="sm:col-span-6">
								<label for="course_name"
									class="block text-sm font-medium leading-6 text-gray-900">Course
									name</label>
								<div class="mt-2">
									<input type="text" name="course_name" id="course_name"
										autocomplete="course_name"
										class="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
								</div>
							</div>

							<div class="sm:col-span-3">
								<label for="course_code"
									class="block text-sm font-medium leading-6 text-gray-900">Course
									code</label>
								<div class="mt-2">
									<input type="text" name="course_code" id="course_code"
										autocomplete="course_code"
										class="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
								</div>
							</div>

							<div class="sm:col-span-3">
								<label for="type"
									class="block text-sm font-medium leading-6 text-gray-900">Type</label>
								<div class="mt-2">
									<select id="type" name="type" autocomplete="course_type"
										class="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
										<option>Theory</option>
										<option>Lab</option>
									</select>
								</div>
							</div>
							<div class="sm:col-span-7">
								<label for="department"
									class="block text-sm font-medium leading-6 text-gray-900">Department</label>
								<div class="mt-2">
									<select id="department" name="department" autocomplete="department"
										class="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600  sm:text-sm sm:leading-6">
										<option>CSE</option>
										<option>ECO</option>
										<option>EEE</option>
									</select>
								</div>
							</div>

							<div class="sm:col-span-7">
								<label for="id"
									class="block text-sm font-medium leading-6 text-gray-900">Instructor</label>
								<div class="mt-2">
									<select id="id" name="id"
										class="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
										<% for(TeacherModel teacher: teachers){ %>
											<option value="<% out.print(teacher.getId()); %>"><% out.print(teacher.getCode()); %></option>
										<% } %>
									</select>
								</div>
							</div>
							

							<div class="col-span-7">
								<label for="prerequisites"
									class="block text-sm font-medium leading-6 text-gray-900">Prerequisites</label>
								<div class="mt-2">
									<input type="text" name="prerequisites" id="prerequisites"
										autocomplete="prerequisites"
										class="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
								</div>
							</div>

							<div class="sm:col-span-4 sm:col-start-1">
								<label for="semester"
									class="block text-sm font-medium leading-6 text-gray-900">Semester</label>
								<div class="mt-2">
									<input type="text" name="semester" id="semester"
										autocomplete="semester"
										class="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
								</div>
							</div>

							<div class="sm:col-span-4">
								<label for="year"
									class="block text-sm font-medium leading-6 text-gray-900">Year</label>
								<div class="mt-2">
									<input type="text" name="year" id="year"
										autocomplete="year"
										class="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
								</div>
							</div>

							<div class="sm:col-span-4">
								<label for="credit"
									class="block text-sm font-medium leading-6 text-gray-900">Credit</label>
								<div class="mt-2">
									<input type="text" name="credit" id="credit"
										autocomplete="credits"
										class="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
								</div>
							</div>
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