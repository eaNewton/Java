<%@page import="java.util.*" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
	<head><title>Beer V3 MVC</title></head>
	<body>
		<h1>Beer Selection Advice</h1>
		For color: <%= request.getParameter("color") %>
		<ul>
			<%
				List<String> brands = (List<String>)request.getAttribute("styles");
				for (String brand : brands) 
					out.println("\t\t\t<li>" + brand + "</li>");
			%>
		</ul>
	</body>
</html>