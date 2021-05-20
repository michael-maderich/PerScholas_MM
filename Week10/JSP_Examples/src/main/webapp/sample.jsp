<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Sample</title>
	</head>
<%!	int count = 0;
	void incrementCount() {
		count++;
	}
%>
	<body>
		<h1 style="margin-left:25%;">Sample Page</h1>
		<h2><%	int localVariable = 0;
	out.print("This page has been viewed " + count + " times.");
	incrementCount();%></h2>
		<p>The value of the local variable is <%=localVariable%></p>
		<%	localVariable++;%>
	</body>
</html>