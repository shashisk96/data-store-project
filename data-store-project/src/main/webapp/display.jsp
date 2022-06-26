<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:pink">

		<%  String name=(String)session.getAttribute("uname");
		    ArrayList al=(ArrayList)session.getAttribute("eproduct");
		%>
		
	<marquee>
		<%   for(Object o:al) {
			out.print(o);
		    } 
		%>    </marquee>
		
	<marquee>	<%out.print(name); %></marquee>
</body>
</html>