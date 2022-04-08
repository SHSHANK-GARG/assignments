<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" action="interest">
	<table>
	<tr>
	<td>Principal: </td>
	<td><form:input path="principal"/></td>
	</tr>
	<tr>
	<td>Rate: </td>
	<td><form:input path="rate"/></td>
	</tr>
	<tr>
	<td>Time: </td>
	<td><form:input path="time"/></td>
	</tr>
	<tr>
	<td><input type = "submit" value = "interest"/></td>
	</tr>
	</table>
	</form:form>
</body>
</html>