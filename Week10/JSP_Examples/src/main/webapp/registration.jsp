<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<%
	String message = request.getParameter("message");
	if (message != null) {
		out.print("<span style='color:red'>" + message + "</span>");
	}
%>
	<div id="registration">
		<form method="post" action="details.jsp">
		    <table>
		        <tr>
		            <td>First Name</td>
		            <td><input type="text" name="firstname"></td>
		        </tr>
		        <tr>
		            <td>Last Name</td>
		            <td><input type="text" name="lastname"></td>
		        </tr>
		        <tr>
		            <td>Password</td>
		            <td><input type="password" name="password"></td>
		        </tr>
		        <tr>
		            <td>User Name</td>
		            <td><input type="text" name="username"></td>
		        </tr>
		        <tr>
		            <td>Gender</td>
		            <td>
		            	<input type="radio" name="gender" value="Male">Male<br />
		            	<input type="radio" name="gender" value="Female">Female
		            </td>
		        </tr>
		        <tr>
		            <td>Hobbies</td>
		            <td>
		            	<input type="checkbox" name="hobbies" value="Dance">Dance
		            	<input type="checkbox" name="hobbies" value="Music">Music<br />
		            	<input type="checkbox" name="hobbies" value="Sports">Sports
		            	<input type="checkbox" name="hobbies" value="Painting">Painting
		            </td>
		        </tr>
		        <tr>
		            <td>Country</td>
		            <td>
		            	<select name="country">
		            		<option value="USA">USA</option>
		            		<option value="Canada">Canada</option>
		            		<option value="Mexico">Mexico</option>
		            		<option value="India">India</option>
		            		<option value="EU">EU</option>
		            	</select>
		            </td>
		        </tr>
		    </table>
			<input type="submit" name="register" value="Register">
		</form>
	</div>
</body>
</html>