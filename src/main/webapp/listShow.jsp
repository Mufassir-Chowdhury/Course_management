<%@ page import="cse.testmodels.ListTile" %>
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
<body>
	<div class="mt-2 border-t border-gray-100">
			<ul role="list" class="divide-y divide-gray-100">
			<% 
				List<ListTile> list = (List<ListTile>) request.getAttribute("list");
				Boolean isRequest = (Boolean) request.getAttribute("request");

				for(ListTile tile: list){
					
			%>
					<li class="flex justify-between gap-x-6 py-5">
						<div class="flex gap-x-4">
							<div class="min-w-0 flex-auto">
								<p class="text-sm font-semibold leading-6 text-gray-900"><% out.print(tile.getLeadingTitle()); %></p>
								<p class="mt-1 truncate text-xs leading-5 text-gray-500"><% out.print(tile.getLeadingSubtitle()); %></p>
							</div>
						</div>
						<div class="hidden sm:flex sm:items-end">
							<div class="flex flex-col text-right">
								<p class="text-sm leading-6 text-gray-900"><% out.print(tile.getTrailingTitle()); %></p>
								<p class="mt-1 text-xs leading-5 text-gray-500"><% out.print(tile.getTrailingSubtitle()); %></p>
							</div>
							<% 
								if(isRequest == true){
							%>
									<div class="pl-8 text-green-600">
										<button>Approve</button>
									</div>
									<div class="px-4 text-red-600">
										<button>Remove</button>
									</div>
							<%
								}
							%>
						</div>
					</li>
			<%
				}
			%>	

			</ul>
			
		</div>
</body>
</html>