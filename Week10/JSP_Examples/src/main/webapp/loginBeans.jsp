<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.company.bean.User" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<%
	String message = null;
	if (request.getParameter("login")!=null) {
		User user = new User();
		user.setUsername(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));
				
		if ("tom".equals(user.getUsername()) && "jerry".equals(user.getPassword())) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("successBeans.jsp");
			request.setAttribute("user", user);
			dispatcher.forward(request, response);
		} else {
			message = "Password and Username do not match";
		}
	}
%>
<body>
<%
	if (message!=null) {
		out.print("<span style='color:red'>" + message + "</span>");
	}
%>
<form method="post">
Username <input type="text" name="username"><br>
Password <input type="text" name="password"><br>
<input type="submit" name="login" value="Login">
</form>
</body>
</html>