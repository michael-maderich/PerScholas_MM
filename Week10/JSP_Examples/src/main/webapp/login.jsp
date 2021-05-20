<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<%
	String message = null;
	if (request.getParameter("login")!=null) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
				
		if ("tom".equals(username) && "jerry".equals(password)) {
			session.setAttribute("username", username);
			response.sendRedirect("inbox.jsp");
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