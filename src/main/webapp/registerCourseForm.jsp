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
<body class="flex flex-col justify-between h-screen">
	<div class="flex-none">
		<jsp:include page="navbar.jsp" />
	</div>
	<div class="pt-8 px-16 grow">
		<div class="mt-2 flex place-content-center">
			<form class="w-2/3">
				<div class="space-y-12">

					<div class="px-4 sm:px-0 w-full justify-between flex">
						<h3 class="text-base font-semibold leading-7 text-gray-900">Course
							Registration Form</h3>
					</div>

					<div class="border-b border-gray-900/10 pb-12">
						<div class="mt-10 grid gap-x-6 gap-y-8 grid-cols-12">

							<div class="sm:col-span-7">
								<label for="usn"
									class="block text-sm font-medium leading-6 text-gray-900">USN</label>
								<div class="mt-2">
									<select id="usn" name="usn"
										class="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
										<option>2019-1</option>
										<option>2019-2</option>
										<option>2020-1</option>
										<option>2020-2</option>
										<option>2020-1</option>
										<option>2020-2</option>
									</select>
								</div>
							</div>
							<div class="sm:col-span-7">
								<label for="semester"
									class="block text-sm font-medium leading-6 text-gray-900">Semester</label>
								<div class="mt-2">
									<select id="semester" name="semester"
										class="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
										<option>1-1</option>
										<option>1-2</option>
										<option>2-1</option>
										<option>2-2</option>
										<option>3-1</option>
										<option>3-2</option>
									</select>
								</div>
							</div>
							<fieldset class="sm:col-span-6">
								<legend class="text-sm font-semibold leading-6 text-gray-900">Courses</legend>
								<div class="mt-6 space-y-6">
									<div class="flex items-center gap-x-3">
										<input id="push-everything" name="push-notifications"
											type="checkbox"
											class="h-4 w-4 border-gray-300 text-indigo-600 focus:ring-indigo-600">
										<label for="push-everything"
											class="block text-sm font-medium leading-6 text-gray-900">Introduction to computer science</label>
									</div>
									<div class="flex items-center gap-x-3">
										<input id="push-email" name="push-notifications" type="checkbox"
											class="h-4 w-4 border-gray-300 text-indigo-600 focus:ring-indigo-600">
										<label for="push-email"
											class="block text-sm font-medium leading-6 text-gray-900">Computer Programming</label>
									</div>
									<div class="flex items-center gap-x-3">
										<input id="push-nothing" name="push-notifications"
											type="checkbox"
											class="h-4 w-4 border-gray-300 text-indigo-600 focus:ring-indigo-600">
										<label for="push-nothing"
											class="block text-sm font-medium leading-6 text-gray-900">Discrete Mathematics</label>
									</div>
								</div>
							</fieldset>
							<fieldset class="sm:col-span-6">
								<legend class="text-sm font-semibold leading-6 text-gray-900">Your Courses</legend>
								<div class="mt-6 space-y-6">
									<div class="flex items-center gap-x-3">
										<input id="push-everything" name="push-notifications"
											type="checkbox"
											class="h-4 w-4 border-gray-300 text-indigo-600 focus:ring-indigo-600">
										<label for="push-everything"
											class="block text-sm font-medium leading-6 text-gray-900">Introduction to computer science</label>
									</div>
									<div class="flex items-center gap-x-3">
										<input id="push-email" name="push-notifications" type="checkbox"
											class="h-4 w-4 border-gray-300 text-indigo-600 focus:ring-indigo-600">
										<label for="push-email"
											class="block text-sm font-medium leading-6 text-gray-900">Computer Programming</label>
									</div>
									<div class="flex items-center gap-x-3">
										<input id="push-nothing" name="push-notifications"
											type="checkbox"
											class="h-4 w-4 border-gray-300 text-indigo-600 focus:ring-indigo-600">
										<label for="push-nothing"
											class="block text-sm font-medium leading-6 text-gray-900">Discrete Mathematics</label>
									</div>
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