<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>C tag Example</title>
</head>
<body>
<table>
	<c:forEach begin="1" end="9" var="i">
	<tr>
	    <td>${i}</td>
	    <td>${i * 2}</td>	
	    <td>${i * 3}</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>