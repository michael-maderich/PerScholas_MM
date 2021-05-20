<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ERROR</title>
</head>
<body>
	<div id="header" style="background-color:blue; height:20%;">
	<%@include file="header.html"%>
	</div>
	<div id="content" style="background-color:gray; height:70%; text-align:center;">
		<br /><h1>There was an error....<%=exception%></h1>
	</div>
	<div style="height:8%; bottom:0; position:relative;">
	<%@include file="footer.html"%>
	</div>
</body>
</html>