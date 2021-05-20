<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.company.bean.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<% User user = (User) request.getAttribute("user"); %>

<body>
	<h1>You are successfully logged in!</h1>
	<h2>Welcome <%=request.getParameter("username")%> from request</h2>
	<h2>Welcome <%=session.getAttribute("username")%> from session</h2>
	<!-- bean automatically appends getXX() to the following:-->
	<h2>Welcome ${user.username} from bean</h2>
</body>
</html>