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
			<h3 class="text-base font-semibold leading-7 text-gray-900">Teachers
				List</h3>
			<a href="./TeacherApprovalRequests">
				<button>Approve Teachers</button>
			</a>
		</div>
		<div class="mt-2 border-t border-gray-100">
			<ul role="list" class="divide-y divide-gray-100">
				<li class="flex justify-between gap-x-6 py-5">
					<div class="flex gap-x-4">
						<div class="min-w-0 flex-auto">
							<p class="text-sm font-semibold leading-6 text-gray-900">Mufassir
								Ahmad Chowdhury</p>
							<p class="mt-1 truncate text-xs leading-5 text-gray-500">Assistant
								Professor</p>
						</div>
					</div>
					<div class="hidden sm:flex sm:flex-col sm:items-end">
						<p class="text-sm leading-6 text-gray-900">mac22214u@gmail.com</p>
						<p class="mt-1 text-xs leading-5 text-gray-500">Computer
							Science and Engineering</p>
					</div>
				</li>
				<li class="flex justify-between gap-x-6 py-5">
					<div class="flex gap-x-4">
						<div class="min-w-0 flex-auto">
							<p class="text-sm font-semibold leading-6 text-gray-900">John
								Doe</p>
							<p class="mt-1 truncate text-xs leading-5 text-gray-500">Associate
								Professor</p>
						</div>
					</div>
					<div class="hidden sm:flex sm:flex-col sm:items-end">
						<p class="text-sm leading-6 text-gray-900">john.doe@gmail.com</p>
						<p class="mt-1 text-xs leading-5 text-gray-500">Electrical
							Engineering</p>
					</div>
				</li>

				<li class="flex justify-between gap-x-6 py-5">
					<div class="flex gap-x-4">
						<div class="min-w-0 flex-auto">
							<p class="text-sm font-semibold leading-6 text-gray-900">Jane
								Smith</p>
							<p class="mt-1 truncate text-xs leading-5 text-gray-500">Professor</p>
						</div>
					</div>
					<div class="hidden sm:flex sm:flex-col sm:items-end">
						<p class="text-sm leading-6 text-gray-900">jane.smith@gmail.com</p>
						<p class="mt-1 text-xs leading-5 text-gray-500">Mechanical
							Engineering</p>
					</div>
				</li>

				<li class="flex justify-between gap-x-6 py-5">
					<div class="flex gap-x-4">
						<div class="min-w-0 flex-auto">
							<p class="text-sm font-semibold leading-6 text-gray-900">Bob
								Johnson</p>
							<p class="mt-1 truncate text-xs leading-5 text-gray-500">Lecturer</p>
						</div>
					</div>
					<div class="hidden sm:flex sm:flex-col sm:items-end">
						<p class="text-sm leading-6 text-gray-900">bob.johnson@gmail.com</p>
						<p class="mt-1 text-xs leading-5 text-gray-500">Civil
							Engineering</p>
					</div>
				</li>


			</ul>
		</div>
	</div>

</body>
</html>