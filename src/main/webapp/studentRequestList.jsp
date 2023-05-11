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
				<li class="flex justify-between gap-x-6 py-5">
					<div class="flex gap-x-4">
						<div class="min-w-0 flex-auto">
							<p class="text-sm font-semibold leading-6 text-gray-900">Mufassir
								Ahmad Chowdhury</p>
							<p class="mt-1 truncate text-xs leading-5 text-gray-500">2019331073</p>
						</div>
					</div>
					<div class="hidden sm:flex sm:items-end">
						<div class="flex flex-col text-right">
							<p class="text-sm leading-6 text-gray-900">mac22214u@gmail.com</p>
							<p class="mt-1 text-xs leading-5 text-gray-500">Computer
								Science and Engineering</p>
						</div>
						<div class="pl-8 text-green-600">
							<button>Approve</button>
						</div>
						<div class="px-4 text-red-600">
							<button>Remove</button>
						</div>
					</div>
				</li>
				<li class="flex justify-between gap-x-6 py-5">
					<div class="flex gap-x-4">
						<div class="min-w-0 flex-auto">
							<p class="text-sm font-semibold leading-6 text-gray-900">John
								Doe</p>
							<p class="mt-1 truncate text-xs leading-5 text-gray-500">2019331074</p>
						</div>
					</div>
					<div class="hidden sm:flex sm:items-end">
						<div class="flex flex-col text-right">
							<p class="text-sm leading-6 text-gray-900">john.doe@gmail.com</p>
							<p class="mt-1 text-xs leading-5 text-gray-500">Electrical
								Engineering</p>
						</div>
						<div class="pl-8 text-green-600">
							<button>Approve</button>
						</div>
						<div class="px-4 text-red-600">
							<button>Remove</button>
						</div>
					</div>
				</li>

				<li class="flex justify-between gap-x-6 py-5">
					<div class="flex gap-x-4">
						<div class="min-w-0 flex-auto">
							<p class="text-sm font-semibold leading-6 text-gray-900">Jane
								Smith</p>
							<p class="mt-1 truncate text-xs leading-5 text-gray-500">2019331075</p>
						</div>
					</div>
					<div class="hidden sm:flex sm:items-end">
						<div class="flex flex-col text-right">
							<p class="text-sm leading-6 text-gray-900">jane.smith@gmail.com</p>
							<p class="mt-1 text-xs leading-5 text-gray-500">Mechanical
								Engineering</p>
						</div>
						<div class="pl-8 text-green-600">
							<button>Approve</button>
						</div>
						<div class="px-4 text-red-600">
							<button>Remove</button>
						</div>
					</div>
				</li>

				<li class="flex justify-between gap-x-6 py-5">
					<div class="flex gap-x-4">
						<div class="min-w-0 flex-auto">
							<p class="text-sm font-semibold leading-6 text-gray-900">Bob
								Johnson</p>
							<p class="mt-1 truncate text-xs leading-5 text-gray-500">2019331076</p>
						</div>
					</div>
					<div class="hidden sm:flex sm:items-end">
						<div class="flex flex-col text-right">
							<p class="text-sm leading-6 text-gray-900">bob.johnson@gmail.com</p>
							<p class="mt-1 text-xs leading-5 text-gray-500">Civil
								Engineering</p>
						</div>
						<div class="pl-8 text-green-600">
							<button>Approve</button>
						</div>
						<div class="px-4 text-red-600">
							<button>Remove</button>
						</div>
					</div>
				</li>

				<li class="flex justify-between gap-x-6 py-5">
					<div class="flex gap-x-4">
						<div class="min-w-0 flex-auto">
							<p class="text-sm font-semibold leading-6 text-gray-900">Alice
								Brown</p>
							<p class="mt-1 truncate text-xs leading-5 text-gray-500">2019331077</p>
						</div>
					</div>
					<div class="hidden sm:flex sm:items-end">
						<div class="sm:flex sm:flex-col text-right">
							<p class="text-sm leading-6 text-gray-900">alice.brown@gmail.com</p>
							<p class="mt-1 text-xs leading-5 text-gray-500">Chemical
								Engineering</p>
						</div>
						<div class="pl-8 text-green-600">
							<button>Approve</button>
						</div>
						<div class="px-4 text-red-600">
							<button>Remove</button>
						</div>
					</div>
				</li>


			</ul>
		</div>
	</div>

</body>
</html>