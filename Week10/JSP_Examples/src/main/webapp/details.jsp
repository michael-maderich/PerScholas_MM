<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Details</title>
	<style>
		td {
			border:solid black 1px;
			padding:.25em;
		}
	</style>
</head>
<%
	String message = "";
	String firstname = request.getParameter("firstname");
	String lastname = request.getParameter("lastname");
	String password = request.getParameter("password");
	String username = request.getParameter("username");
	String gender = request.getParameter("gender");
	String[] hobbies = request.getParameterValues("hobbies");
	String country = request.getParameter("country");
	if (firstname.isEmpty()) message += "First Name";
	else session.setAttribute("firstname", firstname);
	if (lastname == null || lastname.isEmpty()) message += (message.isEmpty()?"":", ") + "Last Name";
	else session.setAttribute("lastname", lastname);
	if (password == null || password.isEmpty()) message += (message.isEmpty()?"":", ") + "Password";
	else session.setAttribute("password", password);
	if (username == null || username.isEmpty()) message += (message.isEmpty()?"":", ") + "User Name";
	else session.setAttribute("username", username);
	if (gender == null || gender.isEmpty()) message += (message.isEmpty()?"":", ") + "Gender";
	else session.setAttribute("gender", gender);
	if (hobbies == null || hobbies.length == 0) message += (message.isEmpty()?"":", ") + "Hobbies";
	else session.setAttribute("hobbies", hobbies);
	if (country == null) message += (message.isEmpty()?"":", ") + "Country";
	else session.setAttribute("country", country);
	if (!message.isEmpty()) response.sendRedirect("registration.jsp?message="+message + " can not be null.");
	String hobbiesStr = ""; for (int i = 0; i < hobbies.length; i++) hobbiesStr += (hobbiesStr.isEmpty()?"":", ") + hobbies[i];
%>
<body>
	<h1>Registration Details</h1>
    <table>
        <tr>
            <td>First Name</td>
            <td><%=firstname%></td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td><%=lastname%></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><%=password%></td>
        </tr>
        <tr>
            <td>User Name</td>
            <td><%=username%></td>
        </tr>
        <tr>
            <td>Gender</td>
            <td><%=gender%></td>
        </tr>
        <tr>
            <td>Hobbies</td>
            <td><%=hobbiesStr%></td>
        </tr>
        <tr>
            <td>Country</td>
            <td><%=country%></td>
        </tr>
    </table>
</body>
</html>