<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sent Items</title>
</head>
<%
String username = null;
if (session.getAttribute("username")==null) response.sendRedirect("login.jsp");
else username = session.getAttribute("username").toString();
%>
<body>
	<h1 style="margin-left:40%;">Sent Items</h1>
	<h3>Welcome, <%=username%>!</h3>
	<a href="inbox.jsp">Inbox</a><br />
	<a href="logout.jsp">Log Out</a>
</body>
</html>