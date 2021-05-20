<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
	<h1>This is a JSP page</h1>
	<%
		int i = 5;
		int j = 20;
		int sum = i + j;
		out.print("sum = " + sum);
	%>
	<h1>You have some Java code above</h1>
</body>
</html>