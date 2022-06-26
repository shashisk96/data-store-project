<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	ArrayList al = (ArrayList) session.getAttribute("cart");
	%>

	<table border="2px solid black;border-collapse:collapse;">
		<tr>
			<th>Name</th>
		</tr>
		
		<%for(Object obj:al){ %>
		
		<tr>
			<td><%=obj %></td>
		</tr>
		
		<%} %>
	</table>
</body>
</html>