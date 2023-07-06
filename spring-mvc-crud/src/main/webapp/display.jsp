<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <body>
	<table border="2px">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>AGE</th>
			<th>SALARY</th>
			<th>EMAIL</th>
			<th>PASSWORD</th>
		</tr>
		<c:forEach var="teacher" items="${list}">
			<tr>
				<td>${teacher.getId()}</td>
				<td>${teacher.getName()}</td>
				<td>${teacher.getAge()}</td>
				<td>${teacher.getSal()}</td>
				<td>${teacher.getEmail()}</td>
				<td>${teacher.getPassword()}</td>
				<td><a href="getbyid?id=${teacher.getId()}">EDIT</a></td>
				<td><a href="deleteteacher?id=${teacher.getId()}">DELETE</a></td>
			</tr>
		</c:forEach>
	</table>
 
</body>
</html>